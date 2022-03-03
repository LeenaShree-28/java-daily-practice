package enums;

// If you put main() method inside the enum, you can run the enum directly.
enum Color {
    RED, GREEN, BLUE;

    public static void main(String[] args) {
        Color c = Color.BLUE;
        System.out.println(c);
    }
}
