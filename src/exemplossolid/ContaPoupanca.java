/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ContaPoupanca extends Conta implements I_Rendimento{
    
    public ContaPoupanca(long numeroConta, int digitoConta, double saldo, Pessoa cliente) {
        super(numeroConta, digitoConta, saldo, cliente, Constante.CONTA_POUPANCA);
    }
    
    @Override
    public double calcularRendimentos(){
                  double percentual = Constante.TAXA_RENDIMENTOS_CONTA_POUPANCA / 100.0;
                 super.setSaldoConta(super.getSaldoConta() + (percentual * super.getSaldoConta()));
                
                return super.getSaldoConta(); 
        }
}
