package JavaPrograms;

public class StringReverse {
	public static void  revOnlySentence(String a)
	{ 
		String reversedSentence = " ";
		String[] words= a.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			reversedSentence=reversedSentence+words[i]+" ";
		}
		System.out.println("reversed sentence"+reversedSentence);
	}
	
	public static void main(String[] args) {
		String a ="abcd efg hij";
		revOnlySentence(a);
//		char[] b= a.toCharArray();
//		int i;
//		
//		for(i = (b.length-1)/2;i>=0;i--)
//		{
//			char t=b[i];
//			b[i]=b[b.length-1-i];
//			b[b.length-1-i]=t;
//			
//		}
//		String revString= new String(b);
//		//System.out.println(revString);
//		System.out.println(b);	
		
	}
	 
	

}