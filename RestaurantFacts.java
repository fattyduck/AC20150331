package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/31/15.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RestaurantFacts {

    public static void main(String[] args) {
        // Step 1. Use FileParser's static method getLines() to get a nested
        //         ArrayList representing the CSV file.
        //
        //         For now, use "nyc-restaurants-small.csv".
        //
        //         Use a parameter to specify which column you're interested
        //         in. For now, use the int 14, which will give you the
        //         restaurant's grade.
        Scanner scan= new Scanner(System.in);
        ArrayList<ArrayList<String>> restaurant = new ArrayList<ArrayList<String>>();

        restaurant = FileParser.getLines("restaurant.csv",14);


        // Step 2. Build a HashMap named "restaurants".
        //         Loop over every line and add the appropriate data to your
        //         HashMap.
        HashMap<String, String> restaurants= new HashMap<String, String>();
        for(int i = 0 ; i<restaurant.size();i++) {
            restaurants.put(restaurant.get(i).get(1), restaurant.get(i).get(14));
        }



        // Step 3. Create a Scanner and prompt the user for a restaurant.
        //         If the restaurant has a relevant fact, print it. Otherwise
        //         print "Restaurant not found.".
        System.out.println("Which restaurant do you want the grade?");
        String input = scan.nextLine();
        System.out.println(restaurants.get(input));
    }
}