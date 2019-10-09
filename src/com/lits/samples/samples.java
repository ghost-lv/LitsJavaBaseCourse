package com.lits.samples;

import java.util.Random;

public class samples {
    public static void main(String[] args) {
        //var randomnumber = new random().nextint(bound:10)

        // do while syntax
        var randomNumber=0;
        do {
            randomNumber = new Random().nextInt(1000);
            System.out.println(randomNumber);
            System.out.println(randomNumber % 2);

        }while (randomNumber % 2 !=0);
        System.out.println("парне");
    /*
  > - більше
  < - менше
  >= - більше рівне
  <= - менше рівне
  != - не дорівнює
  == - дорівнює
 */
        //var a = 0.2f+0.2f;
        //var a = (int) 0.2 + 0.2;
        }

    }

