package jenkins.spring.boot.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorServiceTest {

	private CalculatorService calculatorService = new CalculatorService();
	
	@Test
	public void testSum() {
		assertEquals(5, calculatorService.sum(2, 3));
	}
}
