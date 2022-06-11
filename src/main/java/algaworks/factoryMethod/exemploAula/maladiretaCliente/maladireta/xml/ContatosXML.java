package algaworks.factoryMethod.exemploAula.maladiretaCliente.maladireta.xml;

import algaworks.factoryMethod.exemploAula.maladiretaLib.contato.Contato;
import algaworks.factoryMethod.exemploAula.maladiretaLib.contato.Contatos;
import com.thoughtworks.xstream.XStream;

import java.net.URL;
import java.util.List;

public class ContatosXML implements Contatos {

    private String nomeArquivo;

    public ContatosXML(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public List<Contato> todos() {
        XStream xstream = new XStream();
        xstream.alias("contatos", List.class);
        xstream.alias("contato", Contato.class);

        URL arquivo = this.getClass().getResource("/" + nomeArquivo);
        return (List<Contato>) xstream.fromXML(arquivo);
    }
}
