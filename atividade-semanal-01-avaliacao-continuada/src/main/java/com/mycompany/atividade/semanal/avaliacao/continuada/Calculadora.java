package com.mycompany.atividade.semanal.avaliacao.continuada;

import java.util.Scanner;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        Double n1;
        Double n2;
        Double resultado = 0.0;
        Integer operacao;

        do {
            System.out.println("Digite o número que corresponde a "
                    + "operação desejada");
            System.out.println("1 - Soma\n2 - Multiplicação\n3 - Divisão\n"
                    + "4 - Subtração\n0 - Sair");
            operacao = calculadora.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Você escolheu: Soma\n"
                            + "Digite os números da operação a seguir\n"
                            + "Número 1");
                    n1 = calculadora.nextDouble();
                    System.out.println("Número 2:");
                    n2 = calculadora.nextDouble();
                    resultado = n1 + n2;
                    System.out.println(
                            String.format("O resultado é: %.2f", resultado));
                    break;

                case 2:
                    System.out.println("Você escolheu: Multiplicação\n"
                            + "Digite os números da operação a seguir\n"
                            + "Número 1");
                    n1 = calculadora.nextDouble();
                    System.out.println("Número 2:");
                    n2 = calculadora.nextDouble();
                    resultado = n1 * n2;
                    System.out.println(
                            String.format("O resultado é: %.2f", resultado));
                    break;

                case 3:
                    System.out.println("Você escolheu: Divisão\n"
                            + "Digite os números da operação a seguir\n"
                            + "Número 1");
                    n1 = calculadora.nextDouble();
                    System.out.println("Número 2:");
                    n2 = calculadora.nextDouble();
                    resultado = n1 / n2;
                    System.out.println(
                            String.format("O resultado é: %.2f", resultado));
                    break;

                case 4:
                    System.out.println("Você escolheu: Subtração\n"
                            + "Digite os números da operação a seguir\n"
                            + "Número 1");
                    n1 = calculadora.nextDouble();
                    System.out.println("Número 2:");
                    n2 = calculadora.nextDouble();
                    resultado = n1 - n2;
                    System.out.println(
                            String.format("O resultado é: %.2f", resultado));
                    break;
                    
                case 0:
                    System.out.println("Você escolheu: Sair");
                    System.out.println("Até logo!");
                    break;
                    
                default:
                    System.out.println("Opção inválida, tente novamente!");

            }
        } while (!operacao.equals(0));

    }

}
