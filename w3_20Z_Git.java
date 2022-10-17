public class w3_20Z_Git {
    public static void main(String[] args) {
        int a = 10;
        wypiszInt("Liczba a",a);
        int b = 5;
        wypiszInt("Liczba b",b);
        int c = 15; //nowa instrukcja
        int suma = a + b;
        wypiszInt("Suma liczba a i b",suma);
    }
    private static void wypiszInt(String s, int a) {
        System.out.println(s + ": " + a);
    }
}
