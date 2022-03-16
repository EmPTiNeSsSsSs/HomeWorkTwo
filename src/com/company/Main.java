package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(number(17,15));
        System.out.println(number(16,1));
        System.out.println(number(46,10));
        System.out.println(number(22,-12));
        System.out.println(number(10,32));
        
    }

    public static String number(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < -30 ) {
            return "Можно гулять!";
        }
        else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно гулять!";
        }
        else if (age > 45 && temperature > -10 && temperature < 25 ){
            return "Можно гулять!";
        }
        else{
            return "Оставаитесь дома!";
        }
    }
}