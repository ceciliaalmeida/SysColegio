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

/**
 *
 * @author Cecília Almeida
 */
 
public class ProfessorView {
    
    public Professor pr;
    public void cadastrarProfessor(){
        pr = new Professor();
        pr.cadastrarProfessor();
        Professor pr1 = new Professor();
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja Salvar? 1 - Sim  2 - Não"));
        if(opc==1){
            Path caminho = Paths.get("C:/Users/Cecília Almeida/Desktop/ProfessorSysCecilia.txt");
            ArrayList<Professor> listaprofessor = new ArrayList<>();
            listaprofessor.add(pr); 
            String texto = " PROFESSOR: " + pr.exibirPessoa() ;
             byte[] textoByte = texto.getBytes();
           try{
           Files.write(caminho, textoByte);    
           }catch(IOException erro){
           }
        }
    }
    public void exibirProfessor(){
        Path caminho = Paths.get("C:/Users/Cecília Almeida/Desktop/ProfessorSysCecilia.txt");
        try{
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            
        }catch (IOException erro){
            
        }
    }
}
