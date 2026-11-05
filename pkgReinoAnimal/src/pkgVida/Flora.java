package pkgVida;

public class Flora extends ReinoAnimal {
    private Boolean tieneFrutos;

    public Flora(String nombre, String especie, String region, Boolean tieneFrutos) {
        super(nombre, especie, region);
        this.tieneFrutos = tieneFrutos;
    }

    public Boolean getTieneFrutos() {
        return tieneFrutos;
    }

    public void setTieneFrutos(Boolean tieneFrutos) {
        this.tieneFrutos = tieneFrutos;
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " está absorbiendo luz solar y nutrientes para la fotosíntesis.");
    }
}
