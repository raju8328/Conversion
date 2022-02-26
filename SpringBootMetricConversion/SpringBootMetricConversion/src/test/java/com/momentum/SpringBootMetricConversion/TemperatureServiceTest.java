package com.momentum.SpringBootMetricConversion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import com.momentum.SpringBootMetricConversion.service.TemperatureService;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)

public class TemperatureServiceTest {
	@InjectMocks
	private TemperatureService temperatureService;

	@BeforeAll
	static void setup() {
		MockitoAnnotations.openMocks(TemperatureServiceTest.class);
	}

	@Test
	public void when_degreesInFahrenheitSpecified_expectConversionToCelsius() {
		assertEquals(9.5, temperatureService.convertToMetric(49.1));
	}

	@Test
	public void when_degreesInCelsiusSpecified_expectConversionToFahrenheit() {
		assertEquals(72.5, temperatureService.convertToImperial(22.5));
	}
}
