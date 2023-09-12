package CentralDeNotificacoes;

public class Main {
    public static void main(String[] args) {
        CentralDeNotificacoes notificacao = new CentralDeNotificacoes(new Email());

        notificacao.notificar("Olá, você está sendo notificado por email!");

    }
}
