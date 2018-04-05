package tecnicasdeprogramacion;

public class Principal extends MetodosSteve{

    public static void main(String[] args) {
        personaGenerica persona1= new personaGenerica();
//        imprimir("ingrese el nombre de la persona");
        persona1.setNombre("edgar");
        persona1.setApellido("marg44onari");
        persona1.setDNI("184128lk56");
        persona1.setEdad((byte)50);
        persona1.setDomicilio("acropolis  1937");
        persona1.setTelefono(4607904);
        imprimir("la persona se llama:" + persona1.getNombre() +' '+persona1.getApellido());
        imprimir("la edad de la persona es: " + persona1.getEdad());
        imprimir("el DNI es: "+ persona1.getDNI());
        imprimir("el domicilio es: "+ persona1.getDomicilio());
        imprimir("El telefono es: " + persona1.getTelefono());
       }
    
}
