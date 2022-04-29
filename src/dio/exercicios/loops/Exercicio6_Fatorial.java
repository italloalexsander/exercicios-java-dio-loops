package dio.exercicios.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Exercicio6_Fatorial {
    public static void main(String[] args) {
        int numero, fatorial=1;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o número para saber seu fatorial: ");
        numero = input.nextInt();
        if(numero == 0)fatorial = 0;

        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.println("Fatorial de " + numero + " é igual a: " + fatorial);
    }
}
