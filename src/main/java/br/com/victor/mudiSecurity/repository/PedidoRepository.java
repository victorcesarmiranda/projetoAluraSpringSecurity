package br.com.victor.mudiSecurity.repository;

import br.com.victor.mudiSecurity.model.*;
import org.springframework.cache.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Cacheable("StatusPedido")
    List<Pedido> findByStatusPedido(StatusPedido statusPedido, Pageable sort);

    List<Pedido> findAllByUserUsername(String username);

    List<Pedido> findAllByStatusPedidoAndUserUsername(StatusPedido statusPedido, String username);

//    Utilizando o @Query
//    @Query("select p from Pedido p join  p.user u where u.username = :username and p.statusPedido = :statusPedido")
//    List<Pedido> findByUserUsernameAndStatusPedido(@Param("username") String username, @Param("statusPedido") StatusPedido statusPedido);

}
