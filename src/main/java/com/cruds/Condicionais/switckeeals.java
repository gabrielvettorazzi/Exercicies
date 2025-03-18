package com.cruds.Condicionais;

public class switckeeals {
    public static void main(String[] args) {

        char mes = 2;
        String monthString = "";
        switch (mes) {
            case 1: monthString = "janeiro";
            break;
            case 2: monthString = "fevereiro";
            break;
            case 3: monthString = "MARÇO";
           break;
        }
        System.out.println(monthString);



        for (int j =0; j < mes; j++) {
            System.out.println(j);
        }
    }
}
