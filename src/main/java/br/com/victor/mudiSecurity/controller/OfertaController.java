package br.com.victor.mudiSecurity.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/oferta")
public class OfertaController {

    @GetMapping
    public String getFormularioParaOferta() {
        return "oferta/home";
    }
}
