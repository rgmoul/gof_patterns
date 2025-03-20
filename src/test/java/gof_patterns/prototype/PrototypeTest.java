/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
