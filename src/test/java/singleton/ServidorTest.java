package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServidorTest {

    @Test
    public void deveRetornarHostnameServidor() {
        Servidor.getServidor().setHostnameServidor("NightCity");
        assertEquals("NightCity", Servidor.getServidor().getHostnameServidor());
    }
}