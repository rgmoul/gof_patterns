package gof_patterns.prototype;

import static org.junit.jupiter.api.Assertions.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the ComputerFactory class, which uses the Prototype
 * pattern.
 */
public class PrototypeTest {

    @Test
    void test() throws UnknownHostException {
        ComputerFactory factory = new ComputerFactory();

        Computer clientPrototype = new Computer();
        clientPrototype.setArchitecture("Arm64");
        clientPrototype.setOs("MacOS");
        factory.setClient(clientPrototype);

        Computer serverPrototype = new Computer();
        serverPrototype.setArchitecture("x86-64");
        serverPrototype.setOs("Linux");
        factory.setServer(serverPrototype);

        Computer client = factory.newClient();
        client.setAddress(InetAddress.getByName("192.168.2.1"));

        assertEquals(clientPrototype.getArchitecture(), client.getArchitecture());
        assertEquals(clientPrototype.getOs(), client.getOs());
        assertNotEquals(clientPrototype.getAddress(), client.getAddress());
        
        System.out.println("New client arch: " + client.getArchitecture());
        System.out.println("New client os: " + client.getOs());
        System.out.println("New client address: " + client.getAddress());


        Computer server = factory.newServer();
        server.setAddress(InetAddress.getByName("192.168.0.1"));

        assertEquals(serverPrototype.getArchitecture(), server.getArchitecture());
        assertEquals(serverPrototype.getOs(), server.getOs());
        assertNotEquals(serverPrototype.getAddress(), server.getAddress());

        System.out.println();
        System.out.println("New server arch: " + server.getArchitecture());
        System.out.println("New server os: " + server.getOs());
        System.out.println("New server address: " + server.getAddress());
    }

}
