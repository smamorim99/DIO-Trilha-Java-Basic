import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
public static void main(String[] args) {
    try {
    Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome:");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt ();

        System.out.println("Informe sua altura:");
        double altura = scanner.nextDouble();

            System.out.println("Olá meu nome é" + " " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura );
    
            scanner.close();
    
}
catch ( java.util.InputMismatchException e){
    System.err.println( "Os campo idade e altura precisam ser numéricos!");
}
}
}