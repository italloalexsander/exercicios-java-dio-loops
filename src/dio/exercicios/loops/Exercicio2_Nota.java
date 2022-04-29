package dio.exercicios.loops;

/*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e
continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Exercicio2_Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma nota(0-10): ");
        while(true){
            int nota = input.nextInt();
            if(nota < 0 || nota > 10){
                System.out.println("Insira uma nota válida(0-10): ");
            }else{
                System.out.println("A nota " + nota + " é valida");
                break;
            }
        }
    }
}
