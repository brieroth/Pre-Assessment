public class AlphaString {
		   public static void main(String[] args) {
		        String text = "This NETbuilder assessment is way too easy.";
		        String sentence = text.replaceAll("\\W+","");    
		   for(char ch : sentence.toCharArray()){
		        	System.out.println(letterToNumber(ch)); 
		        }
		   }
		   public static Object letterToNumber(char ch) {
		     return Character.toUpperCase(ch) - 64;
		    }
}

