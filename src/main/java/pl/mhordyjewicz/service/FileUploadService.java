package pl.mhordyjewicz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.lang.RandomStringUtils;

@Service
@Transactional
public class FileUploadService
{

    //
//    ServletContext cl = ContextLoader.getCurrentWebApplicationContext().getServletContext();
//    private final String absolutePath = "";//ContextLoader.getCurrentWebApplicationContext().getServletContext().getRealPath("");
//
//    private final Path rootLocation = Paths.get(absolutePath+"/upload-dir");
//    @Autowired
//    HttpServletRequest request;

    private Path rootLocation;
    private String uploadDir = "/upload-dir";

    private void prepareDirectory(HttpServletRequest request)
    {
        this.rootLocation = Paths.get(request.getServletContext().getRealPath(uploadDir));
        if (!Files.exists(rootLocation))
        {
            try
            {
                Files.createDirectory(rootLocation);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param file    MultipartFile for save
     * @param request HttpServletRequest
     * @return path and filename to file on the server
     * @throws IOException
     */
    public String saveImage(MultipartFile file, HttpServletRequest request) throws Exception
    {
        System.out.println("Zapis pliku");
        prepareDirectory(request);

        String imagePathOnServer = null;

        String filename = StringUtils.cleanPath(file.getOriginalFilename());

        String generatedFileName = RandomStringUtils.randomAlphanumeric(8) + "-" + filename;
        try
        {
            InputStream inputStream = file.getInputStream();

            Files.copy(inputStream, this.rootLocation.resolve(generatedFileName), StandardCopyOption.REPLACE_EXISTING);
            inputStream.close();
        }
        catch (Exception e)
        {
            throw new Exception("Failed to store file " + filename, e);
        }
        finally
        {
            imagePathOnServer = uploadDir + "/" + generatedFileName;
        }
        return imagePathOnServer;
    }


}
