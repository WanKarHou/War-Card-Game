

import java.util.Scanner;



public class Player {
	
	private String name;
	private int point;
	

    public void setName(String name1) {
    name=name1;
    }
	public String getName() {
		return name;
	}
	
	public void EnterPlayer()
	{   getName();
		Scanner obj1 = new Scanner(System.in) ;
		
		
		System.out.print("\nPlease enter Player name:");
		name = obj1.nextLine() ;		
		
	}

	
	public void setPoint(int point)
	{
		this.point = point ;
	}
	
	public int getPoint() 
	{
		return point;
		
	}
	public  void Compare(Player player1 )
    { 
 	   if(player1.getPoint()> this.getPoint())
 	   {
 		   System.out.println(player1.getName() +" has more point than " +this.getName()) ;
 	   }
 	   else 
 	   {
 		  System.out.println(this.getName() +" has more point than " +player1.getName()) ;
 	   }
    }
	
}

   
