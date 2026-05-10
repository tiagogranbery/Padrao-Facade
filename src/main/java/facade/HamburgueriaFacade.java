package facade;

public class HamburgueriaFacade {

    private Cozinha cozinha;
    private Pagamento pagamento;
    private Entrega entrega;

    public HamburgueriaFacade() {

        cozinha = new Cozinha();
        pagamento = new Pagamento();
        entrega = new Entrega();
    }

    public void realizarPedido(
            String cliente,
            String hamburguer,
            double valor
    ) {

        System.out.println(
                "\nIniciando pedido..."
        );

        cozinha.prepararHamburguer(hamburguer);

        pagamento.realizarPagamento(valor);

        entrega.enviarPedido(cliente);

        System.out.println(
                "Pedido finalizado com sucesso!"
        );
    }
}