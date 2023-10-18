package desafio.gerenciadortarefas.gerenciador.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.gerenciadortarefas.gerenciador.service.TarefaService;
import desafio.gerenciadortarefas.gerenciador.tarefa.Tarefa;

@RestController
@RequestMapping
public class TarefasRestController {
    @Autowired
    private TarefaService tarefaService;

    @PostMapping("/{id}")
    public ResponseEntity<Tarefa> inserir(@RequestBody Tarefa tarefa) {
        tarefaService.inserir(tarefa);
        return ResponseEntity.ok(tarefa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar (@PathVariable Long id) {
        tarefaService.deletar(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarId (@PathVariable Long id){
        return ResponseEntity.ok(tarefaService.buscarId(id));
    }

    @GetMapping
    public ResponseEntity<Iterable<Tarefa>> listarTarefas(){
        return ResponseEntity.ok(tarefaService.listarTarefas());
    }

    

}
