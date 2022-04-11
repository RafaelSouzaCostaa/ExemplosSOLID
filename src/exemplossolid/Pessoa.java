/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Pessoa implements I_IdentificadorCliente{
        
        private int identificacao = 0;
        private String nomeCliente;
         private int tipoCliente;

        public Pessoa(String nome) {
                this.nomeCliente = nome;
        }

        public Pessoa(String nome, int tipoPessoa) {
                this.nomeCliente = nome;
                this.tipoCliente = tipoPessoa;
        }  

        public String getNome() {
                return nomeCliente;
        }

        public void setNome(String nome) {
                this.nomeCliente = nome;
        }

        public int getTipoCliente() {
                return tipoCliente;
        }

        public void setTipoCliente(int tipoCliente) {
                this.tipoCliente = tipoCliente;
        }

        @Override
        public int hashCode() {
                int hash = 3;
                hash = 59 * hash + Objects.hashCode(this.nomeCliente);
                hash = 59 * hash + Objects.hashCode(this.tipoCliente);
                return hash;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj) {
                        return true;
                }
                if (obj == null) {
                        return false;
                }
                if (getClass() != obj.getClass()) {
                        return false;
                }
                final Pessoa other = (Pessoa) obj;
                if (!Objects.equals(this.nomeCliente, other.nomeCliente)) {
                        return false;
                }
                if (!Objects.equals(this.tipoCliente, other.tipoCliente)) {
                        return false;
                }
                return true;
        } 

        @Override
        public int getIdentificadorCliente() {
                Random random = new Random();
                
                if(this.identificacao == 0){
                        this.identificacao = random.nextInt(100000000);
                        return this.identificacao;
                }
                return this.identificacao;
        }
}
