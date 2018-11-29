package pl.mhordyjewicz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mhordyjewicz.dto.AdminDTO;
import pl.mhordyjewicz.service.AdminLoginService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/adminpanel")
public class AdminLoginController
{
    @Autowired
    AdminLoginService adminLoginService;

    @GetMapping("/login")
    public String prepareLogin(Model model)
    {
        model.addAttribute("adminDTO", new AdminDTO());
        return "/adminpanel/login";
    }

   /* @PostMapping("/login")
    public String loginAdmin(Model model, @ModelAttribute("adminDTO") @Valid AdminDTO adminDTO, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "/adminpanel/login";
        }

//        boolean validCredentials = loginService.checkCredentials(adminDTO.getLogin(), adminDTO.getPassword());
//        if (!validCredentials) {
//            bindingResult.rejectValue("bad-login","","Login i/lub hasło niepoprawne");
//            return "/adminpanel/login";
//        }
//
//        UserDTO admin = loginService.login(form.getLogin(), form.getPassword());
//        session.setAttribute("admin", admin);

        return "redirect:/adminpanel";
    }*/

    @GetMapping("/logout")
    public String logout(HttpSession session)
    {
        session.invalidate();
        return "redirect:/adminpanel/login";
    }
}
