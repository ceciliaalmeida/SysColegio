
package syscolegio.model;

import javax.swing.JOptionPane;

public class Endereco {

    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String bairro;
    protected String cep;
    protected String cidade;
    protected String uf;

    public void cadastrarEndereco() {
        logradouro = JOptionPane.showInputDialog("Logradouro");
        numero = JOptionPane.showInputDialog("Numero");
        complemento = JOptionPane.showInputDialog("Complemento");
        bairro = JOptionPane.showInputDialog("Bairro");
        cep = JOptionPane.showInputDialog("CEP");
        cidade = JOptionPane.showInputDialog("Cidade");
        uf = JOptionPane.showInputDialog("UF");

    }

    public String exibirEnd() {
        String dados = "\nEndereço: " + logradouro
                + "\nNumero: " + numero
                + "\nComplemento: " + complemento
                + "\nCEP: " + cep
                + "\n Bairro: " + bairro
                + "\nCidade: " + cidade
                + "\nUF: " + uf;

        return dados;
    }
}
