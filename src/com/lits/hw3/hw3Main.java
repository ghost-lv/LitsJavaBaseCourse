package com.lits.hw3;

import java.util.Random;

public class hw3Main {
    public static void main(String[] args) {
        //У вас є формула : a+11/12(b+b)/12 і є символ,
        // якшо символ ‘-’ ви ініціалізуєете змінні одними парамеитрами,
        // якшо ‘+’ то ще іншими і якшо ‘*’ іншими
        Random r = new Random();
        var rnd = r.nextInt(2);
        var symbol = (char)(0);
        var result = 0;
        var resultString ="";
        if (rnd==0) {
            symbol = '-';
        }
        else if (rnd==1) {
            symbol='+';
        }
        else if (rnd==2){
            symbol='*';
        }
        var a =0;
        var b =0;
        if (symbol == '-') {
            a=5;
            b=6;
        }
        else if (symbol=='+'){
            a=15;
            b=22;
        }
        else if (symbol=='*') {
            a = 30;
            b = 20;
        }
        result= a + 11/12 * (b + b ) / 12;
        resultString="1. Symbol=\"" + symbol + "\"; Formula: a+11/12(b+b)/12=" + result;
        System.out.println(resultString);
        result=0;
        //Вивести всі прості числа від 1 до 100
        //Вивести суму всіх чисел від 0 до 100
        //Вивести суму останніх трьох чисел від 100 до 200
        resultString="2. Simple numbers 1-100: ";
        var result2 = 0;
        do {
            rnd=r.nextInt(10);
        } while (rnd==0);
        var resultString5="5. Numbers 0-100 dev " + rnd + ": ";
        var resultString6="6. Chars 0-50: "+ (char)('a') + "; ";
        for (int i=1;i<=200; i++){
            if (i<=50) {
                resultString6 = resultString6 + (char)(i+'a') + "; ";//+ a - starts form a
            }
            if (i<=100) {
                resultString = resultString + i + "; ";
                result = result + i;
                if (i % rnd ==0){
                    resultString5=resultString5 + i + "; ";
                }
            }
            if (i>197){
                result2=result2+i;
            }
        }
        System.out.println(resultString);
        System.out.println("3. Sum 0-100: " + result);
        System.out.println("4. Sum last 3 numbers 0-200: " + result2);
        System.out.println(resultString5);
        System.out.println(resultString6);
        resultString="7. Simple numbers 100-0: ";
        for (int i=100;i>=0; i=i-1){
            resultString = resultString + i + "; ";
        }
        System.out.println(resultString);
    }
}
