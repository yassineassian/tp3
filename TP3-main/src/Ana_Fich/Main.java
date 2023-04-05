package Ana_Fich;

public class Main {
	
	public static void parse_filename(String path)
	{
	
	int index = path.lastIndexOf("\\");
	String r = path.substring(index+1);
	System.out.println(r);
	}

}
