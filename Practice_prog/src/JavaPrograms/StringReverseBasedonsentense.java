package JavaPrograms;


public class StringReverseBasedonsentense {
	public static void ReverseStr(String a){
		 String[] sliptString= a.split(" ");
		 
		 System.out.println("-----((-------"+sliptString[0]);
		 System.out.println("-----((-------"+sliptString.length);
		 String emptyString=" ";
		int i,j;
		for( i=0;i<=sliptString.length-1;i++)
		{
			String splitword =sliptString[i];
			 String emptyWord=" ";
			for(j=splitword.length()-1;j>=0;j--)
			{
				emptyWord=emptyWord+splitword.charAt(j);
				System.out.println("------"+i+"---"+j+"----"+emptyWord);
			}
		
			emptyString=emptyString+emptyWord+" ";
	  }
		System.out.println("+++++++++"+emptyString);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "joshwan hi ";
		ReverseStr(input);
		//System.out.println("result is "+output);

	}

}
