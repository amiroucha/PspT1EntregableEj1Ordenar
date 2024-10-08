package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNextInt()) {
            numeros.add(entrada.nextInt());
        }
        Collections.sort(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

    }
}