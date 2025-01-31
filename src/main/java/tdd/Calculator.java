package tdd;

import java.util.Arrays;

public class Calculator {


    int add(int a, int b){
        return a+b;
    }

    int add(String inputN){


        //Array der separere ved komma.
        String[] tal = inputN.split(",");

        //Samler det i variabel total med foreach loop | Integer.parseInt(t) konvertere String til int
        int total = 0;
        for(String t: tal){
            total += Integer.parseInt(t);
        }
        return total;
    }

    int add(int[] numeros){
        int total = 0;
        for (int tal : numeros){
            total += tal;
        }
        return total;
    }
    int subtract(int a, int b){
        return a-b;
    }

    int multiply(int a, int b){
        return a*b;
    }

    int divide(int a, int b){
        return a/b;
    }
}
