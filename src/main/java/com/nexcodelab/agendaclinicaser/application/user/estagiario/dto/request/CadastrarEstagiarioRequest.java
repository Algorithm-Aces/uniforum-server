package com.nexcodelab.agendaclinicaser.application.user.estagiario.dto.request;

import com.nexcodelab.agendaclinicaser.application.user.persona.dto.request.CadastrarPersonaRequest;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class CadastrarEstagiarioRequest extends CadastrarPersonaRequest {
    @Email @NotNull @Size(max = 90)
    String username;

    @NotEmpty @Size(max = 90)
    String password;

    @NotNull
    Long perfilAcessoId;

    Integer horasRequeridas;
}
