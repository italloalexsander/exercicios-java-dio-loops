package dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Exercicio5_Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;

        while(true) {
            System.out.println("Digite o número válido (1-10) para obter sua tabuada: ");
            numero = input.nextInt();
            if (numero > 0 && numero <= 10){
                break;
            }
        }

        System.out.println("Tabuada de " + numero);
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }
    }
}
