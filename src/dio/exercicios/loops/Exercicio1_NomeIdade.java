package dio.exercicios.loops;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio1_NomeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome: (0 para encerrar)");
            String nome = input.next();
            if (Objects.equals(nome, "0")) {
                break;
            }
            System.out.println("Digite a idade ");
            int idade = input.nextInt();
        }

        System.out.println("Programa encerrado!!");


    }
}
