/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.semanal.avaliacao.continuada;

import java.util.Scanner;

/**
 *
 * @author MATEUSRESENDEDASILVA
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        Integer numeroDigitado;
        Integer resultado;
        Integer operacao;

        do {
            System.out.println("Digite o número que corresponde a "
                    + "operação desejada");
            System.out.println("1 - Soma\n2 - Multiplicação\n3 - Divisão\n"
                    + "4 - Subtração\n0 - Sair");
            operacao = tabuada.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Você escolheu: Soma\n"
                            + "Digite o número cuja tabuada você "
                            + "deseja saber\n");
                    numeroDigitado = tabuada.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultado = numeroDigitado + i;
                        System.out.println(
                                String.format("%d + %d = %d", numeroDigitado,
                                        i, resultado));
                    }
                    System.out.println("\n\n");
                    break;

                case 2:
                    System.out.println("Você escolheu: Multiplicação\n"
                            + "Digite o número cuja tabuada você "
                            + "deseja saber\n");
                    numeroDigitado = tabuada.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultado = numeroDigitado * i;
                        System.out.println(
                                String.format("%d * %d = %d", numeroDigitado,
                                        i, resultado));
                    }
                    System.out.println("\n\n");
                    break;

                case 3:
                    System.out.println("Você escolheu: Divisão\n"
                            + "Digite o número cuja tabuada você "
                            + "deseja saber\n");
                    numeroDigitado = tabuada.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultado = numeroDigitado / i;
                        System.out.println(
                                String.format("%d / %d = %d", numeroDigitado,
                                        i, resultado));
                    }
                    System.out.println("\n\n");
                    break;

                case 4:
                    System.out.println("Você escolheu: Subtração\n"
                            + "Digite o número cuja tabuada você "
                            + "deseja saber\n");
                    numeroDigitado = tabuada.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultado = numeroDigitado - i;
                        System.out.println(
                                String.format("%d - %d = %d", numeroDigitado,
                                        i, resultado));
                    }
                    System.out.println("\n\n");
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
