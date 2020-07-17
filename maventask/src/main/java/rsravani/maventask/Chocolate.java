package rsravani.maventask;

public class Chocolate extends Sweet {
	Chocolate(String name, float weight, float cost)
	{
		super(name,weight,cost);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Chocolate";
	}

}
