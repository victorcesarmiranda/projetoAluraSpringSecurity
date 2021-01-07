package br.com.victor.mudiSecurity.api;

import br.com.victor.mudiSecurity.model.*;
import br.com.victor.mudiSecurity.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosRest {

    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("aguardando")
    public List<Pedido> getPedidiosAguardandoOferta() {

        Sort sort = Sort.by("id").descending();
        PageRequest paginacao = PageRequest.of(0, 10, sort);

        return pedidoRepository.findByStatusPedido(StatusPedido.AGUARDANDO, paginacao);
    }
}
