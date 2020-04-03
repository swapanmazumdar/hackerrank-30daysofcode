package day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            if(((k-1)|k) > n && k%2==0){
                System.out.println(k-2);
            }else{
                System.out.println(k-1);
            }
        }
    }


    private static int getMaxPossible(List<Integer> allSum, int k) {
        int num = allSum.get(0);
        for (int i = 0; i < allSum.size(); i++) {
            int temp = allSum.get(i);
            if (temp < k) {
                num = temp;
            }
            if (temp >= k) {
                break;
            }
        }
        return num;
    }

    private static List<Integer> getSet(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        return list;
    }

    private static List<Integer> getAllSums(List<Integer> list) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                sums.add(list.get(i) & list.get(j));
            }
        }
        return sums;
    }

}
