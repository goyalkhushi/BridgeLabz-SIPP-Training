package generics;
import java.util.*:
	

public interface MealPlan {
    String getMealName();
    int getCalories();
}

public class VegetarianMeal implements MealPlan {
    @Override
    public String getMealName() {
        return "Vegetarian Delight";
    }

    @Override
    public int getCalories() {
        return 600;
    }
}

public class VeganMeal implements MealPlan {
    @Override
    public String getMealName() {
        return "Vegan Green Bowl";
    }

    @Override
    public int getCalories() {
        return 500;
    }
}


public class KetoMeal implements MealPlan {
    @Override
    public String getMealName() {
        return "Keto Power Pack";
    }

    @Override
    public int getCalories() {
        return 700;
    }
}


public class HighProteinMeal implements MealPlan {
    @Override
    public String getMealName() {
        return "High Protein Builder";
    }

    @Override
    public int getCalories() {
        return 750;
    }
}


public class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void showMealDetails() {
        System.out.println("Meal Name: " + mealType.getMealName());
        System.out.println("Calories: " + mealType.getCalories() + " kcal");
    }

    public T getMeal() {
        return mealType;
    }
}




public class PersonalizedMealPlanGenerator {
	  public static <T extends MealPlan> void generateMealPlan(T meal) {
	        Meal<T> mealPlan = new Meal<>(meal);
	        System.out.println("\n--- Personalized Meal Plan ---");
	        mealPlan.showMealDetails();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose a meal plan:");
	        System.out.println("1. Vegetarian");
	        System.out.println("2. Vegan");
	        System.out.println("3. Keto");
	        System.out.println("4. High-Protein");

	        int choice = scanner.nextInt();

	        switch (choice) {
	        case 1 -> generateMealPlan(new VegetarianMeal());
            case 2 -> generateMealPlan(new VeganMeal());
            case 3 -> generateMealPlan(new KetoMeal());
            case 4 -> generateMealPlan(new HighProteinMeal());
            default -> System.out.println("Invalid choice. Please select a valid meal plan.");
	        }

	      }

}
