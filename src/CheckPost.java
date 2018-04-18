package JavaProject;

public class CheckPost extends control {

	
public static boolean stringIsAbusive(String , String[] list)
	{
	tolowercase(phrase);
	//going through the list
	    for(int i =0; i < list.length; i++)
	    {
	    	//if the post contains abusive text
	        if(phrase.contains(list[i]))
	        {
	            System.out.println("Post contains abusive text");
	        }
	    }
	    System.out.println("Post does not contain abusive text");
	}
}
