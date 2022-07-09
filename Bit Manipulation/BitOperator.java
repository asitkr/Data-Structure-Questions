public class BitOperator {
    public static void main(String[] args) {
        int a = 2; // 0010
        int b = 4; // 0100
        System.out.println(a & b); // 0000 = 0
        System.out.println(a | b); // 0110 = 6
        // ~
        System.out.println(~a); // 0001
        System.out.println(~b); // 0011

        System.out.println(a << 1); // 0100
        //System.out.println(2 << a); // 10000
        //System.out.println(b >> 1); // 0010
        //System.out.println(b >> 2); // 0001
    }
}
