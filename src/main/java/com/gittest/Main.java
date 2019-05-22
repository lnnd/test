package com.gittest;

public class Main {

    private int i;
    private int j;

    private String text;

    public static void main(String[] args) {
        System.out.println("master");

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Main{" +
                "text='" + text + '\'' +
                '}';
    }
}
