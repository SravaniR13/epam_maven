package rsravani.maventask;
import java.util.Comparator;

public class SortByName implements Comparator<Sweet> {
	public int compare(Sweet o1, Sweet o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
