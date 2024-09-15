public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("Iniciando método MAIN.");
        a();
        System.out.println("Finalizando método MAIN.");
    }
    static void a() {
        System.out.println("iniciando método A.");
        b();
        System.out.println("finalizando método A!");
    }
    public static void b() {
        System.out.println("iniciando método B");
        for (int i = 0; i <= 4; i ++ ) 
        System.out.println(i);
        c();
        System.out.println("Finalizando método B");
    }
    public static void c() {
        System.out.println("Iniciando método final C");
        
        //Lemos a dumpStack de cima para baixo (método C --> B --> A --> MAIN)
        Thread.dumpStack();

        System.out.println("Finalizando o método C!");
    }
}