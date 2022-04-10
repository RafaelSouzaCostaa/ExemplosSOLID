/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package exemplossolid;


/**
 *
 * @author Rafael de Souza Costa
 */
public class ExemplosMainSOLID {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                //SOLID
                
                //SPR - Principio da Responsabilidade Unica
                //OCP - Principio do Aberto/Fechado
                //LSP - Principio da Substituição de liskov
                //ISP - Principio da Segregação da Interface
                //DIP - Principio da Inversão de Dependencia
                
                
                Instituicao instituicao = new Instituicao();
                instituicao.criarContasAleatoriasAPI();
                      
                instituicao.getContasCorrente().forEach((ContaCorrente conta) -> {
                        String tipo = conta.getCliente().getTipoCliente() == 1 ? "Conta Pessoa Juridica" : "Conta Pessoa Fisica";
                        System.out.println("Conta Corrente: " + conta.getNumeroConta() + " Digito: " + conta.getDigitoConta() + " Saldo: " + conta.getSaldoConta() + " " + tipo + " ==>  " + conta.getCliente().getNome() );
                } );
                
                instituicao.getContasPoupanca().forEach((ContaPoupanca conta) -> {
                        String tipo = conta.getCliente().getTipoCliente() == 1 ? "Conta Pessoa Juridica" : "Conta Pessoa Fisica";
                        System.out.println("Conta Poupança: " + conta.getNumeroConta() + " Digito: " + conta.getDigitoConta() + " Saldo: " + conta.getSaldoConta()+  " " + tipo +" ==>  " + conta.getCliente().getNome());
                } );
                
                instituicao.getContasSalario().forEach((ContaSalario conta) -> {
                        String tipo = conta.getCliente().getTipoCliente() == 1 ? "Conta Pessoa Juridica" : "Conta Pessoa Fisica";
                        System.out.println("Conta Salario: " + conta.getNumeroConta() + " Digito: " + conta.getDigitoConta() + " Saldo: " + conta.getSaldoConta()+  " " + tipo + " ==>  " + conta.getCliente().getNome());
                } );
                   
        }
}
