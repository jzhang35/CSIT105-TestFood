// James Zhang
package testfood;

public class Food {

    private String description;
    private int calories;
    
    /*
      Constructor to create Food object
      @param newDescription The description of the food.
      @param newCalories The calories per serving of the food.
    */
    
    public Food (String newDescription, int newCalories)
    {
        description = newDescription;
        calories = newCalories;
    }
    
    /*
      The getDescription method returns the description of the food. 
      @return The description of the food.
    */
    
    public String getDescription()
    {
        return description;
    }
    
    /*
      The getCalories method returns the calories per serving of the food. 
      @return The calories per serving of the food.
    */
    
    public int getCalories()
    {
        return calories;
    }
    
    /*
      The setDescription method sets the value of the description variable to the new description of the food. 
      @param newDescription The new description of the food.
    */
    
    public void setDescription(String newDescription)
    {
        description = newDescription;
    }
    
    /*
      The setDescription method sets the value of the description variable to the new amount of calories per serving of the food. 
      @param newCalories The new amount of calories per serving of the food.
    */
    
    public void setCalories(int newCalories)
    {
        calories = newCalories;
    }
    
}