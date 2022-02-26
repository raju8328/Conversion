package com.momentum.SpringBootMetricConversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.momentum.SpringBootMetricConversion.service.AreaService;
import com.momentum.SpringBootMetricConversion.service.LengthService;
import com.momentum.SpringBootMetricConversion.service.TemperatureService;
import com.momentum.SpringBootMetricConversion.service.VolumeService;
import com.momentum.SpringBootMetricConversion.service.WeightService;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value = "/convert")
public class ConversionController {
	@Autowired
	private AreaService areaService;

	@Autowired
	private LengthService lengthService;

	@Autowired
	private TemperatureService tempratureService;

	@Autowired
	private VolumeService volumeService;

	@Autowired
	private WeightService weightService;

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/metricArea/{value}")
	public ResponseEntity<Double> getConvertedAreaMetric(@PathVariable("value") double value) {
		Double resp = areaService.convertToMetric(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/imperialArea/{value}")
	public ResponseEntity<Double> getConvertedAreaImperial(@PathVariable("value") double value) {
		Double resp = areaService.convertToImperial(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/metricLength/{value}")
	public ResponseEntity<Double> getConvertedLengthMetric(@PathVariable("value") double value) {
		Double resp = lengthService.convertToMetric(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/imperialLength/{value}")
	public ResponseEntity<Double> getConvertedLengthImperial(@PathVariable("value") double value) {
		Double resp = lengthService.convertToImperial(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/metricTemprature/{value}")
	public ResponseEntity<Double> getConvertedTempratureMetric(@PathVariable("value") double value) {
		Double resp = tempratureService.convertToMetric(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/imperialTemprature/{value}")
	public ResponseEntity<Double> getConvertedTempratureImperial(@PathVariable("value") double value) {
		Double resp = tempratureService.convertToImperial(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/metricVolumn/{value}")
	public ResponseEntity<Double> getConvertedVolumnMetric(@PathVariable("value") double value) {
		Double resp = volumeService.convertToMetric(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/imperialVolumn/{value}")
	public ResponseEntity<Double> getConvertedVolumnImperial(@PathVariable("value") double value) {
		Double resp = volumeService.convertToImperial(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/metricWeight/{value}")
	public ResponseEntity<Double> getConvertedWeightMetric(@PathVariable("value") double value) {
		Double resp = weightService.convertToMetric(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}

	/**
	 * @author raju kumar
	 * @param value
	 * @return ResponseEntity<Double>
	 */

	@GetMapping(value = "/imperialWeight/{value}")
	public ResponseEntity<Double> getConvertedWeightImperial(@PathVariable("value") double value) {
		Double resp = weightService.convertToImperial(value);
		return new ResponseEntity<Double>(resp, HttpStatus.OK);

	}
}
