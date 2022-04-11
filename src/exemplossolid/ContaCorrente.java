/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ContaCorrente extends Conta implements I_ContaCorrente, I_Rendimento{

        public ContaCorrente(long numeroConta, int digitoConta, double saldoConta, Pessoa cliente) {
            super(numeroConta, digitoConta, saldoConta, cliente, Constante.CONTA_CORRENTE);
        }
        
        @Override
        public double getLimiteEmprestimo(){
                if(super.getSaldoConta() > 1000){
                        return super.getSaldoConta();
                }
                return 0.0;
        }
        
        @Override
        public double calcularRendimentos(){
                  double percentual = Constante.TAXA_RENDIMENTOS_CONTA_CORRENTE / 100.0;
                 super.setSaldoConta(super.getSaldoConta() + (percentual * super.getSaldoConta()));
                
                return super.getSaldoConta(); 
        }
}
