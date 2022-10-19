import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmpleadoTest {

    @Test
    @DisplayName("Cuando un empleado realiza dos ventas, y consigue un afiliado.")
    public void test1() {
        //GIVEN
        var empleado = new Empleado("Karen", 4, 0);

        //WHEN
        empleado.vender();
        empleado.vender();
        empleado.conseguirAfiliado();

        //EXPECTED
        assertEquals(empleado.getName(), "Karen");
        assertEquals(empleado.getAntiguedad(), 4);
        assertEquals(empleado.getPuntos(), 40);

    }

    @Test
    @DisplayName("Cuando los empleados muestran la categoria segun su puntuacion.")
    public void test2() {
//        GIVEN
        var empleado1 = new Empleado("Salomon", 1, 5);
        var empleado2 = new Empleado("Tomas", 2, 10);
        var empleado3 = new Empleado("Francisco", 2, 25);
        var empleado4 = new Empleado("Karen", 4, 50);

//        WHEN

//        THEN
        assertEquals(empleado1.mostrarCategoria(), "novato");
        assertEquals(empleado2.mostrarCategoria(), "aprendiz");
        assertEquals(empleado3.mostrarCategoria(), "bueno");
        assertEquals(empleado4.mostrarCategoria(), "maestro");

    }

}
