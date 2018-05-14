package deberMartes08;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Archivo {
    private String nombre;
    private String tipo;
    private Date fechaCreacion;
    private String contiene;
    Archivo(){}

    Archivo(String nombre, String tipo, String contiene, Date fechaCreacion){

        this.nombre=nombre;
        this.tipo=tipo;
        this.contiene=contiene;
        this.fechaCreacion=fechaCreacion;
    }

    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public String getContiene(){
        return  contiene;
    }
    public Date getFechaCreacion(){
        return fechaCreacion;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setContiene(String contiene){
        this.contiene=contiene;
    }
    public void setFechaCreacion(Date nombre){
        this.fechaCreacion=fechaCreacion;
    }


    public static void main(String[] args){
        Archivo carpeta1= new Archivo();
        Archivo carpeta2= new Archivo();
        Archivo carpeta3= new Archivo();
        Scanner scan=new Scanner(System.in);

        carpeta1.nombre="CARPETA1";
        carpeta2.nombre="CARPETA2";
        carpeta3.nombre="CARPETA3";

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        carpeta1.fechaCreacion=new Date("2017/07/05");
        carpeta3.fechaCreacion=new Date("2014/10/07");
        carpeta2.fechaCreacion=new Date("2016/12/09");

        System.out.println("INGRESE EL TIPO DE CARPETA");
        System.out.println("CARPETA 1");
        carpeta1.tipo=scan.next();
        System.out.println("CARPETA 2");
        carpeta2.tipo=scan.next();
        System.out.println("CARPETA 3");
        carpeta3.tipo=scan.next();

        System.out.println("INGRESE EL CONTENIDO DE CARPETA");
        System.out.println("CARPETA 1");
        carpeta1.contiene=scan.next();
        System.out.println("CARPETA 2");
        carpeta2.contiene=scan.next();
        System.out.println("CARPETA 3");
        carpeta3.contiene=scan.next();
        System.out.println();

        System.out.println("LAS CARPETAS CON SUS PROPIEDADES SON LAS SIGUENTES: ");
        System.out.println("CARPETA 1");
        System.out.println("NOMBRE: "+carpeta1.nombre);
        System.out.println("TIPO: "+carpeta1.tipo);
        System.out.println("CONTENIDO: "+carpeta1.contiene);
        System.out.println("FECHA DE CREACION: "+carpeta1.fechaCreacion);
        System.out.println();
        System.out.println("CARPETA 2");
        System.out.println("NOMBRE: "+carpeta2.nombre);
        System.out.println("TIPO: "+carpeta2.tipo);
        System.out.println("CONTENIDO: "+carpeta2.contiene);
        System.out.println("FECHA DE CREACION: "+carpeta2.fechaCreacion);
        System.out.println();
        System.out.println("CARPETA 3");
        System.out.println("NOMBRE: "+carpeta3.nombre);
        System.out.println("TIPO: "+carpeta3.tipo);
        System.out.println("CONTENIDO: "+carpeta3.contiene);
        System.out.println("FECHA DE CREACION: "+carpeta3.fechaCreacion);
        System.out.println();


    }

}
