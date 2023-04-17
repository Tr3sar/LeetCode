package easy;

public class NumberOfSteps {
    public int solution(int num) {
        int sum = 0;

        while(num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num -= 1;
            }
            sum++;
        }


        return sum;
    }
}
