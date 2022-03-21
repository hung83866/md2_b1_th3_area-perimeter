package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        float widght = scanner.nextFloat();
        System.out.println("nhập chiều cao");
        float height = scanner.nextFloat();
        float area = widght * height;
        float perimeter = 2 * (widght + height);
        System.out.println("area = "+area);
        System.out.println("perimeter = "+perimeter);
    }
}
