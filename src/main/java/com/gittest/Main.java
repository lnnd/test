package com.gittest;

public class Main {

    private String text;

    public static void main(String[] args) {
        System.out.println("master");

    }

    @Override
    public String toString() {
        return "Main{" +
                "text='" + text + '\'' +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
