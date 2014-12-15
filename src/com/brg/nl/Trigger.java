package com.brg.nl;

import java.io.*;
import java.util.*;

public class Trigger {
 private String triggerName;
 private String comment;
 private String declaredMethod;
 private String triggerEvent;
 private String column;
 private String table;
 private String attribute;
 private String operator;
 private String valueOne;
 private String valueTwo;
 private String errorMessage;
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

public String getTriggerName() {
	return triggerName;
}

public void setName(String triggerName) {
	this.triggerName = triggerName;
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

public String getComment() {
	return comment;
}

public void setComment(String comment) {
	this.comment = comment;
}

public String getDeclaredMethod() {
	return declaredMethod;
}

public void setDeclaredMethod(String declaredMethod) {
	this.declaredMethod = declaredMethod;
}

public String getTriggerEvent() {
	return triggerEvent;
}

public void setTriggerEvent(String triggerEvent) {
	this.triggerEvent = triggerEvent;
}

public String getColumn() {
	return column;
}

public void setColumn(String column) {
	this.column = column;
}

public String getTable() {
	return table;
}

public void setTable(String table) {
	this.table = table;
}

public String getAttribute() {
	return attribute;
}

public void setAttribute(String attribute) {
	this.attribute = attribute;
}

public String getOperator() {
	return operator;
}

public void setOperator(String operator) {
	this.operator = operator;
}

public String getValueOne() {
	return valueOne;
}

public void setValueOne(String valueOne) {
	this.valueOne = valueOne;
}

public String getValueTwo() {
	return valueTwo;
}

public void setValueTwo(String valueTwo) {
	this.valueTwo = valueTwo;
}

public String getErrorMessage() {
	return errorMessage;
}

public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
}
