import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Tagudam {
    public static void main(String[] args) {
//        int[] arr={1,1,1,1};
//        Count_pairs_with_given_sum(arr,2);
//        int[] nums={3,0,1,1,9,7};
//        leetcode1534(nums,7,2,3);
//        int[] nums={13,25,83,77};
//        int[][] nums={{1,1,0},{1,0,1},{0,0,0}};
//        leetcode832(nums);
//        System.out.println(3/2)
//        int[][] mat = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//        leetcode1572(mat);
        int[][] nums= {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        System.out.println(leetcode98hard(nums));
    }

        static void Min_Max ( int[] arr){
            int max = arr[0], min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) max = arr[i];
                if (arr[i] < min) min = arr[i];
            }
            System.out.println("Max:" + max + " Min:" + min);
        }

        static void Count_pairs_with_given_sum ( int[] arr, int target){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target)
                        count++;
                }
            }
            System.out.println(count);
        }

        static void leetcode1913 ( int[] arr){
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int temp = 0;
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                res.add(arr[i]);
            }
            System.out.println(Math.abs((arr[arr.length - 1] * arr[arr.length - 2]) - (arr[0] * arr[1])));
        }

        static void leetcode1732 ( int[] arr){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(0);
            for (int i = 0; i < arr.length; i++) {
                temp.add(temp.get(i) + arr[i]);
            }
            System.out.println(Collections.max(temp));
        }

        static void leetcode1534 ( int[] arr, int a, int b, int c){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (Math.abs(arr[i] - arr[j]) <= a)
                        for (int k = j + 1; k < arr.length; k++) {
                            if ((Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c))
                                count++;
                        }
                }
            }
            System.out.println(count);
        }

        static void leetcode832 ( int[][] nums){
            int[][] B = new int[nums.length][nums[0].length];
            for (int i = 0; i < nums.length; i++) {
                int len = nums[i].length;
                for (int j = 0; j < len; j++) {
                    B[i][j] = nums[i][len - 1 - j] == 0 ? 1 : 0;
                }
            }
            System.out.println(Arrays.deepToString(B));
        }

        static void leetcode1572 ( int[][] mat){
            int sum = 0, len = mat.length;

            for (int i = 0; i < len; ++i) {
                sum += mat[i][i] + mat[i][len - i - 1];
            }

            System.out.println(len % 2 == 0 ? sum : sum - mat[len / 2][len / 2]);
        }


            private static int[][] DIRECTIONS = new int[][] {{0,1}, {1,0}, {0,-1}, {-1,0}};
            public static int leetcode98hard(int[][] grid){
                int startX = 0, startY = 0, needed = 0;
                for (int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid[0].length; j++) {
                        if(grid[i][j] == 0) needed++;
                        else if (grid[i][j] == 1) {
                            startX = i;
                            startY = j;
                        }
                    }
                }

                return dfs(grid, startX, startY, needed, -1);
            }
            private static int dfs(int[][] grid, int x, int y, int needed, int count) {
                if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == -1)
                    return 0;

                if (grid[x][y] == 2) {
                    if (count == needed) return 1;
                    else return 0;
                }

                grid[x][y] = -1;
                int numWaysToDest = 0;
                for (int[] dir : DIRECTIONS) {
                    int newX = x + dir[0], newY = y + dir[1];
                    numWaysToDest += dfs(grid, newX, newY, needed, count+1);
                }
                grid[x][y] = 0;
                return numWaysToDest;
            }


}
