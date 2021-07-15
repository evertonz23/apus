package br.com.cwi.apus.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class PasswordController {

    @Value("${myapp.password}")
    private String pass;

    @GetMapping
    public String password() {
        return pass;
    }
}
