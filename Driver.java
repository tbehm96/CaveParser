import java.io.File;
import java.util.Scanner;


public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/caveJSON"));
		String theJSON = "";
		while(input.hasNextLine())
		{
			theJSON = theJSON + input.nextLine();
		}
		System.out.println(theJSON);
		parsetheJSON(theJSON);
		/*;
		Room caveEntrance = new Room("The Cave Entrance");
		Room room2 = new Room("Room #2");
		caveEntrance.addExit("north", room2);
		room2.addExit("south", caveEntrance);
		
		Player thePlayer = new Player("The Follower");
		caveEntrance.addThePlayer(thePlayer);
		*/
	}
	static void parsetheJSON(String s)
	{
		for(int i= 0; i < s.length(); i++)
		{
		if(s.charAt(i) == '{')
		{
			System.out.println("JSONObjectBegin");
		}
		else if (s.charAt(i) == '}')
		{
			System.out.println("JSONObjectend");
		}
		else if(s.charAt(i) == '[')
		{
			System.out.println("JSONArrayBegin");
		}
		else if(s.charAt(i) == ']')
		{
			System.out.println("JSONArrayEnd");
		}
		
		}

	}
}