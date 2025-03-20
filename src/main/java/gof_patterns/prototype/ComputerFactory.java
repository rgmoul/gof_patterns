/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
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


/**
 * A factory for creating computers, using the Prototype pattern - Client in the
 * Prototype pattern.  Uses multiple instances of the Computer
 * (ConcretePrototype) class to provide prototypical objects.
 */
public final class ComputerFactory {
    /**
     * Sets the prototype for all client computers.
     *
     * @param clientPrototype the prototypical client computer
     */
     public void setClient(final Computer clientPrototype) {
         client = clientPrototype;
     }

     /**
      * Sets the prototype for all server computers.
      *
      * @param serverPrototype the prototypical server computer
      */
     public void setServer(final Computer serverPrototype) {
         server = serverPrototype;
     }

     /**
      * Create a new client computer, from the client prototype.
      *
      * @return a new client computer
      */
     public Computer newClient() {
        Computer c = null;
        if (client != null) {
            c = client.copy();
        }
        return c;
     }

     /**
      * Create a new server computer, from the server prototype.
      *
      * @return a new server computer
      */
     public Computer newServer() {
         Computer s = null;
         if (server != null) {
             s = server.copy();
         }
         return s;
      }

     private Computer client;
     private Computer server;
}
