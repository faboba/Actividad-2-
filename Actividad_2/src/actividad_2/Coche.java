package actividad_2;

/**
 * @author AMAYA LANCHEROS
 */
class Coche { // Al generar una nueva clase lo que se busca es independizar las
                //operaciones que se van a realizar con los datos de los coches
                //cumpliendo asi el principio de Dependencia
    String marca;

    Coche(String marca) {
        this.marca = marca;
    }

    String getMarcaCoche() {
        return marca;
    }    
}
