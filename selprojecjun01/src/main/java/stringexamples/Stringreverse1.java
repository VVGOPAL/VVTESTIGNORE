package stringexamples;

public class Stringreverse1 
{

	public static void main(String[] args)
	 
	 {
		 //String revertedstring= Stringreverse.reverseeachword("Omnience Events India Pvt Ltd");
		// testing
		//testing4
		//testing5
		 
		 System.out.println(reverseWord("omnience events india pvt ltd"));    
	 }
	
	private static String reverseWord(String str)
	{  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words)
	    {  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  
	

}
