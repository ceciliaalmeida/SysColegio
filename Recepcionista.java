
package syscolegio.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Recepcionista extends Pessoa {
    private double salarioLiquido;
    private double salarioBruto = 1300;
    private double inss;
    private double salarioSemInss;
    private double irrf;
    
     public void cadastrarRecepcionista() {
        super.cadastrarPessoa();
       
    }
     
     public Recepcionista ExibirRecepcionista(Recepcionista rece){
            JOptionPane.showMessageDialog(null, super.exibirPessoa()
                + "\nSalario : " + salarioBruto);
       return  rece;         
     }
         public void calcularSalario() {

        if (salarioBruto <= 1556.94) {
            inss = salarioBruto / 100 * 8;
        }
        
        salarioSemInss = salarioBruto - inss;
        if (salarioSemInss <= 1903.98) {
            irrf = 0;
        }
        salarioLiquido = salarioSemInss - irrf;
    
}}
