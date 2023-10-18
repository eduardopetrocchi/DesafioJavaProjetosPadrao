package desafio.gerenciadortarefas.gerenciador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import desafio.gerenciadortarefas.gerenciador.tarefa.Tarefa;

public class GerenciadorFacade {
    private List<Tarefa> listaTarefas;

    public GerenciadorFacade() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Long id, String titulo, String tarefa, Date data) {
        Tarefa novaTarefa = new Tarefa(id, titulo, tarefa, data);
        listaTarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void removerTarefa(int idTarefa) {
        
    }
}
