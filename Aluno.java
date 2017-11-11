
package syscolegio.model;

import javax.swing.JOptionPane;
import syscolegio.model.Curso;
import syscolegio.model.Pessoa;

public class Aluno extends Pessoa {

    private int matricula; 
    private Curso curso;
    private String celular;
    public String nome;
    
    public Aluno(){}
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setCurso(Curso c){
        this.curso = c;
    }
    
    public void cadastrarAluno() {
        super.cadastrarPessoa();
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula"));
        celular = JOptionPane.showInputDialog("Celular");
}

    public void exibirAluno() {
        JOptionPane.showMessageDialog(null, super.exibirPessoa()
                + "\tnMatricula: " + matricula
                + "\tnCelular: " + celular
                +"\tnCurso: " + curso.nomeC);
    }

    
}
