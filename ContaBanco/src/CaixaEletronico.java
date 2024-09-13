

class InnerContaTerminal {
    public static void main(String[] args) {
     
        double saldo = Double.valueOf (args[0]);
        double valorSolicitado = 155.00;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado; 
            System.out.println ("Saldo Disponivel" + " " + saldo);
        }
        
        else if (valorSolicitado >= saldo){
        System.out.println("Deseja acessar o cheque especial?");}
        
       

        
        else System.out.println("Saldo Insuficiente");
        
        
        
       
        
       
        
        
        
    }
}



