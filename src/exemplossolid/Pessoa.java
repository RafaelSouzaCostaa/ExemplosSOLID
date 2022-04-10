/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Pessoa {
    private String nomeCliente; 

        public Pessoa() {
        }

        public Pessoa(String nome) {
                this.nomeCliente = nome;
        }  

        public String getNome() {
                return nomeCliente;
        }

        public void setNome(String nome) {
                this.nomeCliente = nome;
        }

        @Override
        public int hashCode() {
                int hash = 5;
                hash = 19 * hash + Objects.hashCode(this.nomeCliente);
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
                return true;
        }

        @Override
        public String toString() {
                return "Pessoa{" + "nome=" + nomeCliente +  '}';
        }
        private static final Logger LOG = Logger.getLogger(Pessoa.class.getName());
    
    
}
