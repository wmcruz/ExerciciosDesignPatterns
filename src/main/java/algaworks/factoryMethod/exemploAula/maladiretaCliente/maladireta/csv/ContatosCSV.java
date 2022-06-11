package algaworks.factoryMethod.exemploAula.maladiretaCliente.maladireta.csv;

import algaworks.factoryMethod.exemploAula.maladiretaLib.contato.Contato;
import algaworks.factoryMethod.exemploAula.maladiretaLib.contato.Contatos;
import au.com.bytecode.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class ContatosCSV implements Contatos {

    private String nomeArquivo;

    public ContatosCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public List<Contato> todos() {
        List<Contato> contatos = new ArrayList<>();
        CSVReader csvReader = null;

        try {
            URI uri = this.getClass().getResource("/" + nomeArquivo).toURI();
            File arquivoCsv = new File(uri);
            FileReader fileReader = new FileReader(arquivoCsv);
            csvReader = new CSVReader(fileReader);
            String [] nextLine;

            while ((nextLine = csvReader.readNext()) != null) {
                contatos.add(new Contato(nextLine[0].trim(), nextLine[1].trim()));
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro lendo arquivo csv", e);
        } finally {
            try {
                csvReader.close();
            } catch (IOException e) { }
        }

        return contatos;
    }
}
