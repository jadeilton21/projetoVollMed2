package med.voll.api.medicos;

import med.voll.api.endereco.DadosEdereco;

public record DadosCadastrar(String nome, String email, String crm, Especialidade especialidade, DadosEdereco endereco) {
}
