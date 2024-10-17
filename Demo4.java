class Demo4 {
    public static void main(String[] args) {
        final byte a = 2; // final means constant
        final byte b = 2; // final means constant

        // byte c = a + b; // Compilation error: The result of 'a + b' is int by default, so casting is required
        byte c = (byte) (a + b); // Cast the result to byte
        System.out.println(c);   // Correct method call, with proper case "println"

        byte d = 2;
        byte e = 2;

        // byte e = 2;  // Duplicate declaration of variable 'e', should be removed
        // byte e = 2;  // Duplicate declaration again, unnecessary
        
        // byte f = a + b; // Similar issue with casting
        byte f = (byte) (a + b); // Cast to byte
        System.out.println(f);   // Correct method call
    }
}
