package br.com.victor.mudiSecurity.controller;

import br.com.victor.mudiSecurity.dto.*;
import br.com.victor.mudiSecurity.model.*;
import br.com.victor.mudiSecurity.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.context.*;
import org.springframework.stereotype.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private UserRepository userRepository;


    @GetMapping("formulario")
    public String formulario(RequisicaoNovoPedido requisicaoNovoPedido) {
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(@Valid RequisicaoNovoPedido requisicaoNovoPedido, BindingResult result) {

        if (result.hasErrors()) {
            return "pedido/formulario";
        }

        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByUsername(username);
        Pedido pedido = requisicaoNovoPedido.toPedido();
        pedido.setUser(user);

        pedidoRepository.save(pedido);
        return "redirect:/home";
    }


}
