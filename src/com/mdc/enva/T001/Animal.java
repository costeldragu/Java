package com.mdc.enva.T001;

/**
 * The animal interface
 */
public interface Animal {
    /**
     * All the classes should implement how
     * @return
     */
    String whoami();

    default String speak() {
        return "Unknown";
    }
}
