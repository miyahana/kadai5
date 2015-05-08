package kadai5;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class IntToEngTest {

	@Test
	public void translateEng‚Å6‚ð‰p–ó‚·‚é() {
		IntToEng ite = new IntToEng();
		String expected = "six";
		String actual = ite.translateEng(6);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEng‚Å15‚ð‰p–ó‚·‚é() {
		IntToEng ite = new IntToEng();
		String expected = "fifteen";
		String actual = ite.translateEng(15);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEng‚Å30‚ð‰p–ó‚·‚é() {
		IntToEng ite = new IntToEng();
		String expected = "thirty";
		String actual = ite.translateEng(30);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEng‚Å58‚ð‰p–ó‚·‚é() {
		IntToEng ite = new IntToEng();
		String expected = "fiftyeight";
		String actual = ite.translateEng(58);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEng‚Å290‚ð‰p–ó‚·‚é() {
		IntToEng ite = new IntToEng();
		String expected = "twohundredninety";
		String actual = ite.translateEng(290);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEng‚Å486‚ð‰p–ó‚·‚é() {
		IntToEng ite = new IntToEng();
		String expected = "fourhundredeightysix";
		String actual = ite.translateEng(486);
		assertThat(actual,is(expected));
	}

}
