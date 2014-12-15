package com.brg.nl;

import java.io.*;
import java.util.*;

public class BusinessRuleGenerator{
 private String name;
 private ArrayList<Trigger> triggers;
 
 public BusinessRuleGenerator(String nm) throws IOException{
	 setName(nm);
	 ArrayList<Trigger> triggers = new ArrayList<Trigger>();
 }
 
 public void generate(String lan, String repDB){
	 System.out.println("De nodige Business Rules zijn nu in de juiste taal in triggers geplaatst.");
 }
 
 public void execute(){
	 System.out.println("De business rules zijn nu in de target database gezet.");
	 for(Trigger t: triggers){
		 if(t != null){
			 t.write();
		 } else {
			 break;
		 }
	 }
 }
 
 public void addTrigger(String name, String path, boolean toBeExecuted) throws IOException{
	 System.out.println("This is an Attribute Compare Rule");
	 triggers.add(new Trigger(name, path, toBeExecuted));
 }
 
 public void checkTrigger() throws IOException{
	 for(Trigger t: triggers){
		 if(t != null){
			 t.check();
		 } else {
			 break;
		 }
	 }
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}