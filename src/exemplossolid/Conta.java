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
public abstract class Conta implements IIdentificador{
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
        
        //Principio de Substituição de liskov - classes filhas não implementa - poupança e salario
        public boolean solicitarEmprestimo(){
                if(this.identificacao == Constante.CONTA_CORRENTE){
                        return true;
                }else if(this.identificacao == Constante.CONTA_SALARIO || this.identificacao == Constante.CONTA_POUPANCA){
                        return false;
                }
                return false;
        }
        
        //Principio do Aberto/Fechado aberto para extenção e fechado para modificação
        public double calcularRendimentos(){
                if(this.getCliente().getTipoCliente() == Constante.CONTA_CORRENTE){
                        saldoConta = (Constante.TAXA_RENDIMENTOS_CONTA_CORRENTE / 100.0) * saldoConta;
                }else if(this.getCliente().getTipoCliente() == Constante.CONTA_POUPANCA){ //IF add para verificar a adição do cliente PJ - deveria ter implementando uma interface 
                        saldoConta = (Constante.TAXA_RENDIMENTOS_CONTA_POUPANCA / 100.0) * saldoConta;
                }
                return saldoConta; 
        }
        
        //Principio da Responsabilidade Unica
        public void conexaoBancoDeDados(){
                /*------------------------------*/ 
        }
        
        public void createContaDAO(){
                /*------------------------------*/
                
                /* Calcular juros Rendimento */
        }
        
        public void updateContaDAO(){
                /*------------------------------*/
        }
        
        public void deleteContaDAO(){
                /*------------------------------*/
        }
          

        //Principio da Segregação da Interface - metodo não necessario para essa class
        
        @Override
        public int getIdentificadorCliente() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
