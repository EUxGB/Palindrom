public class Main {


    public static boolean isPalindrome(String text) {
        StringBuilder a = new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        return a.reverse().toString().equals(text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
    }


        public static void main(String[] args) {
            System.out.println(isPalindrome("Madam, I'm Adam!"));

        }


}
