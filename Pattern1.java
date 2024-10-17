

class Pattern1 {
    public static void main(String[] args) {
        // Rows (i)
        for (int i = 1; i <= 4; i++) {
            //(j)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // by space
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
