package com.lits.lesson6;
import java.util.Arrays;

public class Test {
        public static void main(String ...args)  {
//        System.out.println(Auto.findById(1));
//        Arrays.stream(Auto.values()).map(Auto::getEngine).forEach(System.out::println);
//        System.out.println();
//        Messenger telegram = new Telegram();
//        Application application = new Application();
//        application.runApp(telegram);
//        telegram.plus();
//        Messenger.something();
////
//        System.out.println(Messenger.OPEN);

            Animal cat = new Cat() ;
            Animal cow = new Cow();
            Animal dog = new Dog();
            Zoo zoo = new Zoo();
            zoo.performance(cat);
            zoo.performance(cow);
            zoo.performance(dog);
        }
    }


