package pl.mhordyjewicz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminpanel")
public class AdminPanelController
{
    @GetMapping
    public String adminPanel(Model model)
    {
        model.addAttribute("a", null);
        return "adminpanel/panel";
    }
}
