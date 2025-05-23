public class Estudiante extends Persona {
    public String carrera;
    public String nivel;

    public Estudiante(String cedula, String nombre, String direccion, String correo, String telefono, String año, String carrera, String nivel){
        super(cedula,nombre,direccion,correo,telefono,año);
        this.carrera=carrera;
        this.nivel=nivel;
    }
    //MEtodo
    @Override
    public void mostrarInformacionPersonal(){
        super.mostrarInformacionPersonal(); //Hereda el metodo de la clase Padre
        System.out.println("Carrera: "+carrera);
        System.out.println("nivel: "+nivel);
    }
    public void calcularEdad(int añoactual, int añoNacimiento) {
        int edad = añoactual - añoNacimiento;
        System.out.println("Edad: " + edad);
    }
}
