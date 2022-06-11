package algaworks.factoryMethod.exemploAula.maladiretaCliente.maladireta.csv;

import algaworks.factoryMethod.exemploAula.maladiretaLib.contato.Contatos;
import algaworks.factoryMethod.exemploAula.maladiretaLib.maladireta.MalaDireta;

public class MalaDiretaCSV extends MalaDireta {

    private String nomeArquivo;

    public MalaDiretaCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosCSV(nomeArquivo);
    }
}
