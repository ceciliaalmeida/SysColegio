/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syscolegio.view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import syscolegio.model.Professor;
import syscolegio.model.Recepcionista;

/**
 *
 * @author Cecília Almeida
 */
public class RecepcionistaView {
    
    public Recepcionista rece;
    public void cadastrarRecepcionista(){
        rece = new Recepcionista();
        rece.cadastrarRecepcionista();
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja Salvar? 1 - Sim  2 - Não"));
        if(opc==1){
            Path caminho = Paths.get("C:/Users/Cecília Almeida/Desktop/RecepcionistaSysCecilia.txt");
            ArrayList<Recepcionista> listarecepcionista = new ArrayList<>();
            listarecepcionista.add(rece); 
            String texto = " RECEPCIONISTA: " + rece.exibirPessoa() ;
             byte[] textoByte = texto.getBytes();
           try{
           Files.write(caminho, textoByte);    
           }catch(IOException erro){
           }
        }
    }
    public void exibirRecepcionista(){ 
    Path caminho = Paths.get("C:/Users/Cecília Almeida/Desktop/RecepcionistaSysCecilia.txt");
        try{
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            
        }catch (IOException erro){
            
        }
}
}