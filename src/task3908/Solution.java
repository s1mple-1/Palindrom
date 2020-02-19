package task3908;

import java.util.HashMap;

/*
Возможен ли палиндром?
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("PiWpWoi"));
    }

    public static boolean isPalindromePermutation(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (char c : arr) {
                if (c == arr[i]) count++;
            }
            map.put(arr[i], count);
        }
        int count = 0;
        for (int i : map.values()) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count <= 1;
    }
}
