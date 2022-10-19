import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Vendedor {

    protected String name;
    protected int antiguedad;
    protected int puntos;

    public Vendedor(String name, int antiguedad, int puntos) {
        this.name = name;
        this.antiguedad = antiguedad;
        this.puntos = puntos;
    }


    public abstract void vender();

    public String mostrarCategoria() {
        if (this.puntos < 20) return "novato";
        if (this.puntos >= 20 && this.puntos<30) return "aprendiz";
        if (this.puntos >= 31 && this.puntos<40) return "bueno";
        if (this.puntos >= 40) return "maestro";

        return "Error";
    }
}
