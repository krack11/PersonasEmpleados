package personasempleados;

public class Director extends Empleado {

    private String departamento;

    private int complementoDirector;

    public Director() {
    }
    
    public Director(String dep, int compDir){
        this.departamento=dep;
        this.complementoDirector=compDir;
    }
    public Director(Empleado e,String dep, int compDir){
        super(e);
        this.departamento=dep;
        this.complementoDirector=compDir;
    }
    
    public Director(String dep, int compDir,int numEmp, double sal, Empleado e){
        super(numEmp, sal, e);
        this.departamento=dep;
        this.complementoDirector=compDir;
    }
    public Director(String dep, int comDir,int numEmp, double sal,String nom, String ape, int ed,String lo, String ca,int num){
        super(numEmp, sal, nom,ape, ed, lo, ca, num);
    }
    
    
    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String val) {
        this.departamento=val;
    }

    public int getcomplementoDirector() {
        return this.complementoDirector;
    }

    public void setSalario(int val) {
        this.complementoDirector=val;
    }
    
    
    @Override
    public String toString() {
        return ("Departaemento: " +departamento + " ComplementoDirector: " + complementoDirector + super.toString());
    }
}
