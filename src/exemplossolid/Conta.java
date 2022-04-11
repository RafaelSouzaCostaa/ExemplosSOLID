/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid;

import java.util.Random;

/**
 *
 * @author Rafael de Souza Costa
 */
public abstract class Conta implements I_IdentificadorConta{
    private long numeroConta;
    private int digitoConta;
    private double saldoConta = 0.0;
    private Pessoa cliente;
    private int identificacao = 0;

    public Conta(long numeroConta, int digitoConta, double saldoConta, Pessoa cliente, int tipo) {
        this.numeroConta = numeroConta;
        this.digitoConta = digitoConta;
        this.saldoConta = saldoConta;
        this.cliente = cliente;
        this.identificacao = tipo;
    }
    
    public Conta(long numeroConta, int digitoConta, Pessoa cliente, int tipo) {
        this.numeroConta = numeroConta;
        this.digitoConta = digitoConta;
        this.saldoConta = 0.0;
        this.cliente = cliente;
        this.identificacao = tipo;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoConta() {
        return digitoConta;
    }

    public void setDigitoConta(int digitoConta) {
        this.digitoConta = digitoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

        public Pessoa getCliente() {
                return cliente;
        }

        public void setCliente(Pessoa cliente) {
                this.cliente = cliente;
        }

        public int getIdentificacao() {
                return identificacao;
        }

        public void setIdentificacao(int identificacao) {
                this.identificacao = identificacao;
        }
 
        @Override
        public int getIdentificadorConta() {
             Random random = new Random();
                
                if(this.identificacao == 0){
                        this.identificacao = random.nextInt(100000000);
                        return this.identificacao;
                }
                return this.identificacao;
        }
        
}
