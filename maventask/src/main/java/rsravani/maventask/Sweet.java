package rsravani.maventask;

public abstract class Sweet {
	String name;
	float weight,cost;
	Sweet(String name, float weight, float cost)
	{
		this.name=name;
		this.weight=weight;
		this.cost=cost;
	}
	public abstract String getType();
}
