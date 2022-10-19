import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pasante extends Vendedor{
    public Pasante(String name, int antiguedad, int puntos) {
        super(name, antiguedad, puntos);
    }

    @Override
    public void vender() {
        setPuntos(getPuntos()+5);
    }

    @Override
    public String mostrarCategoria() {
        if (this.puntos < 50) return this.name + " tiene un total de " + this.puntos + " puntos. Categoriza como pasante novato.";
        else return this.name + " tiene un total de " + this.puntos + " puntos. Categoriza como pasante experimentado.";
    }
}
