
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Yepes
 */
public class Conductor {
    
    private String driverName;
    private int driverIdentification;
    private int driverAge;
    private List<Vehiculo> vehiculos;
       
 public Conductor(String nombre, int cedula, int edad) {
        this.driverName = nombre;
        this.driverIdentification = cedula;
        this.driverAge = edad;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getDriverIdentification() {
        return driverIdentification;
    }

    public void setDriverIdentification(int driverIdentification) {
        this.driverIdentification = driverIdentification;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }
    
    
    
}
