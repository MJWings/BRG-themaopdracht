package com.brg.nl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
 private String name;
 private String ip;
 private int port;
 private String password;
 private String database;
 private String type;
 private Connection con;
 
 public Database(String nm, String ipAdress, int prt, String pw, String db, String tp){
	 name = nm;
	 ip = ipAdress;
	 port = prt;
	 pw = password;
	 database = db;
	 type = tp;
 }
 
 public String getName(){
	return name; 
 }
 
 public void setName(String nm){
	 name = nm;
 }
 
 public boolean hasDatabase(String ipAdress, String db){
	 boolean b = false;
	 //if statement hier omheen
	 b = true;
	 //code nog niet geschreven
	 return b;
 }
 
 public String getBusinessRule(){
	 return "Dit is een arraylist met alle Businessrules";
 }
 
 public boolean connect(String ipAdress, String username, String pw){
	 boolean b = false;
	 ip = ipAdress;
	 password = pw;
	 try{
		 con = DriverManager.getConnection(ip, username ,password);
		 b = true;
	 } catch(SQLException err){
		 System.out.println(err.getMessage());
		 b = false;
	 }
	 return b;
 }
}
