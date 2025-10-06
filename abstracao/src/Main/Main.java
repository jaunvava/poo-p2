package Main;

import Model.Contato;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato(
                "Didi",
                "pi",
                "123456789",
                "teste@gmai.com"
                );
        Contato falhar = new Contato(
                "Garoto",
                "",
                "911",
                "massa"
        );

    }
}
