import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void totalSum(int numbers[]) {

        List<Integer> helpList = new ArrayList<>();

        int sum = 0;

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                helpList.add(number);
            }


        }

        for (int i = 0; i < helpList.size(); i++) {
            sum += helpList.get(i);

        }

        System.out.println(sum);


    }


}


