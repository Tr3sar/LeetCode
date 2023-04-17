package easy;

public class RichestCustomerWealth {
    public int solution(int[][] accounts) {
        int max = -1;
        for( int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++ ) {
                customerWealth += accounts[i][j];
            }
            if (customerWealth > max) {
                max = customerWealth;
            }
        }

        return max;
    }
}
