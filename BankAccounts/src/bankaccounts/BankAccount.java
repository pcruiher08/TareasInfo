package bankaccounts;


import java.io.*;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Pablo
 */
public class BankAccount {
    double saldo; 
    String nombrePersona; 
    String numCliente; 
    Calendar fechaApertura; 
    
void BankAccount(){
saldo=0;
nombrePersona="";
numCliente="";
fechaApertura=null;
}
void BankAccount(double saldo, String nombrePersona, String numCliente){
this.saldo=saldo;
this.nombrePersona= nombrePersona; 
this.numCliente=numCliente;
fechaApertura=Calendar.getInstance(Locale.US);
}
@Override
public String toString(){
    Date dia = fechaApertura.getTime();
    SimpleDateFormat orden = new SimpleDateFormat("dd/mm/aaaa");
    String day = orden.format(dia);
       
String x ="Nombre: "+nombrePersona+"\n"+"Num. Cliente: "+numCliente+"\n"+"Saldo: "+saldo+"\n" + "Fecha de Apertura: "+day;
return (x);
}

void depositAmount(double monto) throws Exception{
    if(Double.isInfinite(monto)&&Double.MAX_VALUE<=monto)
    throw new Exception ("monto es muy grande");
    else
    saldo+=monto;
}
void withdrawAmount(double monto)throws  Exception{
    if(saldo-monto<0)
    throw new Exception("monto es muy grande");
    else
    saldo-=monto;
}

void getSaldo(){System.out.println("Saldo: "+saldo);}

void getNombrePersona(){System.out.println("Nombre Persona: "+nombrePersona);}

void getNumCliente(){System.out.println("Num. Cliente: "+numCliente);}

void getFechaApertura(){System.out.println("Fecha de apertura"+fechaApertura);}

void setSaldo(double t){this.saldo=t;}

void setNombrePersona(String Nombre){this.nombrePersona=Nombre;}

void setNumCliente(String num){ this.numCliente=num;}

void setFechaApertura(Calendar fechaApertura){this.fechaApertura=fechaApertura;}//terminar este


//ultimos dos metodos de guardar en archivos
int saveAccount(String nombreArchivo){
     String file = (nombreArchivo); //modificar esta linea con la ruta que se necesite
        PrintWriter writer = null;
        try{
        writer=new PrintWriter(new FileOutputStream(file, true));
        }
        catch (FileNotFoundException e){
        e.printStackTrace();
        return -1;
        }   
          writer.println(nombrePersona+","+numCliente+","+saldo+","+fechaApertura);  
            writer.close();
           return 0;
}
int saveSerialAccount(String nombreArchivo) throws FileNotFoundException, IOException{
    try{
    FileOutputStream fileOut = new FileOutputStream(nombreArchivo+".ser");
   ObjectOutputStream out = new ObjectOutputStream(fileOut);
   out.writeObject(nombrePersona+","+numCliente+","+saldo+","+fechaApertura);
   out.close();
   fileOut.close();
    }
   catch(IOException i){
           i.printStackTrace();
            return -1;
           }
   
return 0;
}


    
   

}

