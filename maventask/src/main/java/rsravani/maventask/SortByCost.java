package rsravani.maventask;

import java.util.Comparator;

public class SortByCost implements Comparator<Sweet> {

	public int compare(Sweet o1, Sweet o2) {
		// TODO Auto-generated method stub
		return (int) (o1.cost-o2.cost);
	}

}
