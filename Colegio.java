
package syscolegio.model;

import syscolegio.model.Recepcionista;
import syscolegio.model.Curso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Colegio {

   
    {
        int opc = 0;   
        String nomecur;
        Aluno aluno = new Aluno();
        Professor professor;
        ArrayList<Curso> cursos = new ArrayList<>();
        Recepcionista recepcionista = new Recepcionista ();
         
        while(opc!=8){
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
            +"\n1 - Cadastrar Aluno"
            +"\n2 - Cadastrar Professor"
            +"\n3 - Cadastrar Curso"
            +"\n4 - Cadastrar Recepcionista "
            +"\n5 - Exibir Recepcionista"
            +"\n6 - Exibir Curso"
            +"\n7 - Exibir Aluno"
            + "\n8 - Exibir Professor"));
            
            switch(opc) {
                case 1: 
                    if(cursos.isEmpty())
                        JOptionPane.showMessageDialog(null, 
                         "Impossível cadastrar alunos. Não há um curso cadastrado ainda.", 
                         "Erro", JOptionPane.ERROR_MESSAGE);
                    else{
                    aluno.cadastrarAluno();
                    nomecur = JOptionPane.showInputDialog("Nome do Curso");
                    for(Curso c : cursos){
                        if(c.nomeC.toLowerCase().equals(nomecur.toLowerCase())){
                            c.matricularAluno(aluno);
                            aluno.setCurso(c);
                        }
                    }
                    }
                break;
                case 2:
                    if(cursos.isEmpty())
                        JOptionPane.showMessageDialog(null, 
                         "Impossível cadastrar professor. Não há um curso cadastrado ainda.", 
                         "Erro", JOptionPane.ERROR_MESSAGE);
                    else{
                    professor = new Professor();
                    professor.cadastrarProfessor();
                    nomecur = JOptionPane.showInputDialog("Nome do Curso");
                    for(Curso c : cursos){
                        if(c.nomeC.toLowerCase().equals(nomecur.toLowerCase()))
                            c.cadastrarProf(professor);
                    }
                    }
                break;
                case 3: 
                    Curso curso = new Curso();
                    curso.cadastrarCurso();
                    cursos.add(curso);
                break;
                case 4: 
                    recepcionista.cadastrarRecepcionista();
                    
                break;
                   case 5: 
                      recepcionista.ExibirRecepcionista(recepcionista);
                break;
                case 6: 
                    nomecur = JOptionPane.showInputDialog("Nome do Curso");
                    for(Curso c : cursos){
                        if(c.nomeC.toLowerCase().equals(nomecur.toLowerCase())){
                            c.exibirCurso();
                            String r = "";
                            for(Aluno a : c.getAlunosMatriculados()){
                                r += a.nome + " \n";
                            }
                            JOptionPane.showMessageDialog(null, r, "Alunos Matriculados", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                break;                    
                case 7:
                    int mat = Integer.parseInt(JOptionPane.showInputDialog("Matricula do aluno: "));
                    for(Curso c : cursos){
                        for(Aluno a : c.getAlunosMatriculados()){
                            if(a.getMatricula()==mat)
                                a.exibirAluno();
                        }
                    }
                case 8:
                     nomecur = JOptionPane.showInputDialog("Nome do curso que o professor está cadastrado");
                    for(Curso c : cursos){
                        if(nomecur.toLowerCase().equals(c.nomeC.toLowerCase()))
                            c.professor.exibirProf();
                    }
                    break;
            }
        }

    }
    
}
