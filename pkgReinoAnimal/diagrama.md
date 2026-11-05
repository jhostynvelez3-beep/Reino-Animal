```mermaid
classDiagram
    direction TB

    class ReinoAnimal {
        # String nombre
        # String especie
        # String region
        + ReinoAnimal(nombre, especie, region)
        + getNombre() String
        + setNombre(nombre) void
        + getEspecie() String
        + setEspecie(especie) void
        + getRegion() String
        + setRegion(region) void
        + alimentarse() void
    }

    class Fauna {
        - String tipoAlimentacion
        + Fauna(nombre, especie, region, tipoAlimentacion)
        + getTipoAlimentacion() String
        + setTipoAlimentacion(tipoAlimentacion) void
        + alimentarse() void
    }

    class Flora {
        - Boolean tieneFrutos
        + Flora(nombre, especie, region, tieneFrutos)
        + getTieneFrutos() Boolean
        + setTieneFrutos(tieneFrutos) void
        + alimentarse() void
    }

    class Controller {
        + main(args) void$
    }

    ReinoAnimal <|-- Fauna : extends
    ReinoAnimal <|-- Flora : extends
    Controller ..> Flora : crea
    Controller ..> Fauna : crea