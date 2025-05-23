public class EstuPresencial extends Estudiante{
    public String horas_presenciales;
    public String horario;

    public EstuPresencial(String cedula, String nombre, String direccion, String correo, String telefono, String año, String carrera, String nivel, String horas_presenciales, String horario) {
        super(cedula, nombre, direccion, correo, telefono, año, carrera, nivel);
        this.horas_presenciales=horas_presenciales;
        this.horario=horario;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Horas presenciales: "+horas_presenciales);
        System.out.println("Horario: "+horario);
    }
}
