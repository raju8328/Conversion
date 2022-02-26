package com.momentum.SpringBootMetricConversion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import com.momentum.SpringBootMetricConversion.service.VolumeService;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class VolumeServiceTest {
	@InjectMocks
    private VolumeService volumeService;

    @BeforeAll
    static void setup() {
        MockitoAnnotations.openMocks(VolumeServiceTest.class);
    }

    @Test
    public void when_convertingLitreToGallon_expect_correctValue() {
        assertEquals(6.40, volumeService.convertToImperial(29.1));
    }

    @Test
    public void when_convertingGallonLitre_expect_correctValue() {
        assertEquals(73.19, volumeService.convertToMetric(16.1));
    }
}
