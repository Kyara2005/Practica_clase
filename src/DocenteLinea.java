public class DocenteLinea extends Docente {
    public String tipo_contrato;

    // Constructor sin validación
    public DocenteLinea(String cedula, String nombre, String direccion, String correo, String telefono,String facultad, int horasAsignadas, String tipo_contrato) {
        super(cedula, nombre, direccion, correo, telefono, facultad, horasAsignadas);
        this.tipo_contrato = tipo_contrato;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Tipo de contrato: " + tipo_contrato);
    }
}


