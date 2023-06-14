package JavaProgrammingPractice;

public class ReverseSentense {

	public static void main(String[] args) {
		String Sentence="What you do is more important than what you say";
//		Sentense=Sentense.replace(" ", ""); //ReverseSentence
		char ch;
		String rev="";

		for(int i=(Sentence.length())-1;i>0;i--) {
		ch=Sentence.charAt(i);	
		rev=rev+ch;
		}
		System.out.println(rev);
	}

}
