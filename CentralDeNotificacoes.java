package CentralDeNotificacoes;

public class CentralDeNotificacoes {
    private TipoNotificacao tipo;

    public CentralDeNotificacoes(TipoNotificacao tipo) {
        this.tipo = tipo;
    }

    public void notificar(String mensagem){
        tipo.notificar(mensagem);
    }
}
