package desafio.gerenciadortarefas.gerenciador.service;

import desafio.gerenciadortarefas.gerenciador.tarefa.Tarefa;

public interface TarefaService {
    Iterable<Tarefa> listarTarefas();

    Tarefa buscarId(Long id);

    void inserir (Tarefa tarefa);

    void deletar (Long id);
}
