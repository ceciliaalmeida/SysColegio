
package syscolegio.model;

import javax.swing.JOptionPane;

public class Pessoa {

    protected String nome;
    protected String dtnas;
    protected short idade;
    protected String rg;
    protected String cpf;
    protected String fone;
    protected Endereco endereco;

    public Pessoa(){}

    public void cadastrarPessoa() {

        nome = JOptionPane.showInputDialog("Nome");
        dtnas = JOptionPane.showInputDialog("Data de nascimento");
        idade = (short) Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        rg = JOptionPane.showInputDialog("RG");
        cpf = JOptionPane.showInputDialog("CPF");
        fone = JOptionPane.showInputDialog("Telefone");
        endereco = new Endereco();
        endereco.cadastrarEndereco();
    }

    public String exibirPessoa() {
        String dados = "\nNome: \t" + nome
                + "\nData de Nascimento:\t " + dtnas
                + "\nIdade:\t " + idade
                + "\nRG: \t" + rg
                + "\nCPF: \t" + cpf
                + "\nTelefone:\t " + fone
                + endereco.exibirEnd();
        return dados;
    }
}
