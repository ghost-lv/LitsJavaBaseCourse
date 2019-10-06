package com.lits.hw3;

import java.util.Random;

public class hw3Main {
    public static void main(String[] args) {
        //У вас є формула : a+11/12(b+b)/12 і є символ,
        // якшо символ ‘-’ ви ініціалізуєете змінні одними парамеитрами,
        // якшо ‘+’ то ще іншими і якшо ‘*’ іншими
        Random r = new Random();
        var rnd = r.nextInt(3);
        var Symbol = "";
        var Result = 0;
        var ResultString ="";
        if (rnd==0) {
            Symbol = "-";
        }
        else if (rnd==1) {
            Symbol="+";
        }
        else if (rnd==2){
            Symbol="*";
        }
        var a =0;
        var b =0;
        if (Symbol == "-") {
            a=5;
            b=6;
        }
        else if (Symbol=="+"){
            a=15;
            b=22;
        }
        else if (Symbol=="*") {
            a = 30;
            b = 20;
        }
        Result= a + 11/12 * (b + b ) / 12;
        ResultString="1. Symbol=\"" + Symbol + "\"; Formula: a+11/12(b+b)/12=" + Result;
        System.out.println(ResultString);
        Result=0;
        //Вивести всі прості числа він 1 до 100
        //Вивести суму всіх чисел від 0 до 100
        //Вивести суму останніх трьох чисел від 100 до 200
        ResultString="2. Simple numbers 1-100: ";
        var Result2 = 0;
        rnd=r.nextInt(10);
        var ResultString5="5. Numbers 0-100 dev " + rnd + ": ";
        var ResultString6="6. Chars 0-50: "+ (char)('a') + "; ";
        for (int i=1;i<=200; i++){
            if (i<=50) {
                ResultString6 = ResultString6 + (char)(i+'a') + "; ";//+ a - starts form a
            }
            if (i<=100) {
                ResultString = ResultString + i + "; ";
                Result = Result + i;
                if (i % rnd ==0){
                    ResultString5=ResultString5 + i + "; ";
                }
            }
            if (i>197){
                Result2=Result2+i;
            }
        }
        System.out.println(ResultString);
        System.out.println("3. Sum 0-100: " + Result);
        System.out.println("4. Sum last 3 numbers 0-200: " + Result2);
        System.out.println(ResultString5);
        System.out.println(ResultString6);
        ResultString="7. Simple numbers 100-0: ";
        for (int i=100;i>=0; i=i-1){
            ResultString = ResultString + i + "; ";
        }
        System.out.println(ResultString);
    }
}
