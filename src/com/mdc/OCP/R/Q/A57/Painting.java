package com.mdc.OCP.R.Q.A57;

public class Painting {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Painting obj1 = new Painting();
        Painting obj2 = new Painting();
        obj1.setType(null);
        obj2.setType("Fresco");
        System.out.print(obj1.getType() + " : " + obj2.getType());
    }
}
