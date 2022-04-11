/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Instituicao {
        
        private ArrayList<ContaCorrente> contasCorrente = new ArrayList<>();
        private ArrayList<ContaPoupanca> contasPoupanca = new ArrayList<>();
        private ArrayList<ContaSalario> contasSalario = new ArrayList<>();

        public Instituicao() {
        }

        public  void setContaCorrente(ContaCorrente conta){
                contasCorrente.add(conta);
        }
        
        public void setContaPoupanca(ContaPoupanca conta){
                contasPoupanca.add(conta);
        }
        
        public void setContaSalario(ContaSalario conta){
                contasSalario.add(conta);
        }
        
        public  void criarContasAleatoriasAPI(){
                
                ArrayList<Pessoa> pessoasNomes = new BuscarPessoas().criarPessoas();
                for(int i = 0; i < pessoasNomes.size(); i++ ){
                        Random radom = new Random();
                        
                        double probabilidade = Math.random();
                        
                        int numConta = radom.nextInt(1000000);
                        int digito = radom.nextInt(10);
                        double saldoAleatorio = Math.random()*5000;
                        
                        if(probabilidade >= 0.55000){ //Conta Corrente
                        
                                contasCorrente.add(new ContaCorrente(numConta, digito, (Math.round(saldoAleatorio*100.0)/100.0), pessoasNomes.get(i)));
                                
                        }else if(probabilidade <= 0.45000){ //Conta Poupança
                                pessoasNomes.get(i).setTipoCliente(radom.nextInt(2)+1);
                                contasPoupanca.add(new ContaPoupanca(numConta, digito, (Math.round(saldoAleatorio*100.0)/100.0), pessoasNomes.get(i)));
                                
                        }else{ //Conta Salario
                                pessoasNomes.get(i).setTipoCliente(Constante.CLIENTE_PF);
                                contasSalario.add(new ContaSalario(numConta, digito, pessoasNomes.get(i)));
                                
                        }
                        
                }
                
        }

        public ArrayList<ContaCorrente> getContasCorrente() {
                return contasCorrente;
        }

        public ArrayList<ContaPoupanca> getContasPoupanca() {
                return contasPoupanca;
        }

        public ArrayList<ContaSalario> getContasSalario() {
                return contasSalario;
        }
        
        
        
}
