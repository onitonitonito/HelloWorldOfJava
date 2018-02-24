package com.company;

public class Main {

    public static void main(String[] args) {
	// swith, case; default, break 등을 사용할 수 있음.

    int value = 2;
        switch(value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("그외 다른숫자...");
                break;
        }

    String nameString = "A";
        switch(nameString) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
        }


    }
}
