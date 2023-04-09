package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su palabra para analizar: ");
        String palindrome=sc.next();
        boolean isPal= isPalindromo(palindrome);

        System.out.println("resultado boolean {}"+isPal);
        printResult(isPal);

    }

    private static void printResult(boolean isPal) {
        if (isPal){
            System.out.println("la palabra es un palindromo");
        } else {
            System.out.println("la palabra no es palindromo");
        }
    }

    private static boolean isPalindromo(String palindromo) {
        boolean isPal = false;
        new ArrayList<>(Arrays.asList("RED", "BLUE", "BLACK"));
        List<String> list = new ArrayList<>(List.of(palindromo.split("")));
        Collections.reverse(list);
        StringBuilder result = new StringBuilder();

        for(String cadena :list) {
            System.out.println(cadena);
            result.append(cadena);
        }
        if(palindromo.equals(result.toString())){
            isPal=true;
        }

        return isPal;
    }
}