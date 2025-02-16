package com.insightglobal.day5;

public class StudentService {
		public String getStudentName(String admissionCode) throws
		AdmissionCodeException {
		String [][] names= {
		{ "101","Raj Kumar"},
		{ "102","Laksh verma"},
		{ "103","Suraj Kumar"}
		};
		
		for(int i=0;i<names.length;i++) {
		if(names[i][0].equals(admissionCode)) {
		return names[i][1];
		}
		}
		
		String error=admissionCode+"\nNo such admission code in our records";
		throw new AdmissionCodeException(error);
		}
		}

