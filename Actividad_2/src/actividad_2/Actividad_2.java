package actividad_2;

public class Actividad_2 {

    private static class Renault extends Coche {

        @Override
        int precioMedioCoche() {
            return 5000000;
        }

        @Override
        int numAsientos() {
            return 5;
        }

        @Override
        String marca() {
            return "Renault";
        }
    }

    private static class Audi extends Coche {

        @Override
        int precioMedioCoche() {
            return 16000000;
        }

        @Override
        int numAsientos() {
            return 2;
        }

        @Override
        String marca() {
            return "Audi";
        }
    }

    private static class Mercedes extends Coche {

        @Override
        int precioMedioCoche() {
            return 21000000;
        }

        @Override
        int numAsientos() {
            return 5;
        }

        @Override
        String marca() {
            return "Mercedes";
        }
    }

    private static class Ferrari extends Coche {//se extiende la clase Renault de Coche, Renault hereda de Coche.

        @Override
        int precioMedioCoche() {//Se debe cargar a la clase coche los atributos de precio, numasientos y marca para cumplir el principio Open Close
            return 14000000;
        }

        @Override
        int numAsientos() {
            return 2;
        }

        @Override
        String marca() { // La subclase marca es independiente de la super clase Ferrari ya que esta no esta directamente 
            //relacionada con la super clase para funcionar
            return "Ferrari";
        }

    }

    abstract class Coche { //Aqui se estan difiniendo los metodos que cargarán los respectivos parametros

        abstract int precioMedioCoche();

        abstract int numAsientos();

        abstract String marca();
    }

    public static void main(String[] args) {
        Coche[] arrayCoches = {
            new Renault(),
            new Audi(),
            new Mercedes(),
            new Ferrari(),};

        imprimirMarca(arrayCoches);
        imprimirPrecioMedioCoche(arrayCoches);
        imprimirNumAsientos(arrayCoches);
//        imprimirTabla(arrayCoches);

    }

    private static void imprimirMarca(Coche[] arrayCoches) {
        for (Coche coche : arrayCoches) {
            System.out.println("Marca: " + coche.marca());
        }
    }

    public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
        for (Coche coche : arrayCoches) {
            System.out.println("Precio: " + coche.precioMedioCoche());
        }
    }

    public static void imprimirNumAsientos(Coche[] arrayCoches) {
        for (Coche coche : arrayCoches) {
            System.out.println("No de Asientoss: " + coche.numAsientos());
        }
    }

//      Con este bloque de codigo podemos imprimir los datos en forma de tabla
//    private static void imprimirTabla(Coche[] arrayCoches) {
//        for (Coche coche : arrayCoches) {
//            System.out.println("Marca: "+coche.marca()+" |"+"Numero de Asientos: "+coche.numAsientos()+" |"+"Precio Coche: "+coche.precioMedioCoche());
//        }
//    }
}
