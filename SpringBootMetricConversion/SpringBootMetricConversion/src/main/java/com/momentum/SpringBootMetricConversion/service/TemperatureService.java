package com.momentum.SpringBootMetricConversion.service;

import org.springframework.stereotype.Service;
import org.apache.commons.math3.util.Precision;

@Service
public class TemperatureService implements Convertor {

	/**
	 * This function is used to convert temperature from Imperial (Fahrenheit) into
	 * Metric (Celsius)
	 *
	 * Disclaimer: The formula used was taken from Google's Home Page and may defer
	 * slightly to more accurate measurements
	 *
	 * @param fahrenheitValue a temperature in Imperial unit (Fahrenheit)
	 * @return a Metric unit (Celsius) equivalent value rounded to two decimal
	 *         places
	 *
	 */
	@Override
	public double convertToMetric(final double fahrenheitValue) {
		return Precision.round((fahrenheitValue - 32) / 1.8, 2);
	}

	/**
	 * This function is used to convert temperature from Metric (Celsius) into
	 * Imperial (Fahrenheit)
	 *
	 * Disclaimer: The formula used was taken from Google's Home Page and may defer
	 * slightly to more accurate measurements
	 *
	 * @param celsiusValue a temperature in Metric unit (Celsius)
	 * @return an Imperial unit (Fahrenheit) equivalent value rounded to two decimal
	 *         places
	 *
	 */
	@Override
	public double convertToImperial(final double celsiusValue) {
		return Precision.round((celsiusValue * 1.8) + 32, 2);
	}

}
