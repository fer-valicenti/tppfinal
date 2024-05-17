public class Mechanic extends Employee{
    //atributos

    private String parteAuto;

    //constructor


    public Mechanic(String nombre, int employeeId, String apellido, String parteAuto) {
        super(nombre, employeeId, apellido);
        this.parteAuto = parteAuto;
    }

    //get and set

    public String getParteAuto() {
        return parteAuto;
    }

    public void setParteAuto(String parteAuto) {
        this.parteAuto = parteAuto;
    }
}
