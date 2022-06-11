package algaworks.factoryMethod.exemploAula.maladiretaCliente.maladireta.xml;

import algaworks.factoryMethod.exemploAula.maladiretaLib.contato.Contatos;
import algaworks.factoryMethod.exemploAula.maladiretaLib.maladireta.MalaDireta;

public class MalaDiretaXML extends MalaDireta {

    private String nomeArquivo;

    public MalaDiretaXML(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosXML(nomeArquivo);
    }
}
