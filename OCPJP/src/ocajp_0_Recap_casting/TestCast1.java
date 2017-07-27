package ocajp_0_Recap_casting;

public class TestCast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food food = new Fruit();
		food.getFood();
		
		Fruit fruit = new Fruit();
		fruit.getFruit();
		fruit.getFood();
		
		Food food1 = new Food();
		food1.getFood();

	}

}
