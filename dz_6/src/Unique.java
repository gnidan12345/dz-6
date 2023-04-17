import java.util.*;

public class Unique {

    public void selectUniqueChar() {

        String word = "Alexx9800";


        char[] chars = word.toCharArray();


        List<Character> testArray = new ArrayList<>();

        for (Character character : chars
        ) {
            if (testArray.contains(character)) {
                continue;
            }
            testArray.add(character);
        }


        for (int i = 0; i < testArray.size(); i++) {
            System.out.println(testArray.get(i));
        }

    }

}














