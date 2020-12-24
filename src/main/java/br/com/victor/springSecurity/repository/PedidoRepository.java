package br.com.victor.springSecurity.repository;

import br.com.victor.springSecurity.model.Pedido;
import br.com.victor.springSecurity.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByStatusPedido(StatusPedido aguardando);
}
