package org.example.Ex2;

import java.util.*;

public class Ex2 {
    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p>
     * An input string is valid if:
     * <p>
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "()"
     * Output: true
     */

    public static void main(String[] args) {
        String s = "(,),{,},[,]";
        String[] strArray = s.split(",");
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strArray.length; i++) {
            if (i % 2 == 0) {
                map.put(strArray[i], strArray[i + 1]);
            }
        }
        System.out.println("Введите скобочки:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] scannerArray = str.split("");
        boolean a = false;
        if (map.containsKey(scannerArray[0]) && map.get(scannerArray[0]).equals(scannerArray[1])) {
            a = true;
        }
        System.out.println(a);
    }
}
