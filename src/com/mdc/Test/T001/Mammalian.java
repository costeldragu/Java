package com.mdc.Test.T001;

public abstract class Mammalian implements Animal {
    private String whoami;
    protected String speak;
    @Override

    public String whoami() {
        return whoami;
    }

    /**
     * Set the animal type
     * @param type
     */
    void setType(String type) {
        whoami = type;
    }

    abstract String getRealType();

    @Override
    public String toString() {
        return "Type: " + whoami() + ", Speak:" + speak;
    }
}
