package facade;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "=================================="
        );

        System.out.println(
                " FACADE - HAMBURGUERIA "
        );

        System.out.println(
                "=================================="
        );

        HamburgueriaFacade facade =
                new HamburgueriaFacade();

        facade.realizarPedido(
                "Tiago",
                "X-Bacon",
                35.0
        );

        System.out.println(
                "\n=================================="
        );

        System.out.println(
                " Sistema executado com sucesso!"
        );

        System.out.println(
                "=================================="
        );
    }
}