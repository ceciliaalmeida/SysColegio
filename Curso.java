
package syscolegio.model;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Curso {
    public String nomeC;
    public int cargaH;
    public double valor;
    public String descricao;
    public Professor professor;
    public ArrayList<Aluno> alunosMatriculados ;
   
    public void cadastrarCurso(){
        nomeC = JOptionPane.showInputDialog("Nome do Curso");
        descricao = JOptionPane.showInputDialog("Descrição do curso");
        cargaH = Integer.parseInt(JOptionPane.showInputDialog("Carga Horario do curso"));
        valor = Integer.parseInt(JOptionPane.showInputDialog("Valor do curso"));
        alunosMatriculados = new ArrayList<>();
        
    }
    
    public void calculaCusto(){
        valor = professor.getSalarioBruto() / alunosMatriculados.size();
        System.out.println(valor);
    }
    public void calcularCustoNivel(){
        double valorNivel = professor.getSalarioNivel() / alunosMatriculados.size();
        System.out.println(valorNivel);
    }
   
    public void matricularAluno(Aluno aluno){
        alunosMatriculados.add(aluno);
    }
    
    public List<Aluno> getAlunosMatriculados(){
        return this.alunosMatriculados;
    }
    
    public void exibirCurso(){
        calculaCusto();
        String dados = "Nome: " + nomeC
                + "\nDescricao: " + descricao
                + "\nCarga Horaria: " + cargaH
                + "\nValor: " + valor
                +"\nProfessor: " + professor.nome;
        JOptionPane.showMessageDialog(null, dados);
    }

    public void cadastrarProf(Professor professor) {
        this.professor = professor;
    }
}
