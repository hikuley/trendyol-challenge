package com.trendyol.challenge;

import java.text.NumberFormat;
import java.util.Scanner;

public class ApplicationMain {

    public static void main(String[] args) {
        NumberConvertToText c = NumberConvertToText.getInstance();
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Bir değer giriniz:");
        n = s.nextInt();
        System.out.println(NumberFormat.getInstance().format(n) + "='" + c.convert(n) + "'");

    }

}
