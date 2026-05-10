package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveCriarFacade() {

        HamburgueriaFacade facade =
                new HamburgueriaFacade();

        assertNotNull(facade);
    }
}