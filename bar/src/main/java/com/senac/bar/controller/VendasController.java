package com.senac.bar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VendasController {

    @GetMapping("/vendas")
    public String vendas() {
        return "vendas"; // Retorna a página vendas.html
    }
}
