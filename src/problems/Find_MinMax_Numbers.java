package problems;

public class Find_MinMax_Numbers {

    public static void main(String[] args) {

        int nums [] = {99, 2, 67, 128, 8, 38, 29, 97, 1267, 245};
        int min, max;

        min = max = nums [0];
        for (int i = 1; i <nums.length; i ++){
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.print("lowest number: " + min + " " + "and" + "\n" +
                "largest number: " + max);
    }
}
