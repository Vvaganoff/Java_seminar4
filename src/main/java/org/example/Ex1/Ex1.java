package org.example.Ex1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        Map<Integer, String> db = new HashMap<>();
        for (int i = 0; i < strArray.length; i++) {
            db.put(i, strArray[i]);
        }
        for (int i= db.size()-1; i>=0; i--) {
            System.out.print(db.get(i) + " ");
        }
    }
}
