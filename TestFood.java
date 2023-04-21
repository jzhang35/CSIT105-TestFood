// James Zhang
package testfood;
import java.util.Scanner;

public class TestFood
{
    public static void main(String[] args)
    {
        // declare variables
        Scanner input = new Scanner(System.in);
        int caloriesEntered;
        String descriptionEntered;
        Food myFood; // declares myFood as a Food
        // get data
        System.out.print("Enter the description of the food: ");
        descriptionEntered = input.nextLine();
        System.out.print("Enter the calories per serving for the food: ");
        caloriesEntered = input.nextInt();
        // instantiate object
        myFood = new Food(descriptionEntered,caloriesEntered);
        // display results
        System.out.println("\nDescription: " + myFood.getDescription());
        System.out.println("Calories per serving: " + myFood.getCalories());
        
        // James Zhang

    }
}