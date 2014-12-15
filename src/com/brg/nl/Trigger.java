package com.brg.nl;

import java.io.*;
import java.util.*;

public class Trigger {
 private String name;
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

public String getName() {
	return name;
}

public void setName(String name) {
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
