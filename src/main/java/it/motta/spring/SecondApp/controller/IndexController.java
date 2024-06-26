package it.motta.spring.SecondApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String getWelcome(Model model) {
        model.addAttribute("intestazione", "Benvenuti nel sito aphaShop");
        model.addAttribute("saluti", "Seleziona i prodotti da acquistrare");
        return "welcome";
    }

    @GetMapping("/index")
    public String getIndex(Model model) {
        return getWelcome(model);
    }

}