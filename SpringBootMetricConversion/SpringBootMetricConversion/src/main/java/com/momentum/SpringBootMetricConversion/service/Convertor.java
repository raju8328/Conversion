package com.momentum.SpringBootMetricConversion.service;

public interface Convertor {
	double convertToMetric(double fromValue);

    double convertToImperial(double fromValue);
}
