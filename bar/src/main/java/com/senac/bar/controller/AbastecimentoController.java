package com.senac.bar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AbastecimentoController {

    @GetMapping("/abastecimento")
    public String abastecimento() {
        return "abastecimento"; // Carrega templates/abastecimento.html
    }
}
