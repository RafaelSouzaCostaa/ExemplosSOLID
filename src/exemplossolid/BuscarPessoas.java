/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid;

import exemplossolid.Connection.ConexaoAPI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael de Souza Costa
 */
public class BuscarPessoas extends ConexaoAPI{
               
        public ArrayList<Pessoa> pessoa = new ArrayList<>();

        public  ArrayList<Pessoa> criarPessoas() {

                try {
                        BufferedReader resposta = new BufferedReader(new InputStreamReader((conexaoPessoasAPI().getInputStream())));
                        String tes = resposta.readLine();
                        String[] split = tes.split(",");
                for(int i = 5; i <split.length; i = i + 3){
                        String name = split[i].replace("{", "").replace("}", "").replace("nome", "").replaceAll("\"\":\"", "").replace("\"", "");                                
                        pessoa.add(new Pessoa(name));
                }
                } catch (IOException ex) {
                        Logger.getLogger(BuscarPessoas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                return pessoa;
        }
}
