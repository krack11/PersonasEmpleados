package personasempleados;

public class Comercial extends Empleado {

    private String zona;

    private double comision;

    public Comercial() {
    }

    public Comercial(String zon, double com){
        this.zona=zon;
        this.comision=com;
    }
    
        public Comercial(Empleado e,String zon, double com){
        super(e);
        this.zona=zon;
        this.comision=com;
    }
    
    
    public Comercial(String zon, double comi,int numEmp, double sal, Persona p){
        super(numEmp, sal, p);
        this.zona=zon;
        this.comision=comi;
    }
    public Comercial(String zon, double comi,int numEmp, double sal,String nom, String ape, int ed,String lo, String ca,int num){
        super(numEmp, sal, nom, ape, ed, lo, ca, num);
    }
    
    public String getZona() {
        return this.zona;
    }

    public void setZona(String val) {
        this.zona=val;
    }

    public double getComision() {
        return this.comision;
    }

    public void setComision(double val) {
        this.comision=val;
    }
    
    
    
    
    @Override
    public String toString() {
        return ("Zona: " +zona + " Comision: " + comision + super.toString());
    }
}
