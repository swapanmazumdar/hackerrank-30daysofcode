package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }

        while (in.hasNext()) {
            String name = in.next();
            Integer phone = phoneBook.get(name);
            System.out.println(phone != null ? name + "=" + phone : "Not found");
        }

        in.close();
    }
}