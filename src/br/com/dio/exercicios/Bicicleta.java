/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.exercicios;

/**
 *
 * @author Genilson Junior
 */
//import br.com.dio.exercicios.bicicleta.BicicletaInterna;
import java.util.Scanner;

// Classe principal
public class Bicicleta {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        String modelo = scanner.nextLine();

        String nivelStr = scanner.nextLine();

        // Converte a string para inteiro
        int nivelBateria = Integer.parseInt(nivelStr);

        // TODO: Crie um objeto da classe BicicletaInterna com os valores lidos:
        BicicletaInterna bicicleta = new BicicletaInterna(modelo, nivelStr, nivelBateria);

        // Chama o método que retorna a mensagem formatada e exibe no console
        System.out.println(bicicleta.obterMensagem());

        // Fecha o scanner (boa prática para liberar o recurso)
        scanner.close();
    }
}
// TODO: Crie a classe interna que representa a bicicleta:
class BicicletaInterna{

    // TODO: Adicione seus atributos privados: modelo e nível de bateria:
    private String modelo;
    private String nivelStr;
    private int bateria;

    // TODO: Crie o construtor para inicializar os atributos:
    public BicicletaInterna(String modelo, String nivelStr, int bateria){
        this.modelo = modelo;
        this.nivelStr = nivelStr;
        this.bateria = bateria;
    }

    // TODO: Implemente o método para calcular a distância máxima estimada
    public double calcularDistancia(){
      return this.bateria/2;
    }

    // Método para gerar a mensagem de saída formatada
    public String obterMensagem() {
        // Retorna a mensagem no formato solicitado, com uma casa decimal
        return String.format("%s: Distancia estimada = %.1f km", modelo, calcularDistancia());
    }
}

