package code.com;
import java.util.*;
public class Pizza {
	
	Scanner sc = new Scanner(System.in);
	
	private int price;
	private Boolean veg;
	
	//added prices
	private int extracheese =100;
	private int extratoppings =100;
	private int delivery = 20;
	private int basepizzaprice =200;
	
    Boolean isExtraCheeseAddded = sc.nextBoolean();
	Boolean isExtratoppingAddded = sc.nextBoolean();
	Boolean optedForDelivery = sc.nextBoolean();
	
	
// constructor creation
	public Pizza(Boolean veg) {
		this.veg = veg;
		if (this.veg)
		{
			this.price  = 200;
		}
		else//for non veg
		{
		    this.price = 300;
				
		}
			
		}
	//if the user enter true this condition will be followed
	public void addExtraCheese() {
		if(isExtraCheeseAddded == true) {
		this.price += extracheese;
		}
		
	}
	
	public void addExtraTopping() {
		if(isExtratoppingAddded == true)
		this.price += extratoppings;
	}
		
		
	public void TakeAway() {
		if(optedForDelivery = true) {
		this.price += delivery;
		}
		
		
	}
	//for generating the customized bill
    public void getBill() {
    	String Bill = " ";
    	System.out.println("Pizza:"+basepizzaprice);
    	if(isExtraCheeseAddded) {
    		Bill+=" Extra cheese added: "+ extracheese +"\n";
    		
    	}
    	if(isExtratoppingAddded) {
    		Bill+=" Extra topping added: "+  extratoppings +"\n";
    		
    	}
    	if(optedForDelivery) {
    		Bill+=" delivery"+ delivery +"\n";
    	}
    	Bill += "bill: " +this.price +"\n";
    	System.out.println(Bill);
    	
    }
	}
	
	

