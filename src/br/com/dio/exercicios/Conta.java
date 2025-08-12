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
public final class Conta {
    private static Scanner ler = new Scanner(System.in);
    private double saldo;
    private double cheque;
    private double boleto;

    public Conta(double valorDeposito) {
        this.setSaldo(valorDeposito);
        this.setBoleto(0.0);
        
        if(valorDeposito <= 500.00){
            this.setCheque(50 + valorDeposito);
        }else{
            this.setCheque(valorDeposito*1.5);
        }
    }
    
    public double getSaldo() {
        return saldo;
    }

    public double getCheque() {
        return cheque;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCheque(double cheque) {
        this.cheque = cheque;
    }

    public double getBoleto() {
        return boleto;
    }

    public void setBoleto(double boleto) {
        this.boleto = boleto;
    }

    
    public void depositar(double valor){
        if(valor > 0){
            this.setSaldo(saldo + valor);
            System.out.println("Valor depositado com sucesso! \nValor atual R$:" + this.getSaldo());
        }else{
            System.out.println("Valor invalido.");
        }
    }
    
    public void sacar(double valor){
        if(valor > 0){
            if(valor < this.saldo){
                this.setSaldo(saldo-valor);
                return;
            }else if(valor > this.saldo && valor <= this.cheque){
                
                this.setCheque(this.cheque-valor);
                this.setBoleto(boleto+valor);
                return;
            }
            
            
            System.out.println("Valor insuficiente!");
        }
        System.out.println("Valor negativo!");
    }
    
    public void pagarBoleto(double valor){
        if(valor < boleto){
            System.out.println("valor insuficiente");
        }else{
            setBoleto(valor-this.boleto);
            double resto = valor-this.boleto;
            if(resto > 0){
                setSaldo(saldo + resto);
            }
        }
    }
    
    public void verificarCheque(){
        if(this.getBoleto() == 0.00){
            System.out.println("Nao esta devendo cheque!");
        }else{
            System.out.println("Valor devedor de R$" + this.getBoleto());
        }
    }

    
    public static int menu(){
        System.out.println("[1] Consultar saldo");
        System.out.println("[2] Consultar cheque");
        System.out.println("[3] Depositar");
        System.out.println("[4] Sacar");
        System.out.println("[5] pagar boleto");
        System.out.println("[6] Usando cheque?");
        System.out.println("[0] Sair");
        System.out.print("Opcao: ");
        int op = ler.nextInt();
        return op;
    }
    
    public static void main(String[] args) {
        int op;
        String r = null;
        Conta c = new Conta(1000);
        
        do{
            op = menu();
            
            switch (op) {
                case 1 -> System.out.println("Saldo de: R$" + c.getSaldo());
                case 2 -> System.out.println("cheque de: R$" + c.getCheque());
                case 3 ->  {
                    System.out.println("Valor a depositar: "); 
                    c.depositar(ler.nextDouble());
                }case 4 -> {
                    System.out.println("Valor pra sacar: "); 
                    c.sacar(ler.nextDouble());
                }case 5 -> {
                    System.out.println("Valor do boleto: R$" + c.getBoleto() + "\nDeseja pagar? (s/n)");
                    if(!"s".equals(ler.next().toLowerCase())){
                        System.out.println("Cuidado com a taxa!");
                    }else{
                        c.pagarBoleto(ler.nextDouble());
                    }
                }case 6 -> c.verificarCheque();
                case 0 -> System.out.println("Saindo...");
                default -> throw new AssertionError();
            }
        }while(op != 0);
    }
    
}
