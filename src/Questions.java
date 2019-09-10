public class Questions {
    //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//        示例:
//        给定 nums = [2, 7, 11, 15], target = 9
//        因为 nums[0] + nums[1] = 2 + 7 = 9
//        所以返回 [0, 1]
    public static int[] twoSum(int[] nums, int target) {
        int[] result;

        //方法一：暴力法
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }



    public static void main(String[] args) {

        int a = 0;

        int[] nums = {2, 7, 7, 11, 15};
        int[] Xresult = new int[2];
        int target = 18;

        Xresult = twoSum(nums, target);

        System.out.println("Xresult[0]的值是：---" + Xresult[0] + "，当前方法=Questions.main()");
        System.out.println("Xresult[1]的值是：---" + Xresult[1] + "，当前方法=Questions.main()");

    }
}
