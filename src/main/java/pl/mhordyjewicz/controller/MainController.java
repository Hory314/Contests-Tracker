package pl.mhordyjewicz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mhordyjewicz.service.ContestService;

import javax.servlet.http.HttpServletRequest;

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

    @GetMapping("/activate")
    public String activate(HttpServletRequest request, @RequestParam String hash)
    {
        contestService.activate(hash);
        return "redirect:/";
    }
}
