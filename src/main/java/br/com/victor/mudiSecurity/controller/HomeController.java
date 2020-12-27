package br.com.victor.mudiSecurity.controller;

import br.com.victor.mudiSecurity.model.*;
import br.com.victor.mudiSecurity.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.*;
import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public String home(Model model) {
        List<Pedido> pedidos = pedidoRepository.findByStatusPedido(StatusPedido.ENTREGUE);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
