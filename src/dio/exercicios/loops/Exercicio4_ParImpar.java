package dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Exercicio4_ParImpar {
    public static void main(String[] args) {
        int quantidadeNumeros, quantidadePares = 0, quantidadeImpares = 0, numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de números: ");
        quantidadeNumeros = input.nextInt();

        //No exercício a instrututora utilizou do while, mas eu acredito que for
        //é mais indicado.
        for(int i = 0; i < quantidadeNumeros; i++){
            System.out.println("Informe o número: ");
            numero = input.nextInt();
            if((numero%2)==0){
                quantidadePares++;
            }else{
                quantidadeImpares++;
            }
        }
        System.out.println("A quantidade números pares foi: " + quantidadePares);
        System.out.println("A quantidade números impares foi: " + quantidadeImpares);
    }
}
