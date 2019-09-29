public class reverseWord {

    public String reverseWords(String s) {
        String strArray[] = s.split(" ");
        for(int i = strArray.length ; i >= 0; i--){

        }
        return strArray[1];
    }


    public static void main(String[] args) {
        reverseWord run = new reverseWord();
        run.reverseWords("The sky is blue");
    }

}
