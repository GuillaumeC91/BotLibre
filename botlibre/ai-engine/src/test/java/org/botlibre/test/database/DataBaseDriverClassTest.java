package org.botlibre.test.database;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataBaseDriverClassTest {

	@Test
	public void testDBDriver() { 
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			fail("Database driver class not found!");
		}
	}

}
