import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private ArrayList<Integer> lista = new ArrayList<>(List.of(10,20,30));

    @Test
    public void testSumarLista() {
        int resultado = App.sumarLista(lista);

        assertEquals(10+20+30, resultado);
    }

    @Test
    public void testPromedioLista() {
        double resultado = App.promedioLista(lista);

        assertEquals(20, resultado);
    }

}
