package builderDesignPattern;

public class Driver {
	public static void main(String[] args) {
		MealBuilder mealBuilder=new MealBuilder();
		Meal veg=mealBuilder.vegMeal();
		veg.showItems();
		System.out.println(veg.getCost());
		veg=mealBuilder.nonVegMeal();
		veg.showItems();
		System.out.println(veg.getCost());
	}
}
