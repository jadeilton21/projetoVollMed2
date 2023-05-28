package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEdereco;

public record DadosAtualizarPacientes(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEdereco endereco) {
}
