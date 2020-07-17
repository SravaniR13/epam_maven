package rsravani.maventask;

import java.util.ArrayList;
import java.util.Collections;

public class Gift {
	ArrayList<Sweet> giftslist ;
	Gift()
	{
		giftslist = new ArrayList<Sweet>();
	}
	public float getCost()
	{
		float total_gift_cost=0;
		for(Sweet s : giftslist )
		{
			total_gift_cost=total_gift_cost+s.cost;
		}
		return total_gift_cost;
	}
	public float getWeight()
	{
		float total_gift_weight=0;
		for(Sweet s : giftslist )
		{
			total_gift_weight=total_gift_weight+s.weight;
		}
		return total_gift_weight;
	}
	public void sortSweetsInGifts(String key)
	{
		if(key.equals("name"))
		{
			Collections.sort(giftslist , new SortByName());
		}
		else if(key.equals("weight"))
		{
			Collections.sort(giftslist , new SortByWeight());
		}
		else
		{
			Collections.sort(giftslist , new SortByCost());
		}
	}
}
