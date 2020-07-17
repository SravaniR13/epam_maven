package rsravani.maventask;

import java.util.Comparator;

public class SortByWeight implements Comparator<Sweet> {

	public int compare(Sweet o1, Sweet o2) {
		// TODO Auto-generated method stub
		return (int) (o1.weight-o2.weight);
	}

}
