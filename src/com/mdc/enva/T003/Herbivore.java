package com.mdc.enva.T003;

public interface Herbivore {
    public void eatPlants();
    default int getPI() {
        return 13;
    }
}
