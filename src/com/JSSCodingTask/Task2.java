package com.JSSCodingTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required size of the array :");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the height of the students one by one :");
        int x = -1, y = 0;
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            arr.add(b);
        }
        System.out.println("Initially: " + arr);
        while (true) {
            x = 0;
            for (int i = (arr.size() - 1); i > 0; i--) {
                if (arr.get(i - 1) > arr.get(i)) {
                    arr.remove(i);
                    x++;
                }
            }
            if (x == 0)
                break;
            y++;
            System.out.println("Round " + y + ": " + arr);
        }
        System.out.println("Total number of Rounds : " + y);
    }
}

