package com.enki.web.reactive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class TesterAssumptions {
	
	@Test
	public void testOnProd() {
		System.setProperty("ENV","PROD");
		
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")), () -> {
			Assertions.assertTrue(false);
		});
	}

}
