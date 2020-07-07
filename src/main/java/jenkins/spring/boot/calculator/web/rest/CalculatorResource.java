package jenkins.spring.boot.calculator.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jenkins.spring.boot.calculator.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorResource {

	@Autowired
	CalculatorService calculatorService;
	
	@GetMapping(value = "/sum")
	public ResponseEntity<String> sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return ResponseEntity.ok(String.valueOf(calculatorService.sum(a, b)));
	}
}
