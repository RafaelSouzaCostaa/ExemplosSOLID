/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package exemplossolid;

import exemplossolid.Connection.ConexaoAPI;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ExemplosMainSOLID {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

                Instituicao instituicao = new Instituicao();

                instituicao.criarContasAleatoriasAPI();
                
                instituicao.getContasCorrente().forEach((ContaCorrente conta) -> {
                        System.out.println("Conta Corrente: " + conta.getNumeroConta() + " Digito: " + conta.getDigitoConta() + " Saldo: " + conta.getSaldoConta() + " ==>  " + conta.getCliente().getNome());
                } );
                
                instituicao.getContasPoupanca().forEach((ContaPoupanca conta) -> {
                        System.out.println("Conta Poupança: " + conta.getNumeroConta() + " Digito: " + conta.getDigitoConta() + " Saldo: " + conta.getSaldoConta()+ " ==>  " + conta.getCliente().getNome());
                } );
                
                instituicao.getContasSalario().forEach((ContaSalario conta) -> {
                        System.out.println("Conta Salario: " + conta.getNumeroConta() + " Digito: " + conta.getDigitoConta() + " Saldo: " + conta.getSaldoConta()+ " ==>  " + conta.getCliente().getNome());
                } );
        }
}
