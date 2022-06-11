package algaworks.factoryMethod.exemploAula.maladiretaCliente;

import algaworks.factoryMethod.exemploAula.maladiretaCliente.maladireta.csv.MalaDiretaCSV;
import algaworks.factoryMethod.exemploAula.maladiretaLib.maladireta.MalaDireta;

import javax.swing.*;

public class RelacionamentoCliente {

    public static void main(String[] args) {
        MalaDireta malaDireta = new MalaDiretaCSV("contatos.csv");

        String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");

        boolean status = malaDireta.enviarEmail(mensagem);

        JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
    }
}
