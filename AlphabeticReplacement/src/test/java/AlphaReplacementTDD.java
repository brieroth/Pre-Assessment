import org.junit.Test;
import org.junit.Assert;

public class AlphaReplacementTDD {
	
	@Test
	public void testAlphaPos() {
	Object letterToNumber = new Object();
	String sentence = "This NETbuilder assessment is way too easy.";
	Assert.assertEquals("20 8 9 19 14 5 20 2 21 9 12 4 5 18 1 19 19 5 19 19 13 5 14 20 9 19 23 1 25 20 15 15 5 1 19 25", sentence.letterToNumber());
	}

}
