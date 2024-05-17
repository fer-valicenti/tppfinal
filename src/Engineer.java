public class Engineer extends Employee{
    //Atributos
    private String especialidad;
    //contructor

    public Engineer(String nombre, int employeeId, String apellido, String especialidad) {
        super(nombre, employeeId, apellido);
        this.especialidad = especialidad;
    }
    //get and set

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
