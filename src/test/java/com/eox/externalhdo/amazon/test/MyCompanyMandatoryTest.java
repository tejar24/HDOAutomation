package com.eox.externalhdo.amazon.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.eox.externalhdo.amazon.base.Basetest;
import com.eox.utils.CommonFunctionUtils;

public class MyCompanyMandatoryTest extends Basetest {
	String title = "Click to sign the document";

	@Test(dataProvider = "getData")
	public void mandatoryCheck(HashMap<String, String> input) throws InterruptedException {
		first.applicationformsubmission();
//		aznutils.esignPdf("HUB Drive Online Privacy Notice-US.pdf", title);
//		aznutils.esignPdf("HUB Drive Online Terms and Conditions US.pdf", title);
//		aznutils.esignPdf("Telematics-User-Agreement.pdf", title);
//		aznutils.esignPdf("Amendment-User-Agreement.pdf", title);
//		aznutils.esignPdf("DSP Claims Authorization Letter US.pdf", title);
//		aznutils.esignPdf("HUB Drive Online EULA US.pdf", title);
//		aznutils.esignPdf("Netradyne Authorization Letter.pdf", title);
		third.giFormsubmission2(input);
		Thread.sleep(1000);
		aznutils.addInputToDatagrid("[1][locationType]", "Location #1");
		driver.findElement(By.xpath("//button[@ref='datagrid-dataGrid1-addRow']")).click();
		aznutils.addInputToDatagrid("[2][locationType]", "Location #1");
//		fourth.operationsFormSubmission(input);
//		fifth.unitsFileUpload();
//		fifth.laborFileUpload();
//		aznutils.drawSignature();
//		sixth.hiredAutosFormsubmission();

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "//src//test//java//data//TestData2.json");
		return new Object[][] { { data.get(0) }, { data.get(1) } };

	};

}
