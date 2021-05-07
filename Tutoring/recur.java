import java.util.Hashtable;

public class recur {
    private static Hashtable<Long, Long> mem = new Hashtable<>();;

    public static int factorial(int x) {
        if (x == 1)
            return 1;
        return x * factorial(x - 1);
    }

    public static int sum(int hi, int lo) {
        if (hi == lo)
            return formula(lo);
        return formula(hi) + sum(hi - 1, lo);
    }

    public static int sumButCooler(int hi, int lo) {
        // [statement] ? [true] : [false]
        return (hi == lo) ? formula(lo) : formula(hi) + sum(hi - 1, lo);
    }

    public static int formula(int x) {
        return (3 * x) + 1;
    }

    public static long regFib(long x) {
        return (x <= 2) ? 1 : regFib(x - 1) + regFib(x - 2);
    }

    public static long dynFib(long x) {
        if (!mem.isEmpty()) {
            if (mem.containsKey(x))
                return (long) mem.get(x);
        }
        if (x <= 2)
            return 1;
        if (!mem.containsKey(x - 2))
            mem.put(x - 2, dynFib(x - 2));
        if (!mem.containsKey(x - 1))
            mem.put(x - 1, dynFib(x - 1));

        mem.put(x, mem.get(x - 1) + mem.get(x - 2));
        return mem.get(x);
    }

    public static void main(String[] args) {
        long n = 45;
        System.out.println(dynFib(n));
        System.out.println(regFib(n));
    }
}
