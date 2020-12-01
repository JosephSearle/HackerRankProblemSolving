package com.company;

import java.util.List;
import java.util.ArrayList;

public class Problems {

    public void staircase(int n) {
        int space = n - 1;
        int star = 1;
        while(n > 0){
            for(int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for(int i = 0; i < star; i++) {
                System.out.print("#");
            }
            star = star + 1;
            space = space - 1;
            n--;
            System.out.println("");
        }
    }

    public void miniMaxiSum(int[] arr) {
        ArrayList<Long> sums = new ArrayList();
        int index = 0;

        while(index < arr.length) {
            long sum = 0;
            for(int i = 0; i < arr.length; i ++) {
                sum = sum + arr[i];
            }
            sum = sum - arr[index];
            sums.add(sum);
            index++;
        }
        long lowSum = sums.get(0);
        long highSum = sums.get(0);

        for(long sum : sums) {
            if(sum >= highSum) {
                highSum = sum;
            }
            if(sum <= lowSum) {
                lowSum = sum;
            }
        }
        System.out.println(lowSum + " " + highSum);
    }

    public int birthdayCakeCandles(List<Integer> candles) {
        int tallest = 0;
        int count = 0;
        for(int candle : candles) {
            if(candle > tallest) {
                tallest = candle;
            }
        }
        for(int candle : candles) {
            if(candle == tallest) {
                count++;
            }
        }
        return count;
    }

    public String timeConversion(String s) {
        char[] arr = s.toCharArray();
        String hour = String.valueOf(arr[0]) + String.valueOf(arr[1]);
        String rest = String.valueOf(arr[2]) + String.valueOf(arr[3]) + String.valueOf(arr[4])+ String.valueOf(arr[5])+ String.valueOf(arr[6])+ String.valueOf(arr[7]);
        System.out.println(hour);
        String result = "";
        if(arr[8] == 'A') {
            switch(hour) {
                case "12":
                    result = "00" + rest;
                    break;
                default:
                    result = hour + rest;
                    break;
            }
        }else{
            switch(hour) {
                case "12":
                    result = hour + rest;
                    break;
                case "01":
                    result = "13" + rest;
                    break;
                case "02":
                    result = "14" + rest;
                    break;
                case "03":
                    result = "15" + rest;
                    break;
                case "04":
                    result = "16" + rest;
                    break;
                case "05":
                    result = "17" + rest;
                    break;
                case "06":
                    result = "18" + rest;
                    break;
                case "07":
                    result = "19" + rest;
                    break;
                case "08":
                    result = "20" + rest;
                    break;
                case "09":
                    result = "21" + rest;
                    break;
                case "10":
                    result = "22" + rest;
                    break;
                case "11":
                    result = "23" + rest;
                    break;
            }
        }
        return result;
    }


}
