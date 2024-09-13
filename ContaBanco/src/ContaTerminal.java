

import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
                System.out.println("Digite seu nome: ");
                 String nomeCliente = scanner.next();
                
                System.out.println("Digite seu sobrenome: ");
                 String sobrenomeCliente = scanner.next();

                System.out.println("Informe o numero da sua conta: ");
                 int numeroDaConta = scanner.nextInt();

                System.out.println("Irfome o numero da sua agencia: ");
                 String agencia = scanner.next();
                 scanner.close();
            double saldo =  Double.valueOf (args[0]);
                  
            System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + " " 
            + "obrigado por criar uma conta em nosso banco, sua agencia é " 
            + agencia + ", " + "conta numero " 
            + numeroDaConta + " " + "e seu saldo já se encontra disponivel para saque." );
            
            System.out.println("Saldo disponivel: " + saldo );
    
    
            
        

        
    } 
        
}
