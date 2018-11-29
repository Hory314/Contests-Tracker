package pl.mhordyjewicz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.mhordyjewicz.dto.ContestDTO;
import pl.mhordyjewicz.service.ContestService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/adminpanel")
public class AdminPanelController
{
    @Autowired
    ContestService contestService;

    @GetMapping
    public String adminPanel(Model model)
    {
        model.addAttribute("contests", contestService.getAllContests());
        return "adminpanel/panel";
    }

    @GetMapping("/toggle/{id:[0-9]+}")
    public String toggleAccepted(@PathVariable Long id)
    {
        contestService.toggleAccepted(id);
        return "redirect:/adminpanel#contest-" + id;
    }

    @GetMapping("/delete/{id:[0-9]+}")
    public String delete(@PathVariable Long id)
    {
        contestService.delete(id);
        return "redirect:/adminpanel";
    }

    @GetMapping("/edit/{id:[0-9]+}")
    public String prepareEdit(Model model, @PathVariable Long id)
    {
        model.addAttribute("newContest", contestService.getContestDTO(id)/*new ContestDTO()*/);
        return "contest/add";
    }

    @PostMapping("/edit/{id:[0-9]+}")
    public String edit(HttpServletRequest request,
                       @PathVariable Long id,
                       @ModelAttribute("newContest") @Valid ContestDTO contestDTO,
                       BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
        {
            return "contest/add";
        }

        contestService.save(contestDTO, request);
        return "redirect:/adminpanel#contest-" + id;
    }
}
