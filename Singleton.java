// Implement a Singleton Design Pattern in Java

class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Static method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
