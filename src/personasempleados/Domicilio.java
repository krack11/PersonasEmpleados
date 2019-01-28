package personasempleados;

public class Domicilio {

   public String localidad;

    public String calle;

    public int numero;
    
    
    public Domicilio(){
        
    }

    public Domicilio(String lo, String cal, int num) {
        this.calle=cal;
        this.localidad=lo;
        this.numero=num;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String val) {
        this.localidad=val;
    }

    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String val) {
        this.calle=val;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int val) {
        this.numero=val;
    }
    
    @Override
    public String toString(){
        return("Localidad: " + localidad + " Calle: " + calle + " Numero: " + numero);
}
}
