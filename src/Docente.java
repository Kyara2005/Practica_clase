public class Docente extends Persona {
    public String facultad;
    public int horasAsignadas;  // Asegúrate de que el tipo sea 'int'

    // Constructor
    public Docente(String cedula, String nombre, String direccion, String correo, String telefono,
                   String facultad, int horasAsignadas) {
        super(cedula, nombre, direccion, correo, telefono,"2002");  // Llamada al constructor de Persona
        this.facultad = facultad;
        this.horasAsignadas = horasAsignadas;  // Aquí está donde asignas el valor de horas
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();  // Llamada al metodo
        System.out.println("Facultad: " + facultad);
        System.out.println("Horas asignadas: " + horasAsignadas);  // Asegúrate de que esta variable sea un 'int'
    }
}

