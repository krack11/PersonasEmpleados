/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personasempleados;

/**
 *
 * @author alumno
 */
public class PersonasEmpleados {

    public static void main(String[] args) {
        
        
        Domicilio d1 = new Domicilio();
        Domicilio d2 = new Domicilio("Aravaca","C/Irlanda",1);
        Domicilio d3 = new Domicilio("Las Rozas","C/Ballena",35);
        
        Persona p0 = new Persona("Alvaro","Alvarez",24,d2);
        Persona p1 = new Persona("Julio","Batista",42,d1);
        Persona p2 = new Persona("Javier","Martinez",32,"Pozuelo","C/Oso",32);
        
        Empleado e0 = new Empleado();
        Empleado e1 = new Empleado(1000,2124.32,p0);
        Empleado e2 = new Empleado(1005,2244.21,"Raul","Jimenez",45,"Madrid","C/Pes",29);
        
        p0.apellido="jajajaja";
        
        Director d0 = new Director(e1,"Contabilidad",500);
        Tecnico t1 = new Tecnico(e2,"Mantenimiento");
        
        
        System.out.println("d1>"+d1);
        System.out.println("d2>"+d2);
        System.out.println("d3>"+d3);
        System.out.println("p0>"+p0);
        System.out.println("p1>"+p1);
        System.out.println("p2>"+p2);
        System.out.println("e0>"+e0);
        System.out.println("e1>"+e1);
        System.out.println("e2>"+e2);
        System.out.println("d0>"+d0);
        System.out.println("t1>"+t1);
        
        Persona[] p = new Persona[6];
        p[0]=new Persona("Javier","Martinez",32,"Pozuelo","C/Oso",32);
        p[1]=new Empleado(2,1500.25,"Javierin","Martinez",32,"Pozuelo","C/Oso",32);
        p[2]=new Director(e2,"Contabilidad",700);
        p[3]=new Tecnico(e2,"TecnicoLaboratorio");
        p[4]=new Comercial(new Empleado(2345,3500,"Alvaro","Alvarez",42,d2),"ZonaPozuelo",3450);
        p[5]=new Cliente(new Persona("pepito","grillo",22,new Domicilio("Pozuelo","C/...",9)),999);
        
        
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].toString()+"\n");
            p[i].dimeQuienEres();
            //p[i].miSalario();
        }
        
        
       
        
        
        
        
    }
    
}
