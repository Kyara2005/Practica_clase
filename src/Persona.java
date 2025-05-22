public class Persona {
    //Atributos
    public String cedula;
    public String nombre;
    public String direccion;
    public String correo;
    public String telefono;

    //Constructor
    public Persona(String cedula, String nombre,String direccion, String correo, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    //Metodo
    public void mostrarInformacionPersonal() {
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
    }
}
