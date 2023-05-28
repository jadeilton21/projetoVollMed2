package med.voll.api.medicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEdereco;

public record DadosAtualizarMedicos(
        @NotNull
        Long id,
        String nome,

        String telefone,
        DadosEdereco endereco) {
}
