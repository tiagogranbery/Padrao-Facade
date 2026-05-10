package facade;

public class Entrega {

    public void enviarPedido(String cliente) {

        System.out.println(
                "Pedido saiu para entrega: " + cliente
        );
    }
}