package com.example;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CourseTest {

	@DisplayName("과목(코스)를 생성한다.")
	@Test
	void createTest() {
		assertThatCode(() -> new Course("OOP", 3, "A+"))
		.doesNotThrowAnyException();
	}

}
