package pkgVida;

public class ReinoAnimal {
    protected String nombre;
    protected String especie;
    protected String region;



public ReinoAnimal(String nombre, String especie, String region) {
        this.nombre = nombre;
        this.especie = especie;
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void alimentarse() {
        System.out.println(nombre + " se está alimentando.");
    }

}
