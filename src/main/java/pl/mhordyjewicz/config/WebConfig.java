package pl.mhordyjewicz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import pl.mhordyjewicz.converter.LocalDateConverter;
import pl.mhordyjewicz.converter.RewardTypeConverter;
import pl.mhordyjewicz.converter.TagConverter;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "pl.mhordyjewicz")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter
{

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {
        configurer.enable();
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer)
    {
//        super.configureContentNegotiation(configurer);
        configurer.defaultContentType(MediaType.TEXT_HTML);
    }

    @Bean
    public ViewResolver viewResolver()
    {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public Converter tagConverter()
    {
        return new TagConverter();
    }

    @Bean
    public Converter rewardTypeConverter()
    {
        return new RewardTypeConverter();
    }

    @Bean
    public Converter localDateConverter()
    {
        return new LocalDateConverter();
    }

    @Override
    public void addFormatters(FormatterRegistry registry)
    {
        registry.addConverter(tagConverter());
        registry.addConverter(rewardTypeConverter());
        registry.addConverter(localDateConverter());
    }

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver()
    {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(2097152); // 2 MB
        return multipartResolver;
    }

//    @Bean(name="mailSender")
//    public MailSender javaMailService() {
//        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
//        javaMailSender.setHost("smtp.gmail.com");
//        javaMailSender.setPort(587);
//        javaMailSender.setProtocol("smtp");
//        javaMailSender.setUsername("email@gmail.com");
//        javaMailSender.setPassword("password");
//        Properties mailProperties = new Properties();
//        mailProperties.put("mail.smtp.auth", "true");
//        mailProperties.put("mail.smtp.starttls.enable", "starttls");
//        mailProperties.put("mail.smtp.debug", "true");
//        javaMailSender.setJavaMailProperties(mailProperties);
//        return javaMailSender;
//    }
}
