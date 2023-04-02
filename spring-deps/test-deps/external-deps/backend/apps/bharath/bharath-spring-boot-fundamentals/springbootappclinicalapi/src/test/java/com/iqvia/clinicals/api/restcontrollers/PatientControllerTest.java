package com.iqvia.clinicals.api.restcontrollers;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.iqvia.clinicals.api.model.ClinicalData;
import com.iqvia.clinicals.api.model.Patient;
import com.iqvia.clinicals.api.repository.PatientRepository;

public class PatientControllerTest {

	@Test
	public void testSavePatient() {
		PatientRepository patientRepository = mock(PatientRepository.class);
		Patient patient = new Patient();
		patient.setFirstName("John");
		patient.setLastName("Feguson");
		PatientController controller = new PatientController(patientRepository);
		when(patientRepository.save(patient)).thenReturn(patient);
		Patient finalResult = controller.savePatient(patient);
		assertNotNull(finalResult);
		assertEquals(finalResult, patient);
	}

	@Test
	public void testGetPatient() {
		PatientRepository patientRepository = mock(PatientRepository.class);
		Patient patient = new Patient();
		patient.setFirstName("John");
		patient.setLastName("Feguson");

		Optional<Patient> optionalPatient = Optional.of(patient);
		PatientController controller = new PatientController(patientRepository);

		when(patientRepository.findById(1)).thenReturn(optionalPatient);
		Patient finalResult = controller.getPatient(1);
		assertNotNull(finalResult);
		assertEquals(finalResult, patient);
	}

	@Test
	public void testGetPatients() {
		PatientRepository patientRepository = mock(PatientRepository.class);
		Patient patient1 = new Patient();
		patient1.setFirstName("John");
		patient1.setLastName("Feguson");

		Patient patient2 = new Patient();
		patient2.setFirstName("Tavish");
		patient2.setLastName("Shankaran");

		List<Patient> patientList = Arrays.asList(patient1, patient2);

		PatientController controller = new PatientController(patientRepository);

		when(patientRepository.findAll()).thenReturn(patientList);
		List<Patient> finalResult = controller.getPatients();
		assertNotNull(finalResult);
		assertEquals(finalResult.size(), 2);
		assertEquals(finalResult.get(1), patient2);
	}

	@Test
	public void testAnalyse() {
		PatientRepository patientRepository = mock(PatientRepository.class);
		java.util.Date uDate = new java.util.Date();
		Date date = new Date(uDate.getTime());
		Patient patient = new Patient();

		patient.setFirstName("John");
		patient.setLastName("Feguson");

		ClinicalData clinicalData = new ClinicalData();
		clinicalData.setId(1);
		clinicalData.setComponentName("hw");
		clinicalData.setComponentValue("6/190");
		clinicalData.setMeasuredDateTime(new Timestamp(date.getTime()));

		patient.setClinicalData(new ArrayList<ClinicalData>(Arrays.asList(clinicalData)));

		Optional<Patient> optionalPatient = Optional.of(patient);

		when(patientRepository.findById(1)).thenReturn(optionalPatient);

		PatientController controller = new PatientController(patientRepository);
		Patient finalResult = controller.analyse(1);

		assertNotNull(finalResult);
		assertEquals(finalResult.getClinicalData().size(), 2);
		assert (finalResult.getClinicalData().get(1).getComponentValue().contentEquals("25.651041"));

	}

}