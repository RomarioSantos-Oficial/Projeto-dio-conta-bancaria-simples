import java.util.Scanner;
import java.util.Locale;
//import java.util.Random;

public class ContaTerminal {

   // private static final String Random = null;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner sacanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Numero da Conta");
            double NumeroConta =  sacanner.nextInt();

            System.out.println("Por favor, digite o número da Agência");
            String NumeroAgencia = sacanner.next();

            System.out.println("Por favor, digite seu Nome");
            String NomeCliente = sacanner.next();

            double Saldo = Double.valueOf("1237.48"); //O valor do saldo está pre determinado.
            //System.out.println("237.48");
            

            System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + NumeroAgencia+ ", conta " + NumeroConta + " e seu saldo "+ Saldo + " já está disponível para saque.");
        }
    }


}
