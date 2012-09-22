package importador;

import entidade.Eleicoes;
import java.io.InputStream;

public interface Importador {

    public Eleicoes importar(InputStream in) throws Exception;
    
}