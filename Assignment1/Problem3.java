class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0; i < 14; i++) {
            for (int j = 1; j <= 14; j++) {
                if ((j == 1) || j == 14 || i == 13 || (7 < j - 1 * i || 7 > j + 1 * i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
