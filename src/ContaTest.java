import junit.extensions.TestSetup;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Conta conta = new Conta();

    public ContaTest(){

    }

    @org.junit.jupiter.api.Test
    void deposito() {
        assertTrue(conta.deposito(100));
        assertFalse(conta.deposito(0));
        assertFalse(conta.deposito(-100));
    }

    @org.junit.jupiter.api.Test
    void saque() {
    }

    @org.junit.jupiter.api.Test
    void saldo() {

    }
}