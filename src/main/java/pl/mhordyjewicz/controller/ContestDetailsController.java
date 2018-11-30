package pl.mhordyjewicz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.mhordyjewicz.service.ContestService;

@Controller
public class ContestDetailsController
{
    @Autowired
    ContestService contestService;

    @GetMapping("/contest/{id:[0-9]+}/{dummy:.+}")
    public String home(@PathVariable Long id, Model model)
    {
        model.addAttribute("contest", contestService.getContest(id));
        return "contest/details";
    }
}
