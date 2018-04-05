
package tecnicasdeprogramacion;


public class personaGenerica extends MetodosSteve{
    private String nombre;
    private String apellido;
    private String DNI;
    private byte edad;
    private String domicilio;
    private int telefono;
    public personaGenerica(){
        nombre="";
        apellido="";
        DNI="";
        edad=0;
        domicilio="";
        telefono=0;
        
    }
    
    
    
    public void setNombre(String a){
        boolean hayNumero=false;
        char palabraMayor;
        
        
        for (int i = 0; i < a.length(); i++){
            if(a.charAt(0)>96 && a.charAt(0)<123){
                  
                }
            
            if(a.charAt(i)<65 || a.charAt(i)>90 && a.charAt(i)<97 || a.charAt(i)>122){
                hayNumero=true;
            
        }
        }
            if(hayNumero==false){
                this.nombre=primeraMayuscula(a);
            }else{
                this.nombre=null;
            }
        
        
    }
    public void setApellido(String a){
        boolean hayNum=false;
        for (int i = 0; i < a.length(); i++) 
        {
        if(a.charAt(i)<65 || a.charAt(i)>90 && a.charAt(i)<97 || a.charAt(i)>122) {
            hayNum=true;
        }   
        }
        if (hayNum==true){
            this.apellido=null;    
        }else{
            this.apellido=primeraMayuscula(a);    
        }
    }
        
    public void setDNI(String a){
          
        this.DNI=verificarDni(a);
        
    }
    public void setEdad(byte a){
        this.edad=a;
    }
    public void setDomicilio(String a){
        this.domicilio=a;
    }
    public void setTelefono(int a){
        this.telefono=a;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDNI(){
        return DNI;
    }
    public byte getEdad(){
        return edad;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public int getTelefono(){
        return telefono;
    }
    
    /**
     * Esta funcion recive un string de cualquier tamanio y 
     * devuelve el mismo pero con la primer letra en mayuscula
     * @param nombre
     * @return 
     */
    private String primeraMayuscula(String nombre){

     
    String primerLetra = nombre.substring(0, 1);
    String loQueQueda = nombre.substring(1);
    
    String primeraEnMayuscula = primerLetra.toUpperCase();
    
    return primeraEnMayuscula.concat(loQueQueda);
    
    }
    
    private String verificarDni (String numerodni){
        boolean dniok=true;
         for (int i = 0; i < numerodni.length(); i++) 
        {
        if(numerodni.charAt(i)<48 || numerodni.charAt(i)>57) {
            dniok=false;
        } 
        
        }
         if(dniok==false){
                this.DNI=null;
            }else{
                this.DNI=numerodni;
            }
        return DNI;
    }

    }
 

