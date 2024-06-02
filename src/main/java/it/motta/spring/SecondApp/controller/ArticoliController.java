package it.motta.spring.SecondApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.motta.spring.SecondApp.domain.Articoli;
import it.motta.spring.SecondApp.service.ArticoliService;

@Controller
@RequestMapping("/articoli")
public class ArticoliController {

    @Autowired
    private ArticoliService articoliService;

    @GetMapping("/cerca/{filter}")
    public String getArticoliByFilter(@PathVariable("filter") String filter, Model model) {
        List<Articoli> articoli = articoliService.SelArticoliByFilter(filter);
        model.addAttribute("titolo", "Lista articoli");
        model.addAttribute("NumArt", articoli.size());
        model.addAttribute("Articoli", articoli);
        return "articoli";
    }

    @GetMapping("/cerca")
    public String getArticoliByFilter(Model model) {
        return getArticoliByFilter("", model);
    }

}
