package io.github.ariakianim.util;

public class Util {

    public static String padStart(String s, int length, char c) {
        int n = length - s.length();
        if (n > 0) {
            s = String.valueOf(c).repeat(n) + s;
        }
        return s;
    }

    public static String padStart(String s, int length) {
        return padStart(s, length, ' ');
    }

    public static String padEnd(String s, int length, char c) {
        int n = length - s.length();
        if (n > 0) {
            s = s + String.valueOf(c).repeat(n);
        }
        return s;
    }

    public static String padEnd(String s, int length) {
        return padEnd(s, length, ' ');
    }

}