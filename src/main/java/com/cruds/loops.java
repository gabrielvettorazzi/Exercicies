package com.cruds;

import java.util.Random;

public class loops {
    public static void main(String[] args) {

        Random generate = new Random();

        int i = 0;
        while (i < 10) {
            int number = generate.nextInt(68);
            System.out.println(number);
            i++;
         }

        //mesma coisa que o while de uma forma mais limpo
        for (int j = 0; j < 10; j++) {
                int num = generate.nextInt(68);
                     System.out.println(num);
        }

        //exiba numeros de 1 a 10 usando while
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

    }
}
