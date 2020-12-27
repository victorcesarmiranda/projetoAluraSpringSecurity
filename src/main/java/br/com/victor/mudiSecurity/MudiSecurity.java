package br.com.victor.mudiSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.*;

@EnableCaching
@SpringBootApplication
public class MudiSecurity {

    public static void main(String[] args) {
        SpringApplication.run(MudiSecurity.class, args);
    }

}
