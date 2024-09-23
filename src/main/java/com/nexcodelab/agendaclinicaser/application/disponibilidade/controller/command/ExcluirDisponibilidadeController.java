package com.nexcodelab.agendaclinicaser.application.disponibilidade.controller.command;

import com.nexcodelab.agendaclinicaser.application.disponibilidade.service.ExcluirDisponibilidadeUseCase;
import com.nexcodelab.agendaclinicaser.core.security.annotation.RolesAllowed;
import com.nexcodelab.agendaclinicaser.core.security.enums.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExcluirDisponibilidadeController {

    private final ExcluirDisponibilidadeUseCase service;

    @RolesAllowed(accessLevel = AccessLevel.ADMIN)
    @DeleteMapping("/disponibilidade/{id}")
    public ResponseEntity<Void> execute(@PathVariable Long id){
        service.execute(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
