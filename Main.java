class Main{
    public static void main(String[] args) {
        System.out.println("its main class");

        // simple factorial program

        int num = 10, result = 0;

        for (int i = 0; i < num; i++) {
            result *= i;
        }

        System.out.printf("factorial of %d is : %d ", num, result);
    }
}