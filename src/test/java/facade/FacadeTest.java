package facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    void deveExecutarPedidoSemErro() {

        HamburgueriaFacade facade =
                new HamburgueriaFacade();

        facade.realizarPedido(
                "Teste",
                "X-Tudo",
                40
        );
    }
}