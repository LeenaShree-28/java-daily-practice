package operators;

public class ShiftOperators {
    public static void main(String[] args) {
        // left shift
        System.out.println(10 << 2);// 10 * 2 ^ 2 = 10 * 4 = 40
        // right shift
        System.out.println(20 >> 2);// 20 / 2 ^ 2 = 20 / 4 = 5
        // unsigned right shift
        System.out.println(20 >>> 2);// For positive number, >> and >>> works same
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);// For negative number, >>> changes parity bit (MSB) to 0

        // precedence same
    }
}
