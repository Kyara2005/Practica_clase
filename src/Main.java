public class Main {
    public static void main(String[] args){
        Estudiante estudiante= new Estudiante("2100661483","Julia","Norte","juliaxa@epn.edu.ec","2102553132132","2005","Quimica","Tercero");
        estudiante.mostrarInformacionPersonal();
        System.out.println("---Herencia a docente");
        Docente docente= new Docente("2156543213156","Jhonatan","Sur","@gmail.com","23132413","Desarrollo", 4);
        docente.mostrarInformacionPersonal();
        System.out.println("---Herencia Estudiante Presencial---");
        EstuPresencial presencial= new EstuPresencial("232131323", "Chica","Centro","@outlook","13132121","1999","Diseño","Cuarto","6","7-11");
        presencial.mostrarInformacionPersonal();
        System.out.println("----Herencia Estudiante virtual---");
        EstuVirtual virtual = new EstuVirtual("321321212","Kyara","Real Audiencia", "@gmail.com","033333","Software","Tercer nivel","Zoom","Yadira");
        virtual.mostrarInformacionPersonal();
        System.out.println("-----Herencia Docente en linea----");
        DocenteLinea linea= new DocenteLinea("23453454","Pedro","Sur","@hotmail.com","09999999","Gastronomia",8,"Permanente");
        linea.mostrarInformacionPersonal();
    }
}