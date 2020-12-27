package br.com.victor.mudiSecurity.controller;

import br.com.victor.mudiSecurity.model.*;
import br.com.victor.mudiSecurity.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.security.*;
import java.util.*;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("pedidos")
    public String home(Model model, Principal principal) {
        List<Pedido> pedidos = pedidoRepository.findAllByUserUsername(principal.getName());
        model.addAttribute("pedidos", pedidos);
        return "usuario/home";
    }

    @GetMapping("pedidos/{statusPedido}")
    public String porStatus(@PathVariable String statusPedido, Model model, Principal principal) {
        List<Pedido> pedidos = pedidoRepository.findAllByStatusPedidoAndUserUsername(StatusPedido.valueOf(statusPedido.toUpperCase()), principal.getName());
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("statusPedido", statusPedido);
        return "usuario/home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError() {
        return "redirect:/usuario/home";
    }
}
