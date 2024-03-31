public class Main {
    public static int calcularFatorial(int n){
        int fatorial = 1;
        for (int i = 1; i <= n; i++){
            fatorial *=i;
        }
        return fatorial;
    }
    public static void main(String[] args) {
        int number = 5;
        int fatorial = calcularFatorial(number);
        System.out.println("Fatorial de "+ number + ": " + fatorial);
    }
}