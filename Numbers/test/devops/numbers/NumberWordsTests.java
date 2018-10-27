package devops.numbers;

import org.junit.*;

import devops.numbers.NumberToWords;

public class NumberWordsTests {
	private NumberToWords numberToWords ;
	
	@Before
	public void setup() {
		numberToWords = new NumberToWords();
	}

	@Test
	public void numberFourDigit() {
		Assert.assertEquals("Success", "one thousand one hundred eleven", numberToWords.convert(1111)) ;
	}

	@Test
	public void numberMillion() {
		Assert.assertEquals("Success", "two hundred twelve million three hundred forty five thousand six hundred seventy eight", numberToWords.convert(212345678)) ;
	}

	@Test
	public void numberTwoDigit() {
		Assert.assertEquals("Success", "eleven", numberToWords.convert(11)) ;
	}
	
	@Test
	public void numberOneDigit() {
		Assert.assertEquals("Success", "one", numberToWords.convert(1)) ;
	}
	
	@Test
	public void exitApplication() {
		Assert.assertEquals("Success", "Exiting program", numberToWords.convert(0)) ;
	}
	
	@Test
	public void numberNegative() {
		Assert.assertEquals("Success", "invalid number", numberToWords.convert(-67)) ;
	}
}
