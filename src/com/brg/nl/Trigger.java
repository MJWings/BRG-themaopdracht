package com.brg.nl;

import java.io.*;
import java.util.*;

public class Trigger {
 private String name;
 private String generator;
 private String application;
 private String entity;
 private String generatedObject;
 private String ruleType;
 private String countNumber;
 private String path;
 private boolean toBeExecuted;
 
 FileReader fr = new FileReader("Triggers.txt");
 BufferedReader br = new BufferedReader(fr);
 
 FileWriter fw =  new FileWriter("Triggers.txt");
 PrintWriter pw = new PrintWriter(fw);
 
 ArrayList<String> regel = new ArrayList<String>();
 
 public Trigger(String nm, String pt, boolean tbe) throws IOException{
	 setName(nm);
	 setPath(pt);
	 setToBeExecuted(tbe);
 }
 
 public String getGenerator() {
	return generator;
}

public void setGenerator(String generator) {	
	this.generator = generator;
}

public String getApplication() {
	return application;
}

public void setApplication(String application) {
	this.application = application;
}

public String getCountNumber() {
	return countNumber;
}

public String getGeneratedObject() {
	return generatedObject;
}

public void setGeneratedObject(String generatedObject) {
	this.generatedObject = generatedObject;
}

public void setCountNumber(String countNumber) {
	this.countNumber = countNumber;
}

public String getEntity() {
	return entity;
}

public void setEntity(String entity) {
	this.entity = entity;
}

public String getRuleType() {
	return ruleType;
}

public void setRuleType(String ruleType) {
	this.ruleType = ruleType;
}

public String read() throws IOException{
	String s = "";
	while(true){
		String temp = br.readLine();
		if(temp == null){
			break;
		}
		
		regel.add(temp);
		Scanner scan = new Scanner(temp);
		scan.useDelimiter("%");
		String templateVar = scan.next();
		String var = "";
		switch(var){
		case "comment": var = "Insert comment here"; break;
		case "triggerName": var = "BRG_VBMG_PRT_ARNG_01"; break;
		case "declaredMethod": var = ""; break;
		case "triggerEvent": var = ""; break;
		case "COLUMN": var = "Grade"; break;
		case "TABLE": var = "Student"; break;
		case "attribute": var = ""; break;
		case "operator": var = ""; break;
		case "VALUE1": var = "1"; break;
		case "VALUE2": var = "10"; break;
		case "errorMessage": var = "The rule is not approved"; break;
		default: var = ""; break;
		}
		s = s + " " + var;
	}
	return s;
 }
 
 public void write(){
	 pw.println("Tentamen.cijfer mag de waarde 1 t/m 10 hebben.");
	 pw.close();
 }
 
 public void createTrigger(){
	 pw.println("Dit is een Trigger voor een Attribute Compare Rule");
	 pw.close();
 }
 
 public boolean check() throws IOException{
	 boolean b = false;
	 String temp = br.readLine();
	 if(temp == null){
		 System.out.println("Geen Trigger gevonden!");
	 } else {
		 System.out.println("Trigger is gecontroleerd!");
		 b = true;
	 }
	 br.close();
	 return b;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	name = 
	this.name = name;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

public boolean isToBeExecuted() {
	return toBeExecuted;
}

public void setToBeExecuted(boolean toBeExecuted) {
	this.toBeExecuted = toBeExecuted;
}
}
