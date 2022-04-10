/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ContaSalario extends Conta{

    public ContaSalario(long numeroConta, int digitoConta, Pessoa cliente) {
        super(numeroConta, digitoConta, cliente, Constante.CONTA_SALARIO);
    }

} 
