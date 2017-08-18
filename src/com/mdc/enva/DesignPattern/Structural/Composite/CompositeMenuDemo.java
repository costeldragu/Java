package com.mdc.enva.DesignPattern.Structural.Composite;

/**
 *
 */
public class CompositeMenuDemo {
    public static void main(String args[]) {
        Menu mainMenu = new Menu("Main","/");

        MenuItem saftyMenuItem = new MenuItem("Safty","/safety");

        mainMenu.add(saftyMenuItem);

        Menu s1 = new Menu("Second M","/second");
        mainMenu.add(s1);
        s1.add(saftyMenuItem);
        System.out.println(mainMenu);
    }
}
