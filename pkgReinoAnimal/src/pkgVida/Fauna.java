package pkgVida;

public class Fauna extends ReinoAnimal {
    private String tipoAlimentacion;

    public Fauna(String nombre, String especie, String region , String tipoAlimentacion) {
        super(nombre, especie, region);
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se está alimentando como " + tipoAlimentacion);
    }
}
