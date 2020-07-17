package actividad_2;

/**
 *
 * @author AMAYA LANCHEROS
 */
public class DatabasService {
    void getDatos(){ //... }
}

class DatabaseService implements Conexion {

    @Override
    public Dato getDatos() { //... }

    @Override
    public void setDatos() { //... }
}

class APIService implements Conexion{

    @Override
    public Dato getDatos() { //... }

    @Override
    public void setDatos() { //... }
}
