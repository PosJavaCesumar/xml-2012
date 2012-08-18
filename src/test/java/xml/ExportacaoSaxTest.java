package xml;

import entidade.Medalha;
import entidade.Pais;
import entidade.QuadroDeMedalhas;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class ExportacaoSaxTest {

    @Test
    public void testExportar() throws Exception {
        QuadroDeMedalhas quadroDeMedalhas = QuadroDeMedalhasFactory.createQuadroDeMedalhas();
        ExportacaoSax exportacaoSax = new ExportacaoSax();
        exportacaoSax.exportar(quadroDeMedalhas, System.out);
    }
    
}