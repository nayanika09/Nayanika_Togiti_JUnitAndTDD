package epam.JunitAndTDDHometask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharARemovalTest {

	CharacterARemovalAtFirst2Chars removeAChar= new CharacterARemovalAtFirst2Chars();
	@Test
	void testNoACharacterAtFirstTwoPositions() {
		assertEquals("BBAA",removeAChar.removeCharacterA("BBAA"));
	}
	@Test
	void testACharacterAtFirstTwoChars() {
		
		assertEquals("CD",removeAChar.removeCharacterA("AACD"));
	}
	
	@Test
	void testACharacterAtFirstPosition() {
		
		assertEquals("BCD",removeAChar.removeCharacterA("ABCD"));
	}
	@Test
	void testACharacterAtSecondPosition() {
		
		assertEquals("BCD",removeAChar.removeCharacterA("BACD"));
	}
	
}
