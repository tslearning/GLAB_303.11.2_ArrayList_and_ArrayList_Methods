import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String>topCompanies = new ArrayList<>();

        //Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty: " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        //Find the size of a ArrayList
        System.out.println("Here are the top " + topCompanies.size() + topCompanies.size() + " companies in the world");

        System.out.println(topCompanies);

        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best company: " + bestCompany);
        System.out.println("Second Best company: " + secondBestCompany);
        System.out.println("Last company: " + lastCompany);

        //Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
