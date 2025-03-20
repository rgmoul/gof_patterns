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
