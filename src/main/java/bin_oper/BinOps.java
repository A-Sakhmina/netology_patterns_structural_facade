package bin_oper;

public class BinOps {
    public String sum(String a, String b) {
        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        int sum;
        sum = arg0 + arg1;
        String result;
        result = Integer.toBinaryString(sum);
        return result;
    }

    public String mult(String a, String b) {
        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        int mult;
        mult = arg0 * arg1;
        String result;
        result = Integer.toBinaryString(mult);
        return result;
    }
}
