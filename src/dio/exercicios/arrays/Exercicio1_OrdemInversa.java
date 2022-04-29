package dio.exercicios.arrays;

/*Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */

public class Exercicio1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 4, 55, 22, 2};
        int tamanho = vetor.length;

        System.out.print("Vetor normal: [ ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("]");

        System.out.print("Vetor invertido: [ ");
        for (int i = (tamanho - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("]");
    }
}
