public class NonRepeatNumber {

    public static int singleNumber(int[] nums) {
        int singleNumber = 0;
        for(int i = 0; i < nums.length; i++){
            singleNumber = singleNumber ^ nums[i];
        }
        return singleNumber;
    }


    public static void main(String[] args) {
        NonRepeatNumber run = new NonRepeatNumber();
        int[] counter = {2, 4, 4, 2, 3, 1, 3};
        System.out.println(run.singleNumber(counter));
    }
}
