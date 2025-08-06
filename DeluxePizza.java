package code.com;

public class DeluxePizza extends Pizza {
	//constructor building for inheriting properties of Pizza class
	public DeluxePizza(Boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraTopping();
		super.TakeAway();
	
	}

}
