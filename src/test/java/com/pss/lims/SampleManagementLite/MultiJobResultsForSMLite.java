package com.pss.lims.SampleManagementLite;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.testng.annotations.Test;

import com.pss.lims.login.SMLoginDetails;

public class MultiJobResultsForSMLite extends SMLoginDetails{
	@Test
	public static void toMultiJobResultsForSMLite() throws Exception {
		// TODO Auto-generated method stub
//		SMLoginDetails login = new SMLoginDetails();
//		login.setUp();
		
		
	 String Count = properties.getProperty("NumberofTestCount");
			 
	 int NumberofTestCount = Integer.parseInt(Count);
	
for (int i = 0; i < NumberofTestCount; i++) {

	JobResultsForSMLiteWithSearch user = new JobResultsForSMLiteWithSearch();
        user.JobResultsForSMLiteVersion();
       
        
	}
//SMLoginDetails.tearDown();

	}

}
