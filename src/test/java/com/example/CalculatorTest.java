package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.example.calculate.PositiveNumber;

import net.bytebuddy.asm.Advice.Argument;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculatorTest {

	// p + p ---> Calculator
	// 결과값을 전달해주는 형태로 구현
	@DisplayName("덧셈 연산을 수행한다.")
	@ParameterizedTest
	@MethodSource("formulaAndResult")
	void calculateTest(int operand1, String operator, int operand2, int result) {
		int calcualteResult = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));
		
		assertThat(calcualteResult).isEqualTo(result);
	}
	
	private static Stream<Arguments> formulaAndResult() {
		return Stream.of(
				arguments(1, "+", 2, 3),
				arguments(1, "-", 2, -1),
				arguments(4, "*", 2, 8),
				arguments(4, "/", 2, 2)
		);
	}
	
//	@DisplayName("나눗셈에서 0을 나누는 경우 예외 발생")
//	@Test
//	void calculateExceptionTest() {
//		assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
//		.isInstanceOf(IllegalArgumentException.class)
//		.hasMessage("0으로 나눌 수 없습니다.");
//	}
	
	
//	@DisplayName("뺄셈 연산을 수행한다.")
//	@Test
//	void subtractionTest() {
//		int result = Calculator.calculate(1, "-", 2);
//		
//		assertThat(result).isEqualTo(-1);
//	}

}
