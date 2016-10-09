package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void DeckBuildTest()
	{
		int jokers = 2;
		int wc = 2;
		ArrayList<Card> wildCards = new ArrayList<Card>(wc);
		ArrayList<Card> dActual = new ArrayList<Card>(2);
		Deck dw = new Deck(jokers, wildCards);
		assertEquals(dw, dActual);
		
		
	}
	


}
