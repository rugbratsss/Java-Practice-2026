public class substringMethod1 {
    public static void main(String[] args){
        String string = "I love programming in java!";

        String sString = string.substring(5);
        int length = string.length();
        char cCharAt = string.charAt(5);

        System.out.println("Begin at index 5: " + sString );
        System.out.println("length of: " + length );
        System.out.println("at index of : " + cCharAt);

    }
}
