package med.voll.api.medicos;

public record ListagemDeMedicos(String nome, String crm, med.voll.api.endereco.Endereco endereco, Especialidade especialidade) {


    public ListagemDeMedicos(Medico medico){
        this(medico.getNome(), medico.getCrm(), medico.getEndereco(), Especialidade.ORTOPEDIA);
    }
}
