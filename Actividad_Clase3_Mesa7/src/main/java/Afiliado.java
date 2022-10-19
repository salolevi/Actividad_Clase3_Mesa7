import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Afiliado extends Vendedor{

    public Afiliado(String name, int antiguedad, int puntos) {
        super(name, antiguedad, puntos);
    }

    @Override
    public void vender() {
        setPuntos(getPuntos()+15);
    }


}
