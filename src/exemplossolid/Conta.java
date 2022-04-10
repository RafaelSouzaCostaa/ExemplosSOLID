/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Conta {
    private long numeroConta;
    private int digitoConta;
    private double saldoConta = 0.0;
    private Pessoa cliente;

    public Conta(long numeroConta, int digitoConta, double saldoConta, Pessoa cliente) {
        this.numeroConta = numeroConta;
        this.digitoConta = digitoConta;
        this.saldoConta = saldoConta;
        this.cliente = cliente;
    }
    
    public Conta(long numeroConta, int digitoConta, Pessoa cliente) {
        this.numeroConta = numeroConta;
        this.digitoConta = digitoConta;
        this.saldoConta = 0.0;
        this.cliente = cliente;
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
    
    
        
}
