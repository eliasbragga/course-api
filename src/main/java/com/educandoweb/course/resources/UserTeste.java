package com.educandoweb.course.resources;


import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class UserTeste {

    @GetMapping
    public ResponseEntity<User> teste() {

        User u = new User(1L, "Natabia", "elias@gmail.com", "88 9999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
