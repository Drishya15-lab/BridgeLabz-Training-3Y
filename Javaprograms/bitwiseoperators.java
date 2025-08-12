package Javaprograms;
public class bitwiseoperators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("Complement: " + (~a));
        System.out.println("Left Shift: " + (a << 2));
        System.out.println("Right Shift: " + (a >> 2));
    }
}
