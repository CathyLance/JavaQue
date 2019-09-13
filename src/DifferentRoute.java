import java.util.Arrays;

/**
 * 不同路径（动态规划）
 *
 * @author 春林
 * Create 2019-09-13-16:48
 */

//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
//        机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
//        问总共有多少条不同的路径？
//        例如，一个7 x 3 的网格。有多少可能的路径？
//        说明：m 和 n 的值均不超过 100。

//        示例 1:
//          输入: m = 3, n = 2
//           输出: 3
//        解释:
//        从左上角开始，总共有 3 条路径可以到达右下角。
//        1. 向右 -> 向右 -> 向下
//        2. 向右 -> 向下 -> 向右
//        3. 向下 -> 向右 -> 向右
//        示例 2:
//          输入: m = 7, n = 3
//          输出: 28

public class DifferentRoute {
    public int uniquePaths(int m, int n) {
//        int[][] dp=new int[m][n];
//
//        for (int i=0;i<m;i++) dp[i][0]=1;
//        for (int i=0;i<n;i++) dp[0][i]=1;
//        for (int i=1;i<m;i++) {
//            for (int j=1;j<n;j++){
//                dp[i][j]=dp[i-1][j]+dp[i][j-1];
//            }
//        }
//        return dp[m-1][n-1];

        // 优化空间复杂度为O（n）
        // 根据网状表格可知，使用二维数组的时候，dp[i][j] = dp[i-1][j] + dp[i][j-1] ，
        // 每一个格子的数据等于上面一个格子加左边格子的数据。
        // 可以想象一下，计算一行数据的时候，直接把上面一行的数据搬下来，
        // 然后每个格子就等于前一个格子的数据加上当前格子的数据。

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        DifferentRoute xp=new DifferentRoute();
        int result=xp.uniquePaths(51,9);
        System.out.println("————————CathyLance————————result的值是：---"+ result + "，当前方法=DifferentRoute.main()");
    }

}
