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
        // Задача 2.
        int clientDeviceYear = 2014;
        if (android == 1 && clientDeviceYear <=2014) {
            System.out.println("download light android version");
            if (iOS == 0 && clientDeviceYear <=2014) {
                System.out.println("download light iOS app version");
            }
        }
        int clientDevice = 2015;
        if (android == 1 && clientDevice >= 2015) {
            System.out.println("download normal android app version");
            if (iOS == 0 && clientDevice >= 2015) {
                System.out.println("download normal iOS app version");
            }
        }
        //Задача 3
        int year = 2022;
        if (((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0)) {
            System.out.println("year " + year + "vis");
        }
        else {
            System.out.println("year " + year + "nevis");
        }
        // Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("need 1 days to reach" + deliveryDistance + " km");
        } else {
            if (deliveryDistance <=60) {
                System.out.println("need 2 days to reach " + deliveryDistance + " km");
            } else {
                if (deliveryDistance >=100);
                System.out.println("need 3 days to reach " + deliveryDistance + " km");
            }
        }
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
