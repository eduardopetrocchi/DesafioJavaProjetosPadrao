package desafio.gerenciadortarefas.gerenciador.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.gerenciadortarefas.gerenciador.service.TarefaService;
import desafio.gerenciadortarefas.gerenciador.tarefa.Tarefa;
import desafio.gerenciadortarefas.gerenciador.tarefa.TarefaRepository;

@Service
public class TarefaServiceImpl implements TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;
    
    @Override
    public Iterable<Tarefa> listarTarefas(){
        return tarefaRepository.findAll();
    }

    @Override
    public Tarefa buscarId(Long id){
        Optional <Tarefa> tarefa = tarefaRepository.findById(id);
        return tarefa.get();
    }

    @Override
    public void inserir(Tarefa tarefa) {
        inserirTarefa(tarefa);
    }

    private Tarefa inserirTarefa(Tarefa tarefa){
        Tarefa novaTarefa = tarefaRepository.save(tarefa);
        return novaTarefa;
    }

    @Override
    public void deletar (Long id) {
        tarefaRepository.deleteById(id);
    }
}