import bin_oper.BinOps;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        //2ка в 2ой СС
        String a = "10";
        //3ка в 2ой СС
        String b = "11";
        System.out.printf("Результат сложения %s и %s: %s\n", a, b, binOps.sum(a, b));
        System.out.printf("Результат умножения %s и %s: %s\n", a, b, binOps.mult(a, b));
    }
}
