package medium;

public class CompetitiveSubsequence {

    public static void main(String[] args) {
        int k = 18;
        for(int i = 0; i < k; i++) {
            System.out.print(solution(new int[]{11,52,57,91,47,95,86,46,87,47,70,56,54,61,89,44,3,73,1,7,87,48,17,25,49,54,6,72,97,62,16,11,47,34,68,58,14,36,46,65,2,15}, k)[i] + ", ");
        }
    }

    //NO SOLUCIONAT
    public static int[] solution(int[] nums, int k) {
        int[] res = new int[k];
        int minIndex = 0;

        for(int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int tope = nums.length - k + i + 1;

            for(int j = minIndex; j < tope; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }

            if (minIndex == nums.length - k + i) {
                for(int l = minIndex; l < nums.length; l++) {
                    res[i] = nums[l];
                    i++;
                }
                break;
            } else {
                nums[minIndex] = Integer.MAX_VALUE;
                tope = minIndex;
            }

            res[i] = min;
        }
        return res;
    }
}