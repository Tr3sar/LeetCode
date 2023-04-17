package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> solution(int n) {
        List<String> res = new ArrayList<String>();

        for(int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                res.add("easy.FizzBuzz");
            }
            else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(i+"");
            }
        }

        return res;
    }
}
