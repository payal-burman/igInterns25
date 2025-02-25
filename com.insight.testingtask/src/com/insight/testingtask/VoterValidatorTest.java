package com.insight.testingtask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class VoterValidatorTest {

	    private final VoterValidator voterValidator = new VoterValidator();
	    @ParameterizedTest
	    @ValueSource(ints = {19, 20, 45, 78})
	    public void validateVoterAgeTestValidAges(int age) throws Exception {
	        
	        Assertions.assertTrue(voterValidator.validateVoterAge(age));
	    }

	    @ParameterizedTest
	    @ValueSource(ints = {0, 5, 12, 17})
	    public void validateVoterAgeTestInvalidAges(int age) throws Exception {
	      
	        Assertions.assertFalse(voterValidator.validateVoterAge(age));
	    }

	    @Test
	    public void testValidateVoterAgeWithNegativeValue() {
	       
	        Exception exception = Assertions.assertThrows(Exception.class, () -> {
	            voterValidator.validateVoterAge(-1);
	        });

	        Assertions.assertEquals("Invalid age", exception.getMessage());
	    }
	}


