package med.voll.api.controller;

import med.voll.api.medicos.DadosCadastrar;
import med.voll.api.medicos.ListagemDeMedicos;
import med.voll.api.medicos.Medico;
import med.voll.api.medicos.MedicoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicosController {


    private final MedicoRepository repository;

    public MedicosController(MedicoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastrar dados){
    repository.save(new Medico(dados));

    }


    @GetMapping
    public Page<ListagemDeMedicos> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(ListagemDeMedicos::new);
    }
}
