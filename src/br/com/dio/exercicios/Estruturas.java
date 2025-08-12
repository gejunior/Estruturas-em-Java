/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Genilson Junior
 */



public class Estruturas {
    private static Scanner ler = new Scanner(System.in);
    
    public static void tabuada(){
        int result;
        System.out.print("Digite um numero pra tabuada: ");
        int numero = ler.nextInt();
        
        System.out.println("Tabuada do " + numero);
        for(int i = 1; i < 11; i++){
            result = numero*i;
            System.out.println(numero + " * " + i + " = " + result);
        }
    }
    
    public static void calcularIMC(){
        System.out.print("Informe sua altura: ");
        double altura = ler.nextDouble();
        
        System.out.print("Informe seu peso: ");
        double peso = ler.nextDouble();
        
        //função de IMC
        double imc = peso/(altura * altura);
        
        System.out.println("Seu IMC e: " + imc);
        
        if(imc <= 18.5){
            System.out.println("Abaixo do peso.");
        }else if(imc >= 18.6 && imc <= 29.9){
            System.out.println("Peso ideal.");
        }else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade Grau 1");
        }else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade Grau 2(Severa)");
        }else if(imc >= 40.0){
            System.out.println("Obesidade Grau 3 (mórbida)");
        }
    }
    
    public static void exIntervalo(){
        int maior = 0, b;
        System.out.println("Ex: intervalo do maior para o menor");
        System.out.print("Informe o primeiro numero: ");
        int a = ler.nextInt();

        do{
            System.out.print("Informe o segundo numero: ");
            b = ler.nextInt();
            if(a >= b){
                System.out.println("Informe um numero maior q o primeiro!");
            }else{
                maior = b;
            }
        }while(a >= b);
        
        System.out.print("impar(1) ou par (0)?");
        int op = ler.nextInt();
        
        switch(op){
            case 0 ->  {
                System.out.println("Pares: ");
                if(maior != 0){
                    for(int i = maior; i >= a; i--){
                        if(i%2 == 0){
                            System.out.println("numero: " + i);
                        }
                    }
                }
            }
            case 1 -> { 
                if(maior != 0){
                    System.out.println("Impares: ");
                    for(int i = maior; i >= a; i--){
                        if(i%2 != 0){
                            System.out.println("numero: " + i);
                        }
                    }
                }
            }
            
            default -> {System.out.println("numero invalido!");}
        }
        System.out.println("Sistema finalizado.");
        
    }
    
    public static void ex4(){
        System.out.println("Informe o numero 1");
        int a = ler.nextInt();
        int b = 0;
        do{
            System.out.println("informe outro numero: ");
            b = ler.nextInt();
            
        }while((b/a)%2 != 0);
    }
    
    public static void desconto(){
        double produto = ler.nextDouble();

        // TODO: Leia a porcentagem de desconto:
        double desconto = ler.nextDouble();
        // TODO: Verifique se o desconto está dentro de um intervalo válido:
        if(desconto > 0 && desconto <= 100){
            // TODO: Calcule o valor final do produto:
            double valorFinal = produto - (produto * (desconto/100));  
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(valorFinal));
        }else{
          System.out.println("Desconto invalido");
        }
    }
    
    public static void main(String[] args) {
        tabuada();
        calcularIMC();
        exIntervalo();
        ex4();
        desconto();
    }
        
}
