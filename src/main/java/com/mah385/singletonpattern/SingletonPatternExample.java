package com.mah385.singletonpattern;

public class SingletonPatternExample {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "================================================================" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "***Singleton Pattern Demo***");
        System.out.println("Trying to make a captain for your team: ");
        //Constructor is private. We cannot use "new" here.
        //Captain caption1 = new Captain(); //error
        Captain captain2 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain3 = Captain.getCaptain();
        if (captain2 == captain3) {
            System.out.println("captain2 and captain3 are same instance." + ANSI_RESET);
        }
        System.out.println(ANSI_BLUE + "================================================================" + ANSI_RESET);
    }

}

