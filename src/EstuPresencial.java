public class EstuPresencial extends Estudiante{
    public String horas_presenciales;
    public String horario;

    public EstuPresencial(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, String horas_presenciales,String horario) {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.horas_presenciales=horas_presenciales;
        this.horario=horario;
    }
}
