package br.com.victor.mudiSecurity.repository;

import br.com.victor.mudiSecurity.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByStatusPedido(StatusPedido aguardando);

    List<Pedido> findAllByUserUsername(String username);
}
