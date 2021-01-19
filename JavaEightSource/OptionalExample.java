import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalExample {
    public static void main(String[] args) {

        String myArray[] = new String[5];
        myArray[2] = "Raghav";

        for(int i=0; i< myArray.length; i++){
            if(Optional.ofNullable(myArray[i]).isPresent()){
                System.out.println(" Yes Value is present "+ myArray[i]);
            } else {
                System.out.println("Oopsy there no value in mentioned index of the array");
            }
        }

        OptionalInt first = IntStream.of(1, -3, 5).filter(x -> x % 2 == 0).findFirst();
        int value = first.getAsInt();
        System.out.println(value);
    }
}
