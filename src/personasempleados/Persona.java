package personasempleados;

public class Persona {

    public String nombre;

    public String apellido;
    
    public int edad;

    public Domicilio domicilio;

    public Persona() {
        this("Noname","Noape",0, new Domicilio("Lne","Cne",0));
    }
    
    public Persona(String n, String ape,int e, Domicilio d) {
        this.nombre=n;
        this.apellido=ape;
        this.edad=e;
        this.domicilio=d;
    }
    
    public Persona(String n,String ape, int e, String dL, String dC, int dN) {
        this.nombre=n;
        this.apellido=ape;
        this.edad=e;
        this.domicilio=new Domicilio(dL,dC,dN);
    }
    
    public Persona(Persona p){
        this.nombre=p.nombre;
        this.apellido=p.apellido;
        this.edad=p.edad;
        this.domicilio= new Domicilio(p.domicilio.localidad,
                                      p.domicilio.calle,
                                      p.domicilio.numero);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String val) {
        this.nombre=val;
    }
    
    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String val) {
        this.apellido=val;
    }
    
    

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int val) {
        this.edad=val;
    }
   
    
    public Domicilio getDomicilio(){
        return this.domicilio;
    }
    
    
    public void setDomicilio(Domicilio dom){
        this.domicilio=dom;
    }
    
    public void dimeQuienEres(){
        System.out.println("*** soy una PERSONAAAAA!!!");
    }
    
    

    @Override
    public String toString() {
        return ("Nombre: " +nombre + " Edad: " + edad + " Domicilio: " + domicilio);
    }
   
}
