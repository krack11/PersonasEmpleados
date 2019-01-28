package personasempleados;

public class Empleado extends Persona {

    public int numEmpleado;

    public double salario;

    public Empleado() {
    }
    
    public Empleado(int numEmp, double sal){
        this.numEmpleado=numEmp;
        this.salario=sal;
        
    }
    
        public Empleado(int numEmp, double sal,String nom, String ape, int ed,Domicilio dom) {
        super(nom,ape,ed,dom);
        this.numEmpleado=numEmp;
        this.salario=sal;
    }
    
    public Empleado(int numEmp, double sal,String nom, String ape, int ed,String lo, String ca,int num) {
        super(nom,ape,ed,lo,ca,num);
        this.numEmpleado=numEmp;
        this.salario=sal;
    }
    
    public Empleado(int numEmp, double sal, Persona  p) {
        super(p.nombre,p.apellido,p.edad,p.domicilio);
        this.numEmpleado=numEmp;
        this.salario=sal;
    }
    
    public Empleado(Empleado e){
        this.apellido=e.apellido;
        this.nombre=e.nombre;
        this.numEmpleado=e.numEmpleado;
        this.salario=e.salario;
        this.domicilio.localidad=e.domicilio.localidad;
        this.domicilio.calle=e.domicilio.calle;
        this.domicilio.numero=e.domicilio.numero;
        
    }
    
    
    
    public int getNumEmpleado() {
        return this.numEmpleado;
    }

    public void setNumEmpleado(int val) {
        this.numEmpleado=val;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double val) {
        this.salario=val;
    }
    
    
    public void dimeQuienEres(){
        System.out.println("*** soy un EMPLEADOOOOOOO!!!");
    }
    

    
    @Override
    public String toString() {
        return ("NumEmpleado: " +numEmpleado + " Salario: " + salario + super.toString());
    }
}
