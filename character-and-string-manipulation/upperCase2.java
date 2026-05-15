public class upperCase2 {
    public static void main(String[] args){
        String sentence = "Nhlanhla";

        String toUpper = "";

        for(int i = 0; i < sentence.length(); i++){
            toUpper += Character.toUpperCase(sentence.charAt(i));
        }
        System.out.println(toUpper);
    }
}
