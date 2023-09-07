package JavaPrograms;

public class ReverseGivenSentence {
	public static void revSentence(String s)
	{
		int i,j;
		String mainString="";
		String[] words=s.split(" ");
		System.out.println("--------"+words.toString());
		for( i=0;i<=words.length-1;i++)
		{
			String word =words[i];
			String  temp="";
			 // char[] ch  = word.toCharArray();
			for(j=word.length()-1;j>=0;j--)
			{
				 temp+=word.charAt(j);
			}
			
			mainString +=temp+" ";
			
		}
		System.out.println("output is ==>"+mainString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revSentence("joshwan joel fernandes");
	}

}
