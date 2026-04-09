public class charAtmethod {
    public static void main(String[] args){
        String sentence = "I love programming in java!";

        char answer = sentence.charAt(5);
        int length = sentence.length();
        System.out.println("at index of: "+ answer);
        System.out.println("has length of: " + length);
    }
}
