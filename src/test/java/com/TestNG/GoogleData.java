package com.TestNG;

import org.testng.annotations.DataProvider;

public class GoogleData {
	
	@DataProvider
	public String[] GetData() {
		
		String data[] = new String[5];
		
		data[0] = "Motorola G50 max";
		data[1] = "Job kab milega";
		data[2] = "Kaise google mai job milega";
		data[3] = "Automation interview Question With answer";
		data[4] = "Sasta acha ssd batao";
		
		
		return data;
		
	}

}
