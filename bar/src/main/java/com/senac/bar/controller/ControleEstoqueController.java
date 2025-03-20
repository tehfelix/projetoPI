package com.senac.bar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControleEstoqueController {

    @GetMapping("/controle-estoque")
    public String controleEstoque() {
        return "controle-estoque"; // Carrega o arquivo templates/controle-estoque.html
    }
}
