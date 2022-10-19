import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasanteTest {

    @Test
    @DisplayName("Cuando un pasante muestra la categoria segun su puntuacion.")
    public void test1() {
        var pasante = new Pasante("Ramon",  0, 10);
        var pasante2 = new Pasante("Jose", 0, 90);

        assertEquals(pasante.mostrarCategoria(), pasante.getName() + " tiene un total de " + pasante.getPuntos() + " puntos. Categoriza como pasante novato.");
        assertEquals(pasante2.mostrarCategoria(), pasante2.getName() + " tiene un total de " + pasante2.getPuntos() + " puntos. Categoriza como pasante experimentado.");

    }
}
