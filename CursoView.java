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
import syscolegio.model.Curso;
import syscolegio.model.Professor;

/**
 *
 * @author Cecília Almeida
 */
public class CursoView {
    
   public Curso cr;
    public void cadastrarCurso(){
        cr = new Curso();
        cr.cadastrarCurso();
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja Salvar? 1 - Sim  2 - Não"));
        if(opc==1){
            Path caminho = Paths.get("C:/Users/Cecília Almeida/Desktop/CursoSysCecilia.txt");
            ArrayList<Curso> listacurso = new ArrayList<>();
            listacurso.add(cr); 
            String texto = " CURSO:\nNome: " + cr.nomeC + "\n Descrição:" + cr.descricao + "\nCarga Horaria: " + cr.cargaH + "\n Valor Do curso: " + cr.valor ;
             byte[] textoByte = texto.getBytes();
           try{
           Files.write(caminho, textoByte);    
           }catch(IOException erro){
           }
        }
    }
    public void exibirCurso(){
    Path caminho = Paths.get("C:/Users/Cecília Almeida/Desktop/CursoSysCecilia.txt");
        try{
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            
        }catch (IOException erro){
            
        }
}
}
