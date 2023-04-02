package com.iqvia.clinicals.api.restcontrollers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClinicalDataRequest {
	private String componentName;
	private String componentValue;
	private int patientId;
}
