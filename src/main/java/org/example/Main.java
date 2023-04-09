package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Boolean repeatQue=true;
        while (repeatQue=true){
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese su palabra para analizar: ");
            String palindrome=sc.next();
            boolean isWord = validacionFrases(palindrome);
            if (isWord && !palindrome.isEmpty()){
                boolean isPal= isPalindromo(palindrome);
                System.out.println("resultado boolean "+isPal);
                printResult(isPal);
            }
            repeatQue = questionsRepeat();
        }


    }

    private static Boolean questionsRepeat() {
        Scanner sc = new Scanner(System.in);
        Boolean repeat=true;
        System.out.println("Desea ingresar otra palabra S/N: ");
        String resp=sc.next();
        if (resp=="S"){
            repeat=true;
        } else {
            repeat=false;
        }
        return repeat;
    }

    public static boolean validacionFrases(String palindrome) {
        Boolean isWord=true;
        List<String> list = new ArrayList<>(List.of(palindrome.split("")));
        for(String cadena :list) {
            if (cadena.equals(" ")){
                isWord=false;
            }

        }
        return isWord;
    }


    private static void printResult(boolean isPal) {
        if (isPal){
            System.out.println("la palabra es un palindromo");
        } else {
            System.out.println("la palabra no es palindromo");
        }
    }

    public static boolean isPalindromo(String palindromo) {
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