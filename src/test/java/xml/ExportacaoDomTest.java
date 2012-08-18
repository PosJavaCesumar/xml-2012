package xml;

import entidade.Medalha;
import entidade.Pais;
import entidade.QuadroDeMedalhas;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class ExportacaoDomTest {

    @Test
    public void testExportar() throws Exception {
        QuadroDeMedalhas quadroDeMedalhas = QuadroDeMedalhasFactory.createQuadroDeMedalhas();

        ExportacaoDom exportacaoDom = new ExportacaoDom();
        exportacaoDom.exportar(quadroDeMedalhas, System.out);
    }
}
