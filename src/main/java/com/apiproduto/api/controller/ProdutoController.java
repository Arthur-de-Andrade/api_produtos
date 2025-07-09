package com.apiproduto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.apiproduto.api.models.ProdutoRepository;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/listagem")
    public String listarProdutos() {
        return "listar";
    }
    @GetMapping("/cadastrar")
    public String cadastrarProdutos() {
        return "cadastrar";
}
}