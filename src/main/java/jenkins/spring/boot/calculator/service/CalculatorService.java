package jenkins.spring.boot.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	/**
	 * Sum numbers.
	 * @param a
	 * @param b
	 * @return
	 */
	public int sum(int a, int b) {
		return a + b;
	}
}
