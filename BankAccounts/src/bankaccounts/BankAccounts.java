package bankaccounts;

import java.lang.Exception;
import bankaccounts.SavingsAccount;
import java.util.*;

/**
 *
 * @author Pablo
 */

public class BankAccounts  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BankAccount[] cuentasBanamex = new BankAccount[2];
      
cuentasBanamex[0].SavingsAccount(100.50,"Javier Hernandez","14",15.10);
cuentasBanamex[0].depositAmount(100.50);
cuentasBanamex[0].withdrawAmount(201);
cuentasBanamex[0].saveAccount("out.txt");

cuentasBanamex[1].setSaldo(Double.MAX_VALUE);
cuentasBanamex[1].depositAmount(Double.MAX_VALUE);
cuentasBanamex[1].setNombrePersona("Bill Gates");
cuentasBanamex[1].setFechaApertura(Calendar.getInstance(Locale.US));
cuentasBanamex[1].saveAccount("out.txt");

cuentasBanamex[2].SavingsAccount(600,"Marcelo Bielsa","0",6);
cuentasBanamex[2].depositAmount(300);
cuentasBanamex[2].withdrawAmount(1000);
cuentasBanamex[2].saveAccount("out.txt");
    }
    
}
