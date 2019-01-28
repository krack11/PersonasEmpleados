package personasempleados;

public class Tecnico extends Empleado {

    private String especialidad;

    public Tecnico() {
    }
    
    public Tecnico(String espe){
        this.especialidad=espe;
    }
    
    public Tecnico(Empleado e,String espe){
        super(e);
        this.especialidad=espe;
    }
    
    
    public Tecnico(String espe,int numEmp, double sal, Empleado e){
        super(numEmp, sal, e);
        this.especialidad=espe;
    }
    public Tecnico(String espe,int numEmp, double sal,String nom,String ape, int ed,String lo, String ca,int num){
        super(numEmp, sal, nom,ape, ed, lo, ca, num);
    }
    
    
    public String getEspecilidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String val) {
        this.especialidad=val;
    }
    
    @Override
    public String toString() {
        return ("Especialidad: " +especialidad + super.toString());
    }
}
