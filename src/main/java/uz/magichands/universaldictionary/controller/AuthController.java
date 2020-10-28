package uz.magichands.universaldictionary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.magichands.universaldictionary.payload.RegisterDto;
import uz.magichands.universaldictionary.service.UserService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService service;

    @PostMapping("/login")
    public ResponseEntity<?> login() {
        return null;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterDto registerDto) {

        return new ResponseEntity<>(service.saveUser(registerDto), HttpStatus.CREATED);
    }
}
