package MATH_KNOWLEDGE;

public class Math_leastCommonMultiple_LCM {
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        return greatestCommonDivisor(b, a % b);
    }
    public static int leastCommonMultiple(int a, int b) {
        int GCD = greatestCommonDivisor(a, b);
        return (a * b) / GCD;
    }
    public static void main(String[] args) {
        int a = 26, b = 18;
        System.out.println(leastCommonMultiple(a, b));
    }
}
