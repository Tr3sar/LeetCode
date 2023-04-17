package easy;

import java.util.Arrays;

public class WeakestKRows {

    public static void main(String[] args) {
        int k = 3;
        int[][] array = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};

        int[] solution = solution(array, k);
        for(int i = 0; i < k; i++) {
            System.out.println(solution[i]);
        }
    }
    public static int[] solution(int[][]mat, int k) {
        int[] res = new int[k];

        for(int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int j = 0; j < mat.length; j++) {
                int guardCount = 0;
                for(int l = 0; l < mat[j].length; l++) {
                    if (mat[j][l]==1 && guardCount < min) {
                        guardCount++;
                    } else if (mat[j][l] == Integer.MAX_VALUE) {
                        guardCount = Integer.MAX_VALUE;
                        break;
                    } else {
                        break;
                    }
                }

                if(min > guardCount) {
                        min = guardCount;
                        minIndex = j;
                }
            }

            mat[minIndex][0] = Integer.MAX_VALUE;
            res[i] = minIndex;
        }
        return res;
    }
}
