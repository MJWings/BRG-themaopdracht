package com.brg.nl;

public class Trigger {
 private String name;
 private String path;
 private boolean toBeExecuted;
 
 public Trigger(String nm, String pt, boolean tbe){
	 setName(nm);
	 setPath(pt);
	 toBeExecuted = tbe;
 }
 
 public String read(){
	 String s = "";
	 
	 return s;
 }
 
 public void write(){
	 
 }
 
 public void createTrigger(){
	 
 }
 
 public void check(){
	 
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
}
