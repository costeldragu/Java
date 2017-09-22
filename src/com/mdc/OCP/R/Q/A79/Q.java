package com.mdc.OCP.R.Q.A79;

public class Q {
    public static void main(String[] args) {
        String color = "Teal";
        switch (color) {
            case "Red":
                System.out.println("Found red");
            case "Blue":
                System.out.println("Found Blue");
                break;
            case "Teal":
                System.out.println("Found Teal");
                break;
            default:
                System.out.println("Found Default");
        }
    }
}
