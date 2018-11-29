package pl.mhordyjewicz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mhordyjewicz.service.ContestService;

@Controller
public class MainController
{
    @Autowired
    ContestService contestService;

    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("contests", contestService.getAllAcceptedContests());
        return "contest/main";
    }
}
