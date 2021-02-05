package Tutoring;

import java.util.Scanner;

public class MilitaryTime {
    public static void main(String[] args) {

        Scanner fin = new Scanner(System.in);
        String in = "";
        String am_pm = "";
        String connect = "";
        int hr = 0;
        int min = 0;
        boolean go = true;

        do {
            // input + check
            while (true) {
                System.out.println("Enter Military Time (e.g. 18:01)");
                in = fin.next();
                String[] arr = in.split(":");
                if (arr.length != 2) {
                    System.out.println("Invalid format!");
                } else {
                    try {
                        hr = Integer.parseInt(arr[0]);
                        min = Integer.parseInt(arr[1]);
                        
                        if (hr > 24 || min > 60)
                            System.out.println("Invalid format!");

                        break;
                    } catch (Exception e) { // lazy
                        System.out.println("Invalid format!");
                    }
                }
            }

            // convert
            am_pm = hr > 12 ? "PM" : "AM";
            connect = min < 10 ? ":0" : ":";
            System.out.println("Your time is " + hr % 12 + connect + min + " " + am_pm);

            // keep going?
            System.out.println("Enter anoter time? (yes/no)");
            in = fin.next();
            char c = in.charAt(0);
            if (c == 'n') {
                go = false;
            }

        } while (go);
    }
}