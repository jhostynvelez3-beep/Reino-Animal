package pkgVida;

public class Controller {
    public static void main(String[] args){
        Flora flora1 = new Flora("Manzano", "Malus domestica", "Huerto", true);
        Fauna fauna1 = new Fauna("Tigre", "Panthera tigris", "Selva", "Carnívoro");

        System.out.println("Información de la Flora:");
        System.out.println("Nombre: " + flora1.getNombre());
        System.out.println("Especie: " + flora1.getEspecie());
        System.out.println("Región: " + flora1.getRegion());
        System.out.println("Tiene frutos: " + flora1.getTieneFrutos());

        System.out.println("\nInformación de la Fauna:");
        System.out.println("Nombre: " + fauna1.getNombre());
        System.out.println("Especie: " + fauna1.getEspecie());
        System.out.println("Región: " + fauna1.getRegion());
        System.out.println("Tipo de alimentación: " + fauna1.getTipoAlimentacion());

        System.out.println("\n--- Probando el Polimorfismo (@Override) ---");
        flora1.alimentarse();
        fauna1.alimentarse();
    }

}
