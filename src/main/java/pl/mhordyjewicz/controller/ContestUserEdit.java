package pl.mhordyjewicz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.mhordyjewicz.dto.ContestDTO;
import pl.mhordyjewicz.entity.Contest;
import pl.mhordyjewicz.service.ContestService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/contest/edit")
public class ContestUserEdit
{
    @Autowired
    ContestService contestService;

    @GetMapping
    public String prepareEdit(Model model, @RequestParam String hash)
    {
        ContestDTO contestDTO = contestService.getContestDTO(hash);
        if (contestDTO == null)
        {
            return "redirect:/";
        }
        model.addAttribute("newContest", contestDTO);
        return "contest/add";
    }

    @PostMapping
    public String edit(HttpServletRequest request,
                       @ModelAttribute("newContest") @Valid ContestDTO contestDTO,
                       BindingResult bindingResult, @RequestParam String hash)
    {

        if (bindingResult.hasErrors())
        {
            return "contest/add";
        }
        contestDTO.setId(contestService.getContestDTO(hash).getId()); // get ID
        contestService.save(contestDTO, request);
        return "redirect:/";
    }
}
