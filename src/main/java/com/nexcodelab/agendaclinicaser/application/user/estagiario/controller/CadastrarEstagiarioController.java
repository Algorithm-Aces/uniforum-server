//package com.nexcodelab.agendaclinicaser.application.user.estagiario.controller;
//
//import com.nexcodelab.agendaclinicaser.application.user.colaborador.dto.request.CadastrarColaboradorRequest;
//import com.nexcodelab.agendaclinicaser.application.user.colaborador.model.Colaborador;
//import com.nexcodelab.agendaclinicaser.application.user.estagiario.dto.request.CadastrarEstagiarioRequest;
//import com.nexcodelab.agendaclinicaser.application.user.estagiario.model.Estagiario;
//import com.nexcodelab.agendaclinicaser.application.user.persona.service.CadastrarPersonaUseCase;
//import com.nexcodelab.agendaclinicaser.application.user.usuario.model.Usuario;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping
//@RequiredArgsConstructor
//public class CadastrarEstagiarioController {
//
//    private final CadastrarPersonaUseCase<Estagiario> service;
//
//    @PostMapping("/estagiario")
//    public ResponseEntity<Void> execute(@Valid @RequestBody CadastrarEstagiarioRequest request) {
//        service.execute(request);
//
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
//}
