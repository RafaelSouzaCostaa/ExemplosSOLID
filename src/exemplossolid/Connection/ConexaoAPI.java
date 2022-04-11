/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exemplossolid.Connection;

import exemplossolid.I_ConexaoAPI;
import exemplossolid.Pessoa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ConexaoAPI implements I_ConexaoAPI{
               
        @Override
        public HttpURLConnection conexaoPessoasAPI() {
                HttpURLConnection conexao = null;
                try {
                        String busca = "https://servicodados.ibge.gov.br/api/v2/censos/nomes/ranking";
                        int exitoCode = 200;
                        URL url = new URL(busca);
                        
                         conexao = (HttpURLConnection) url.openConnection();
                        conexao.setRequestMethod("GET");

                        if(conexao.getResponseCode() != exitoCode){
                                throw new RuntimeException("HTTP error code " + conexao.getResponseCode());
                         }
                        
                        return conexao;
                } catch (MalformedURLException ex) {
                        Logger.getLogger(ConexaoAPI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                        Logger.getLogger(ConexaoAPI.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
        }
}