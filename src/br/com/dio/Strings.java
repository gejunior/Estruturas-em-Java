/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio;

/**
 *
 * @author Genilson Junior
 */
public class Strings {
    public static void main(String[] args) {
//        Strings --separando por ponto e virgula (;)
        var value = "JavaJava;java;java";
        var value1 = "      Java;  Java; java;java   -";
        var value2 = "--------Java-----";
        var values = value.split(";");

        for (var v : values) {
            System.out.println(v);
        }

        System.out.println(value.toUpperCase());
        System.out.println(value.toLowerCase());
        System.out.println(value.indexOf("a", 1, 5));
        System.out.println(value1.trim());//limpa o codigo com espaços
        System.out.println(value2.substring(8, 12));
        
    }
}
