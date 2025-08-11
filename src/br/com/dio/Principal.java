/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio;

import java.util.Scanner;

/**
 *
 * @author Genilson Junior
 */
public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Ola, qual e o seu nome? ");
        String nome = ler.next();
        
        System.out.println(String.format("Seja bem vindo, %s\n", nome));
        
        
        var valor1 = 124;
        var valor2 = 5;
        
        var b = Integer.toBinaryString(valor1-valor2);
        
        System.out.println("resultado " + b);
        
    }
    
}
