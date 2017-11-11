
package syscolegio.model;

import javax.swing.JOptionPane;
import syscolegio.model.Pessoa;

public class Professor extends Pessoa {

    private String lattes;
    private String email;
    private String formacao;
    private String especialidade;
    private double salario;
    private int tipo;
    private int nivel;
    private double salarioBruto;
    private double inss;
    private double irrf;
    private double salarioSemInss;
    private double salarioLiquido;
    public double salarioNivel1;
    public double salarioNivel2;
    public double salarioNivel3;

    public void cadastrarProfessor() {
        super.cadastrarPessoa();
        lattes = JOptionPane.showInputDialog("Curriculo Lattes");
        email = JOptionPane.showInputDialog("email");
        formacao = JOptionPane.showInputDialog("Formação");
        especialidade = JOptionPane.showInputDialog("Especialidade");
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo"));
        nivel = Integer.parseInt(JOptionPane.showInputDialog("Entre com nivel - 1,2 ou 3 -"));
        calcularSalario();
    
    }

    public void exibirProf() {
        JOptionPane.showMessageDialog(null, super.exibirPessoa()
                + "\nLattes: " + lattes
                + "\nEmail: " + email
                + "\nFormação: " + formacao
                + "\nEspecialidade: " + especialidade
                + "\nTipo: " + tipo);
        
    }

    public double getSalarioBruto(){
        return salarioBruto;
    }
    public double getSalarioNivel(){
        if( nivel == 1){
        return salarioNivel1;
    }else if (nivel == 2){
        return salarioNivel2;
    }else if (nivel == 3){
        return salarioNivel3;
    }
        return 0;
    }  
    public void calcularSalario() {
        if (tipo == 1) {
            salarioBruto = 3225.33;
        } else if (tipo == 2) {
            salarioBruto = 6600.20;
        }
        if (salarioBruto <= 1556.94) {
            inss = salarioBruto / 100 * 8;
        } else if (salarioBruto > 1556.94 && salarioBruto <= 2594.92) {
            inss = salarioBruto / 100 * 9;
        } else if (salarioBruto > 2594.92 && salarioBruto <= 5189.82) {
            inss = salarioBruto / 100 * 11;
        } else if (salarioBruto > 5189.82) {
            inss = 5189.82 / 100 * 11;
        }
        salarioSemInss = salarioBruto - inss;
        if (salarioSemInss <= 1903.98) {
            irrf = 0;
        } else if (salarioSemInss >= 1903.99 && salarioSemInss <= 2826.65) {
            irrf = (salarioSemInss - 1903.99) / 100 * 7.5;
        } else if (salarioSemInss > 2826.65 && salarioSemInss <= 3751.05) {
            irrf = (salarioSemInss - 1903.99) / 100 * 15;
        } else if (salarioSemInss > 3751.05 && salarioSemInss <= 4664.68) {
            irrf = (salarioSemInss - 1903.99) / 100 * 22.5;
        } else if (salarioSemInss > 4664.68) {
            irrf = (salarioSemInss - 1903.99) / 100 * 27.5;
        }
        salarioLiquido = salarioSemInss - irrf;
    
     if(nivel == 1){
            salario = 3200;
            double imposto = (salario * 0.18); 
            double custo = (salario * 0.2);
            double lucro = (salario * 0.33);
             salarioNivel1 = salario + (imposto + custo + lucro);
        } else if (nivel == 2){
            salario = 5000;
            double imposto = (salario * 0.18); 
            double custo = (salario * 0.2);
            double lucro = (salario * 0.33);
             salarioNivel2 = salario + (imposto + custo + lucro);
        } else if (nivel == 3){
            salario = 7000;
            double imposto = (salario * 0.18); 
            double custo = (salario * 0.2);
            double lucro = (salario * 0.33);
             salarioNivel3 = salario + (imposto + custo + lucro);
        }
    }
}
