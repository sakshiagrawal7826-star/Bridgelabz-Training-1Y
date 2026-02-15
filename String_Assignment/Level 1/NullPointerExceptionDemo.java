public class NullPointerExceptionDemo { 
    public static void generateException() {
        String text = null;
        System.out.println("Length of string: " + text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You cannot call methods on a null reference.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Calling method to generate NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception handled in main: " + e);
        }

        System.out.println("\nCalling method to handle NullPointerException:");
        handleException();
    }
}
