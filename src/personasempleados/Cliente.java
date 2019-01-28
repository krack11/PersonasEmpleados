package personasempleados;

public class Cliente extends Persona {

    private int numCliente;

    public Cliente() {
    }
    
    public Cliente(String nom,String ape, int ed,String lo, String ca,int num,int numCli) {
        super(nom,ape,ed,lo,ca,num);
        this.numCliente=numCli;
    }
    
        public Cliente(int numCli,String nom,String ape, int ed,Domicilio dom) {
        super(nom,ape,ed,dom);
        this.numCliente=numCli;
    } 
    public Cliente(Persona  p,int numCli) {
        super(p.nombre,p.apellido,p.edad,p.domicilio);
        this.numCliente=numCli;
    }
    
    
    public int getNumCliente() {
        return this.numCliente;
    }

    public void setNumCliente(int val) {
        this.numCliente=val;
    }


    
  
    @Override
    public String toString() {
        return ("NumCliente: " +numCliente + super.toString());
    }
}
