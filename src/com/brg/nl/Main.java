package com.brg.nl;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		int value1 = 1;
		int value2 = 10;
		Trigger t1 = new Trigger("ARR_Trigger", "testPath", true);
		
		BusinessRuleGenerator BRG = new BusinessRuleGenerator("Business Rule Generator");
		
		BRG.addTrigger("BRG_THOSAD_CIJFER_CNS_ARR_01","test_path", true);
		BRG.execute();
	}
}