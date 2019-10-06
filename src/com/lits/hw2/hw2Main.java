package com.lits.hw2;

import java.util.Random;

public class hw2Main {
    public static void main(String[] args) {
        // Згенерувати рандомний рядок chars
        // Потірбно вивести в рядок 10 випадкових char символів.
        Random r = new Random();
        String str="";
        for (int i= 1; i<=10; i++){
            char c = (char)(r.nextInt(26) + 'a');
            str=str + c;
        }
        System.out.println("1. Random string: " + str);
        // Просумувати парні числа від 1 до 15
        var sumI =0;
        for (int i=1; i<=15; i++) {
            if (i % 2 == 0) {
                sumI = sumI + i;
            }
        }
        System.out.println("2. Sum = " + sumI);
        //Взяти випадкове число, перевірити його і якшо воно ділиться на 3 - то вивести шо діл на 3,
        // якшо на 5 - то дів на 5 - якшо на 7 - то вивести шо дів на 7
        var rnd = r.nextInt(1000);
        str="3. Int " + rnd + " div ";
        if (rnd % 3 ==0) {
            str=str + "3";
        }
        else if (rnd % 5 ==0) {
            str=str + "5";
        }
        else if (rnd % 7 ==0) {
            str=str + "7";
        }
        else {
            str=str + "not 3, 5 or 7";
        }
        System.out.println(str);
        //Зробити цикл на 50 повторень і генерувати випадкові числа, вивести і просумувати числа які націло діляться на 7
        str="";
        sumI=0;
        for (int i=1; i<=50; i++){
            rnd = r.nextInt(1000);
            if (rnd % 7 ==0){
                if (str.length() == 0) {str = "" + rnd;}
                else {str= str + "+" + rnd;}
                sumI = sumI + rnd;
            }

        }
        if (str.length() == 0){
            str="4. Nothing to show here ((";
        }
        else{
            str="4. " + str + "=" + rnd;
            System.out.println(str);
            //просумувати 15 випадкових чисел і знайти їх середнє значеня
            sumI=0;
            var avgI=0;
            for (int i=1; i<=15; i++){
                rnd = r.nextInt(1000);
                sumI = sumI + rnd;
            }
            avgI=sumI / 15;
            System.out.println("5. Sum of 15 randoms is " + sumI + ", and average is " + avgI);
            System.out.println("Have a nice day!");
        }


    }
}
