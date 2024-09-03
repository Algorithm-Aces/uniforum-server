package com.nexcodelab.agendaclinicaser.application.user.supervisor.model;

import com.nexcodelab.agendaclinicaser.application.user.persona.model.Persona;
import com.nexcodelab.agendaclinicaser.application.user.usuario.model.Usuario;
import com.nexcodelab.agendaclinicaser.shared.enums.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor @AllArgsConstructor
public class Supervisor extends Persona {

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Supervisor(Usuario usuario, String nome, String sobrenome, LocalDate dataNascimento, Sexo sexo, String email) {
        super(nome, sobrenome, dataNascimento, sexo, email);
        this.usuario =  usuario;
    }
}
