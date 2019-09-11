/**
 * 盛最多水的容器
 *
 * @author 春林
 * Create 2019-09-11-11:57
 */

//给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
//        说明：你不能倾斜容器，且 n 的值至少为 2。
//        图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
//        示例:
//
//        输入: [1,8,6,2,5,4,8,3,7]
//        输出: 49
    // https://leetcode-cn.com/problems/container-with-most-water/

public class BiggestContainer {
    public int maxArea(int[] height) {
        //暴力法
        int maxarea=0;
//        for (int i=0;i<height.length;i++)
//            for(int j=i+1;j<height.length;j++)
//                maxarea=Math.max(maxarea,Math.min(height[i],height[j])*(j-i));
//        return maxarea;

        //双指针法，前后向中间靠拢
        int leftNode=0;
        int rightNode=height.length-1;
        for (int i=0;i<height.length;i++){
            maxarea=Math.max(maxarea,Math.min(height[leftNode],height[rightNode])*(rightNode-leftNode));
            if(height[leftNode]>height[rightNode]) {
                rightNode--;
            }else {
                leftNode++;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int[] testMaxarea=new int[]{1,8,6,2,5,4,8,3,7};
        BiggestContainer xp=new BiggestContainer();
        int result=xp.maxArea(testMaxarea);
        System.out.println("result的值是：---"+ result + "，当前方法=BiggestContainer.main()");
    }
}
