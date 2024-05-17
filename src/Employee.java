public class Employee
{
    //ATRIBUTOS

    private String nombre;
    private String apellido;
    private int employeeId;

    // constructor

    public Employee(String nombre, int employeeId, String apellido) {
        this.nombre = nombre;
        this.employeeId = employeeId;
        this.apellido = apellido;
    }

    //get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
