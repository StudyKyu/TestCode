package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PositiveNumberTest {

	
	@ParameterizedTest
	@ValueSource(ints = {0, -1})
	void createTest(int value) {
		assertThatCode(()-> new com.example.calculate.PositiveNumber(value))
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessage("0또는 음수를 전달할 수 없습니다.");
	}
}
