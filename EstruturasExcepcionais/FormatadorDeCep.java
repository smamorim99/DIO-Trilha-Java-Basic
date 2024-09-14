public class FormatadorDeCep extends Exception{
    public static void main(String[] args) {
    try {
        String cepFormatado = formatarCep("28222522");
        System.out.println(cepFormatado);
    }
    catch (FormatadorDeCep e) {
        e.printStackTrace();
        System.out.println("O cep não correponde com as regras de exceção");
    }
}
    static String formatarCep (String cep) throws FormatadorDeCep {
        if (cep.length() != 8) 
            throw new FormatadorDeCep();

            return "00000000";
            
}
    }

