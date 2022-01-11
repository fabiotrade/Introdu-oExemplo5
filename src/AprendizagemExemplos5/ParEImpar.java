package AprendizagemExemplos5;

import java.util.Scanner;

/*Esse programa solicita ao usuário N números inteiros,
calcula sua soma e mostra quais entre eles são pares
ou ímpares.
 */
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int quantNumeros;
         int numero;
         int quantPares = 0, quantImpares = 0;

        System.out.println("Olá usuário,quantos números você deseja digitar? ");
        quantNumeros = scan.nextInt();

        int count = 0;
            do {
                System.out.println("Digite um número: ");
                numero = scan.nextInt();


                if (numero % 2 == 0) quantPares++;
                else quantImpares++;
                count++;
            }while(count < quantNumeros);

        System.out.println("A quantidade de números pares digitados foi:  " + quantPares);
        System.out.println("A quantidade de números ímpares digitados foi: " + quantImpares);


            }
    }


