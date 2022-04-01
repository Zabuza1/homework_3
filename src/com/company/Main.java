package com.company;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        int android = 1;
        int iOS = 0;
        if (android ==1) {
            System.out.println("download app in android link");
            if (iOS == 0) {
                System.out.println("download app in iOS link");
            }
        }
        // задача 2
        int clientDeviceAnd = 2015;
       if (android == 1 && clientDeviceAnd <2015){
           System.out.println("down light");
       } else if (android == 1 && clientDeviceAnd >=2015) {
           System.out.println("down normal"); }
        int clientDeviceIos = 2015;
       if (iOS == 0 && clientDeviceIos <2015) {
            System.out.println("down light ios");
        } else if (iOS == 0 && clientDeviceIos >=2015) {
           System.out.println("down normal ios"); }


        //Задача 3
        int year = 2022;
        if (((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0)) {
            System.out.println("year " + year + "vis");
        }
        else {
            System.out.println("year " + year + "nevis");
        }
        // Задача 4
        int deliveryDistance =60;
        int days = 1;
        if (deliveryDistance <=20) {
            System.out.println("delivery takes " + days);
        } else if (deliveryDistance >20 && deliveryDistance <60) {
            System.out.println("delivery takes " + (days + 1));
        } else if (deliveryDistance >=60 && deliveryDistance <=100){
            System.out.println("delivery takes " + (days + 2));
        } else {
            System.out.println("error");}


        // Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12,1,2:
                System.out.println("winter");
                break;
            case 3,4,5:
                System.out.println("spring");
                break;
            case 6,7,8:
                System.out.println("summer");
                break;
            case 9,10,11:
                System.out.println("autumn");
                break;
            case 13:
                System.out.println("doesn`t exist");
        }
    }

}
