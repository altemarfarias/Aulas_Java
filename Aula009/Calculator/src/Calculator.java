public class Calculator {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("diminuir")) {
            minus(x, y);
        } else if (args[0].equals("dividir")) {
            share(x, y);
        } else if (args[0].equals("multiplicar")) {
            multiply(x, y);
        } else {
            System.out.println("Instrução inválida");
        }
    }
    static void sum(int x, int y){
        System.out.println(x + y);
    } // somar
    static void minus(int x, int y){
        System.out.println(x - y);
    } // subtrair
    static void share(int x, int y){
        System.out.println(x / y);
    } // dividir
    static void multiply(int x, int y){
        System.out.println(x * y);
    } // multiplicar

}
