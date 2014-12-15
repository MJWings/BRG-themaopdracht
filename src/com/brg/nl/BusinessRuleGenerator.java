package com.brg.nl;

import java.util.*;
import java.io.*;

public class BusinessRuleGenerator{
 private String name;
 private Trigger trigger;
 
 public BusinessRuleGenerator(String nm) throws IOException{
	 name = nm;
 }
 
 public void generate(String lan, String repDB){
	 System.out.println("De nodige Business Rules zijn nu in triggers geplaatst.");
 }
 
 public void execute(){
	 System.out.println("De business rules zijn nu in de target database gezet.");
	 trigger.write();
 }
 
 public void addTrigger(){
	 System.out.println("Dit is een Attribute Comapre Rule");
	 trigger.createTrigger();
 }
 
 public void checkTrigger() throws IOException{
	 trigger.check();
 }
}