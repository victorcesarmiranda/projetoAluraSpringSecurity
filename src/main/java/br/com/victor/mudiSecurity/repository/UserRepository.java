package br.com.victor.mudiSecurity.repository;

import br.com.victor.mudiSecurity.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername(String username);

}
