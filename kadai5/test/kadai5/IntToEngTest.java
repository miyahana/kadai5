package kadai5;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class IntToEngTest {

	@Test
	public void translateEng��10���p�󂷂�() {
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual = ite.translateEng(10);
		assertThat(actual,is(expected));
	}
	@Test
	public void translateEng��15���p�󂷂�() {
		IntToEng ite = new IntToEng();
		String expected = "fifteen";
		String actual = ite.translateEng(15);
		assertThat(actual,is(expected));
	}

}
