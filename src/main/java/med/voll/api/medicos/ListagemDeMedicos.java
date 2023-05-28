package med.voll.api.medicos;

public record ListagemDeMedicos(Long id, String nome, String telefone, med.voll.api.endereco.Endereco crm, String endereco, Especialidade especialidade) {


    public ListagemDeMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEndereco(), medico.getTelefone(), Especialidade.ORTOPEDIA);
    }
}
