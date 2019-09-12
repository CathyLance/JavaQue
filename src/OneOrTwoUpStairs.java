/**
 * 爬阶梯，一阶或两阶，动态规划
 *
 * @author 春林
 * Create 2019-09-12-15:47
 */

//
//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
//        每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
//        注意：给定 n 是一个正整数。
//
//        示例 1：
//
//        输入： 2
//        输出： 2
//        解释： 有两种方法可以爬到楼顶。
//        1.  1 阶 + 1 阶
//        2.  2 阶
//        示例 2：
//
//        输入： 3
//        输出： 3
//        解释： 有三种方法可以爬到楼顶。
//        1.  1 阶 + 1 阶 + 1 阶
//        2.  1 阶 + 2 阶
//        3.  2 阶 + 1 阶

public class OneOrTwoUpStairs {
    public int climbStairs(int n) {
        //暴力法（递归）
//        return climb_Stairs(0,n);

//        //记忆化递归（从顶向下）
//        int[] mem=new int[n+1];
//        return climb_Stairs(0,n,mem);

        //动态规划(自底向上)
//        第 i 阶可以由以下两种方法得到：
//        在第 (i-1) 阶后向上爬一阶。
//        在第 (i-2) 阶后向上爬 2 阶。
//        所以到达第 i 阶的方法总数就是到第 (i-1) 阶和第 (i-2) 阶的方法数之和。
//        令 dp[i] 表示能到达第 i 阶的方法总数：
//        dp[i]=dp[i−1]+dp[i−2]
        if(n==1)
            return 1;
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=n;i++)
            dp[i]=dp[i-1]+dp[i- 2];
        return dp[n];
    }

    public static void main(String[] args) {
        OneOrTwoUpStairs xp=new OneOrTwoUpStairs();
        long result=xp.climbStairs(10);
        System.out.println("————————CathyLance————————result的值是：---"+ result + "，当前方法=OneOrTwoUpStairs.main()");

    }

//暴力法（递归）
//    public int climb_Stairs(int i,int n){
//        if(i>n){
//            return 0;
//        }
//        if (i==n)
//            return 1;
//        return climb_Stairs(i+1,n)+climb_Stairs(i+2,n);
//    }

    //记忆化递归（从顶向下）
//    public int climb_Stairs(int i,int n,int[] mem){
//        if(i>n)
//            return 0;
//        if (i==n)
//            return 1;
//        if(mem[i]>0)
//            return mem[i];
//        mem[i]=climb_Stairs(i+1,n,mem)+climb_Stairs(i+2,n,mem);
//        return mem[i];
//    }


}
