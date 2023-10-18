package desafio.gerenciadortarefas.gerenciador;

public class Gerenciador {
    private static Gerenciador gerenciadorsingleton;

    public static Gerenciador getInstancia(){
        if(gerenciadorsingleton == null){
            gerenciadorsingleton = new Gerenciador();
        }
        return gerenciadorsingleton;
    }
}
