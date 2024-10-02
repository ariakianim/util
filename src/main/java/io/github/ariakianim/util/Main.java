package io.github.ariakianim.util;

public class Main {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(Util.padStart(string, 10, 'x'));
        System.out.println(Util.padStart(string, 10));
        System.out.println(Util.padEnd(string, 10, 'x'));
        System.out.println(Util.padEnd(string, 10));
    }
}
