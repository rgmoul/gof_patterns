package gof_patterns.prototype;

import java.net.InetAddress;

/**
 * Represents a computer - ConcretePrototype in Prototype pattern.
 */
public final class Computer {
    private String name;
    private String architecture;
    private String os;
    private InetAddress address;

    /**
     * Constructor.
     */
    public Computer() {}
    
    /**
     * Copy constructor - use of clone is discouraged.
     * @param name the computer name
     * @param architecture the architecture
     * @param os the os
     * @param address the inet address
     */
    private Computer(String name, String architecture, String os, InetAddress address) {
        this.name = name;
        this.architecture = architecture;
        this.os = os;
        this.address = address;
    }

    /**
     * Make a copy og this Computer.
     *
     * @return a copy of this Computer
     */
    public Computer copy() {
        return new Computer(name, architecture, os, address);
    }
    
    /**
     * Returns the address.
     *
     * @return the address
     */
    public InetAddress getAddress() {
        return address;
    }

    /**
     * Set the address.
     *
     * @param address the address to set
     */
    public void setAddress(InetAddress address) {
        this.address = address;
    }

    /**
     * Returns the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns the architecture.
     *
     * @return the architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * Sets the architecture.
     *
     * @param architecture the architecture to set
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * Returns the o/s.
     *
     * @return the o/s
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the o/s.
     *
     * @param os the o/s to set
     */
    public void setOs(String os) {
        this.os = os;
    }

}
