package com.momentum.SpringBootMetricConversion.service;

import org.springframework.stereotype.Service;
import org.apache.commons.math3.util.Precision;

@Service
public class WeightService implements Convertor {

	@Override
	public double convertToMetric(final double fromValue) {
		return Precision.round(fromValue / 2.205, 2);
	}

	@Override
	public double convertToImperial(final double fromValue) {
		return Precision.round(fromValue * 2.205, 2);
	}

}
