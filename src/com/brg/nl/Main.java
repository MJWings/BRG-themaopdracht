package com.brg.nl;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		int value1 = 1;
		int value2 = 10;
		
		BusinessRuleGenerator BRG = new BusinessRuleGenerator("Business Rule Generator");
		
		BRG.addTrigger();
		BRG.execute();
	}
}