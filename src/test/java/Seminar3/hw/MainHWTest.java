package Seminar3.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainHWTest {
	private MainHW mainHW;
	@BeforeEach
	public void setUp(){
		mainHW = new MainHW();
	}
	@Test
	void isNumberEven(){
		assertFalse(mainHW.evenOddNumber(1));
		assertTrue(mainHW.evenOddNumber(2));
	}
	@Test
	void isNumberInInterval(){
        assertFalse(mainHW.numberInInterval(25));
        assertFalse(mainHW.numberInInterval(100));
        assertTrue(mainHW.numberInInterval(50));
	}
}