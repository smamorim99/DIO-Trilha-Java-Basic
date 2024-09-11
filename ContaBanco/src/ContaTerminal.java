public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente =  args [0];
        String sobrenomeCliente = args [1];
        int numeroDaConta = Integer.valueOf (args [2]);
        String agencia = args [3];
        double saldo = Double.valueOf(args [4]);

        System.out.println("Meu nome é " + nomeCliente + " " + sobrenomeCliente);
        System.out.println("Informe o número da conta: " + numeroDaConta);
        System.out.println("Infome a sua Agencia: " + agencia);
        System.out.println("Saldo disponivel: " + saldo);

    }
}
