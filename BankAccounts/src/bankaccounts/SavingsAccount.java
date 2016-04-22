package bankaccounts;


import java.io.*;
import java.util.Date;

/**
 *
 * @author Pablo
 */


public class SavingsAccount extends BankAccount {
    double interestRate;
    
    
SavingsAccount(){
super.BankAccount();
}

SavingsAccount(double saldo, String nombrePersona, String numCliente, double valor)throws Exception{
    super.BankAccount(saldo, nombrePersona, numCliente);
    if(interestRate<0){
throw new Exception("es negativo");
}else
this.interestRate=valor;
}

@Override
public String toString(){
Date dia = fechaApertura.getTime();
String x ="Nombre: "+nombrePersona+"\n"+"Num. Cliente: "+numCliente+"\n"+"Saldo: "+saldo+"\n" +"interestRate: "+interestRate + "\n"+"Fecha de Apertura: "+dia;
return (x);

}
    @Override
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
          writer.println(nombrePersona+","+numCliente+","+interestRate+","+saldo+","+fechaApertura);  
            writer.close();
           return 0;
    
    }
    
    @Override
    int saveSerialAccount(String nombreArchivo){
   try{
    FileOutputStream fileOut = new FileOutputStream(nombreArchivo+".ser");
   ObjectOutputStream out = new ObjectOutputStream(fileOut);
   out.writeObject(nombrePersona+","+numCliente+","+interestRate+","+saldo+","+fechaApertura);
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

