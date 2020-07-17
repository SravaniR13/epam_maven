package rsravani.maventask;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc= new Scanner(System.in);
        Gift newyeargift= new Gift();
        Chocolate c1= new Chocolate("MilkyBar",100,20);
        Chocolate c2= new Chocolate("Galaxy",200,99.9f);
        Candy candy1 = new Candy("Skittles",500,150.5f);
        Candy candy2 = new Candy("MandM",500,200);
        newyeargift.giftslist.add(c1);
        newyeargift.giftslist.add(c2);
        newyeargift.giftslist.add(candy1);
        newyeargift.giftslist.add(candy2);
        
        Float gift_cost= newyeargift.getCost();
        Float gift_weight= newyeargift.getWeight();
        System.out.println("Total weight of gift is "+gift_weight);
        System.out.println("Total cost of gift is "+gift_cost);
        
        System.out.println("To sort enter a key, 1:cost 2:name 3:weight");
        int keyvalue=sc.nextInt();
        switch(keyvalue)
        {
        case 1: newyeargift.sortSweetsInGifts("cost");
        	break;
        case 2: newyeargift.sortSweetsInGifts("name");
        	break;
        case 3: newyeargift.sortSweetsInGifts("weight");
        	break;
        default:
        	System.out.println("Select appropriate key");
        }
        for(Sweet s: newyeargift.giftslist)
        {
        	System.out.println(s.getType()+" - "+s.name+" - Rs."+s.cost+" - "+s.weight+" gms");
        }
        sc.close();
    }
}
