public class Secrets {
    public static int shiftBack(int value, int amount) {
        return value >>> amount; // unsigned right shift / logical shift that inserts 0 on the left side regardless if value was negative
    }

    public static int setBits(int value, int mask) {
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        throw new UnsupportedOperationException("Please implement the (static) Secrets.flipBits() method");
    }

    public static int clearBits(int value, int mask) {
        throw new UnsupportedOperationException("Please implement the (static) Secrets.clearBits() method");
    }
}
