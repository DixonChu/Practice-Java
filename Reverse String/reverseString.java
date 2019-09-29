public class reverseString {


    public void printReverse(char[] s) {
        char[] newArray = new char[s.length];
        int j = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            newArray[j] = s[i];
            j++;
        }
        for (int z = 0; z < newArray.length; z++) {
            s[z] = newArray[z];
        }
    }


    public static void main(String[] args) {
        reverseString run = new reverseString();
        char[] string = {'h', 'e', 'l', 'l', 'o'};
        run.printReverse(string);


    }
}
