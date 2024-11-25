public class Main {
    public static void main(String[] args) {
        int unusedVariable = 5;

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

        User user = new User();
        System.out.println(user.getName());
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
