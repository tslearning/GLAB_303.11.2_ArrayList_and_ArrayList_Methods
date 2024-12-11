import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
   public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<Integer>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(15);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        //Adding an entire collection to an ArrayList
        firstFivePrimeNumbers.addAll(nextFivePrimeNumbers);

        // Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
    }
}
