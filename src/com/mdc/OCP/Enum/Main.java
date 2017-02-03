package com.mdc.OCP.Enum;

/**
 * Created by cdragu on 02.02.2017.
 */
public class Main {
    public enum Season {
        WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
        private String expectedVisitors;

        private Season(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }

        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }
    }

    public static void main(String[] args) {

//        Season summer = Season.FALL;
//        switch (summer) {
//            case WINTER:
//                System.out.println("Get out the sled!");
//                break;
//            case SUMMER:
//                System.out.println("Time for the pool!");
//                break;
//            default:
//                System.out.println("Is it summer yet?");
//        }

        System.out.println("exit");
    }
}
