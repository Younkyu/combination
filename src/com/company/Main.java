package com.company;
// 조합 combination

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static ArrayList<int[]> box = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //총 몇개의 숫자를 입력 받을 것인지
        int a = 0;
        int b;
        int count = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        count = (combination(a,b));
        int i = 1;
        for(i = 1; i < 100; i++) {
            if(count % ((int)Math.pow(10,i)) != 0) break;
        }

        System.out.print(i-1);

    }

    public static int combination(int n , int m) {

        if(n == m || m == 0) return 1;
        else return combination(n-1,m-1) + combination(n-1,m);
    }

}



