package JavaProject;
import java.util.*;

public class ListMaker {

	public static void listmaker{
		
		//Finds file with absusive text list
	Scanner scanner=new Scanner("C:\\Users\\Conor\\Desktop\\swearWords.txt"); 
	
	//Populates a list
	 List<String> list=new ArrayList<>();
	 while(scanner.hasNextLine()){
	     list.add(scanner.nextLine()); 

	 }
	}
}
