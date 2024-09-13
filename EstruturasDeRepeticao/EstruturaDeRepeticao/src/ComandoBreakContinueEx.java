public class ComandoBreakContinueEx {
public static void main(String[] args) {
   for (int numero = 1; numero <= 5; numero ++){
        if (numero == 3)
              continue;
//break = para todo o processo, no exemplo, conta somente até 2 e encerra o programa;//
//continue = já esse comando, conta até o numero 2, quebra o processo de contagem no numero 3, ou seja não o imprime, e após segue o processo contando até o numero final, no caso 5//
              
    System.out.println(numero);
   } 
    
}
}
