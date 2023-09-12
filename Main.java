package CentralDeNotificacoes;

public class Main {
    public static void main(String[] args) {
        CentralDeNotificacoes notificacao = new CentralDeNotificacoes(new Sms());

        notificacao.notificar("Ola mundo");

    }
}
