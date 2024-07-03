package MATH_KNOWLEDGE;

public class Math_greatestCommonDivisor_GCD {
    // Tìm ước chung lớn nhất bằng euclid
    public static int greatestCommonDivisor(int a, int b) {
        System.out.println(a + " " + b);
        if (b == 0) return a;
        return greatestCommonDivisor(b, a % b);
    }
    public static void main(String[] args) {
        int a = 26, b = 18;
        System.out.println(greatestCommonDivisor(a, b));
    }    
}
