public class BitMask {
    public static void main(String[] args) {
        //int a = 5; // 0101
        //get Bit
        // int position = 3;
        // int bitMask = 1 << position;

        // if ((bitMask & a) == 0) {
        //     System.out.println("Position has zero");
        // }
        // else{
        //     System.out.println("Position has 1");
        // }

        // Set Bit
        // int position = 2;
        // int bitMask = 1 << position;
        // int newNumber = bitMask | a;
        // System.out.println(newNumber);
        

        // Clear Bit
        int a = 5; // 0101
        int position = 2;
        int bitMask = 1 << position; // 0100
        int notMask = ~(bitMask); //1011

        int newNumber = notMask & a; // 0001
        System.out.println(newNumber); // 0001
    }
}
