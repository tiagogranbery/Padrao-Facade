package facade;

public class Pagamento {

    public void realizarPagamento(double valor) {

        System.out.println(
                "Pagamento aprovado: R$ " + valor
        );
    }
}