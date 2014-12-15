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
 
 File input = new File("template.txt");
 File output =  new File("Triggers.txt");
 PrintWriter printer = new PrintWriter(output);
 
 ArrayList<String> regel = new ArrayList<String>();
 
 public Trigger(String nm, String string, boolean tbe) throws IOException{
	 setName(nm);
	 setPath(string);
	 setToBeExecuted(tbe);
 }

public void read() throws IOException{
	Scanner scan = new Scanner(input);
	while(scan.hasNextLine()){
		String temp = scan.nextLine();
		
		temp = temp.replace("%comment%", "-- This is a trigger");
		temp = temp.replace("%triggerName%", "BRG_VBMG_PRT_ARNG_01");
		temp = temp.replace("%declaredMethod%", "l_passed	boolean := true;");
		temp = temp.replace("%comment2%", "-- the value must be between one and ten");
		temp = temp.replace("%triggerEvent%", "l_oper ('INS, UPD')");
		temp = temp.replace("%operator%", "BETWEEN");
		temp = temp.replace("%attribute%", "l_passed := p_tnt_row.new_cijfer");
		temp = temp.replace("%VALUE1%", "1");
		temp = temp.replace("%VALUE2%", "10");
		temp = temp.replace("%errorMessage%", "the number is out of range, specify a number between 1 and 10");
		printer.println(temp);
		printer.flush();
	}
	scan.close();
}
 
/* public void write(){
	 pw.println("Tentamen.cijfer mag de waarde 1 t/m 10 hebben.");
	 pw.close();
 }*/
 
 /*public void createTrigger(){
	 pw.println("Dit is een Trigger voor een Attribute Compare Rule");
	 pw.println(generated);
	 pw.close();
 }*/
 
/* public boolean check() throws IOException{
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
 } */

public String getTriggerName() {
	return triggerName;
}

public void setName(String triggerName) {
	this.triggerName = triggerName;
}

public String getPath() {
	return path;
}

public void setPath(String string) {
	this.path = string;
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
