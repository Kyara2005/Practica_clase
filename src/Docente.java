public class Docente extends Persona {
    public String facultad;
    public int horasAsignadas;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String facultad, int horasAsignadas){
        super(cedula, nombre, direccion, correo, telefono);
        this.facultad=facultad;
        this.horasAsignadas=horasAsignadas;
    }


}
