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

public String read(){
	 String s = "";
	 
	 return s;
 }
 
 public void write(){
	 pw.println("Dit is een Attribute Compare Rule");
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
