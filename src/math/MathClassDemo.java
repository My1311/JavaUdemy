package math;

public class MathClassDemo {
    public static void main (String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(3, 10));
        System.out.println(Math.min(3, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));

        System.out.println(Math.sqrt(-1)); // NaN
        System.out.println(0 / 0.0);    // NaN
        System.out.println((0 / 0.0) + 5);      // NaN

        System.out.println(5/0.0);  // Infinity
        System.out.println(-5/0);   // -Infinity
        System.out.println(Math.round(20.0/3.0));  // 7
        System.out.println(Math.round(20.0* 100.0/3) / 100.0); // 6.67

        System.out.println(Math.random()); // Random number between 0.0 and 1.0
        System.out.println((int)(Math.random() * 100)); // Random number between 0 and 100

    }
}