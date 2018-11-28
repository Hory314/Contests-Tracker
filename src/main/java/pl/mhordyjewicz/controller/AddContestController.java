package pl.mhordyjewicz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mhordyjewicz.dto.ContestDTO;
import pl.mhordyjewicz.service.ContestService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/add")
public class AddContestController
{
    @Autowired
    ContestService contestService;

    @GetMapping
    public String prepareNewContest(Model model)
    {
        model.addAttribute("newContest", new ContestDTO());
        return "contest/add";
    }

    @PostMapping
    public String addContest(HttpServletRequest request, @ModelAttribute("newContest") @Valid ContestDTO contestDTO, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
        {
            return "contest/add";
        }

        contestService.save(contestDTO,request);
        return "redirect:/";
    }

}
