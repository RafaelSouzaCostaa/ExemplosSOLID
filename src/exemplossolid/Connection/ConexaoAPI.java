/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid.Connection;

import exemplossolid.Pessoa;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ConexaoAPI {
    
        static String busca = "https://servicodados.ibge.gov.br/api/v2/censos/nomes/ranking";
        static int exitoCode = 200;
        static protected ArrayList<Pessoa> pessoa = new ArrayList<>();
        
        public static ArrayList<Pessoa> buscarPessoas(){
                                
                try {
                        URL url = new URL(busca);
                        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                        conexao.setRequestMethod("GET");

                        if(conexao.getResponseCode() != exitoCode){
                                throw new RuntimeException("HTTP error code " + conexao.getResponseCode());
                        }
                        
                        BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
                        
                        String tes = resposta.readLine();
                        
                        String[] split = tes.split(",");
                        for(int i = 5; i <split.length; i = i + 3){
                                String name = split[i].replace("{", "").replace("}", "").replace("nome", "").replaceAll("\"\":\"", "").replace("\"", "");                                
                                pessoa.add(new Pessoa(name));
                        }

                } catch (Exception e) {
                }
                
                return pessoa;
        }
}