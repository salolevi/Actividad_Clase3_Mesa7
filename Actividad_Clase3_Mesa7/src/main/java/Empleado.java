import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Empleado extends Vendedor{


    public Empleado(String name, int antiguedad, int puntos) {
        super(name, antiguedad, puntos);
        setPuntos(getPuntos()+antiguedad*5);
    }

    public void conseguirAfiliado() {
        setPuntos(getPuntos()+10);
    }

    @Override
    public void vender() {
        setPuntos(getPuntos()+5);
    }
}
