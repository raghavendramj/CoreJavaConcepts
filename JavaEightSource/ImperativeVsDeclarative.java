import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeVsDeclarative {

    public static void main(String[] args) {


        final String fruits[] = {"Orange", "Banana", "Mango", "Watermelon", "Apple"};

        //Imperative -> An imperative approach (HOW)
        List<String> fruitsList = new ArrayList<>();
        for(String eachFruit : fruits) {
            fruitsList.add(eachFruit);
        }
        System.out.println(fruitsList);


        //Declarative -> A declarative approach (WHAT)
        List<String> fruitsSecondList = Arrays.asList(fruits);
        System.out.println(fruitsSecondList);

    }

}
