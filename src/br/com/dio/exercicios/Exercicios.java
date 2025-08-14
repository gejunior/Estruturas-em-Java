/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.exercicios;

import java.util.Scanner;

/**
 *
 * @author Genilson Junior
 */
public class Exercicios {

    static Scanner ler = new Scanner(System.in);

    private static void ex1Idade() {
        int anoAtual = 2025;

        System.out.print("Seu nome: ");
        String nome = ler.next();

        System.out.print("Ano de nascimento: ");
        int anoNascimento = ler.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println(String.format("Ola %s voce tem %s anos", nome, idade));
    }
//    ==================================================================

    private static void ex2Quadrado() {
        System.out.print("tamanho do lado: (12,4)");
        double lado = ler.nextDouble();
        double resultado = lado * lado;

        System.out.println(String.format("O tamanho dos lados e: %.2f", resultado));
    }

//    ==================================================================
    private static void ex3Retangulo() {
        System.out.print("base do retangulo: ");
        double base = ler.nextDouble();

        System.out.print("altura do retangulo: ");
        double altura = ler.nextDouble();

        double result = base * altura;

        System.out.println(String.format("Area e: %.2f m2", result));
    }
//    ==================================================================

    private static void ex4DiferencaIdade() {
        int diferenca;

        System.out.print("idade do primeiro: ");
        int idade1 = ler.nextInt();

        System.out.print("idade do segundo: ");
        int idade2 = ler.nextInt();

        if (idade2 > idade1) {
            diferenca = idade2 - idade1;
        } else {
            diferenca = idade1 - idade2;
        }

        System.out.println(String.format("Diferenca e de : %s anos", diferenca));
    }

    public static void main(String[] args) {
        ex1Idade();
        ex2Quadrado();
        ex3Retangulo();
        ex4DiferencaIdade();
    }
}
