public class Main {

    public static void main(String[] args) {

        isPalindrome("Palindrome");
        isPalindrome("Civic");
        isPalindrome("Radar");
        isPalindrome("Level");
        isPalindrome("Eva, can I stab bats in a cave?");
        isPalindrome("A man, a plan, a canal, Panama");
        isPalindrome("Mr. Owl ate my metal worm");
        isPalindrome("Never odd or even");
        isPalindrome("Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod.");

    }

    private static boolean isPalindrome(String s){

        String s1 = s.toLowerCase();
        int s1length = s1.length();

        String s2 = new String();

        for(int i = 0; i < s1length; i++){

            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                s2 += s1.charAt(i);
            }

        }

        int s2length = s2.length();

        for(int i = 0, j = s2length - 1; i <= (s2length/2) - 1; i++, j--){

            char a = s2.charAt(i);
            char b = s2.charAt(j);

            if(a!=b){
                System.out.println("\"" + s + "\" is not a palindrome.");
                return false;
            }

        }

        System.out.println("\"" + s + "\" is a palindrome.");
        return true;

    }

}
