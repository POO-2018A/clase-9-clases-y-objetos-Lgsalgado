package deberMartes08;


import java.util.Date;


public class Persona {

    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String cedula;
    private String cedulaAux; // este atributo nos permitira almacenar la cedula completa despues de verificarla

    Persona(){}

    Persona(String nombre, String apellido, String cedula, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {

        return cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setCedula(String cedula){
        if (cedulaValida(cedula)){
            this.cedula=cedula;
        }else{
            System.out.println("Cedula no valida");
        }
    }
    public void setFechaNacimiento(){
        this.fechaNacimiento=fechaNacimiento;
    }
    private boolean cedulaValida(String cedula){

        int coeficientes[]={2,1,2,1,2,1,2,1,2};
        int ced[]={0,0,0,0,0,0,0,0,0};
        int aux=0; //Esta variable nos permitira como un auxiliar para realizar operaciones
        int acu=0; //variable donde se ira acumulando la suma de los valores multiplicados;

        for (int i=0;i<9;++i){
            ced[i]=Integer.valueOf(cedula.substring(i,i+1));
        }
        if (ced[0]<0 || ced[0]>2){
            System.out.println("Primer digito de cedula incorrecto");
            return false;
        }
        if (ced[0]==2 && ced[1]>4){
            System.out.println("Segundo digito de cedula incorrecto");
            return false;

        }
        if (ced[2]<0 || ced[2]>5){
            System.out.println("Tercer digito de cedula incorrecto");
            return false;
        }

        for (int i=0;i<9;i++){
            ced[i]=ced[i]*coeficientes[i];
            if(ced[i]>10 || ced[i]==10){
                ced[i]=ced[i]-9;
            }
            acu=acu+ced[i];
            aux=acu;

        }
        System.out.println();
        while (aux%10!=0){ //En este bucle se verifica la decena superior y
            aux++;         // se la almacena en auxliar para restarle despues
        }
        aux=aux-acu;
        cedula= cedula + Integer.toString(aux);
        cedulaAux=cedula;
        return true;

    }


    public static void main(String[] args){
        Persona p1= new Persona();
        p1.fechaNacimiento=new Date("1991/07/05");

        p1.setNombre("GABRIEL");
        p1.setApellido("SALGADO");
        p1.setCedula("172016137-");
        if (p1.cedulaAux!=null){
            System.out.println("SUS DATOS SON LOS SIGUIENTES");
            System.out.printf(p1.nombre+" ");
            System.out.println(p1.apellido);
            System.out.println("Su fecha de nacimiento es:"+p1.fechaNacimiento);
            System.out.println("SU CEDULA COMPLETA ES: "+p1.cedulaAux);
        }


    }
}
