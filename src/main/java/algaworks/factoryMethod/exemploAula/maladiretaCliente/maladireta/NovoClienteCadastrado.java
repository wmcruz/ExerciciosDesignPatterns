package algaworks.factoryMethod.exemploAula.maladiretaCliente.maladireta;

import algaworks.factoryMethod.exemploAula.maladiretaCliente.maladireta.xml.MalaDiretaXML;
import algaworks.factoryMethod.exemploAula.maladiretaLib.maladireta.MalaDireta;

import javax.swing.*;

public class NovoClienteCadastrado {

    public static void main(String[] args) {
        MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");

        String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem de novo cliente:");

        boolean status = malaDireta.enviarEmail(mensagem);

        JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
    }
}
