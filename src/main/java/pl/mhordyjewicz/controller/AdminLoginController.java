package pl.mhordyjewicz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.mhordyjewicz.service.AdminLoginService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/adminpanel")
public class AdminLoginController
{
    @Autowired
    AdminLoginService adminLoginService;

    @GetMapping("/login")
    public String prepareLogin()
    {
        return "/adminpanel/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session)
    {
        session.invalidate();
        return "redirect:/adminpanel/login";
    }
}
