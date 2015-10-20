package com.straw.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Loging {
     String userName;
     transient String passWord;
     public Loging(String userName,String passWord) {
    	 this.userName = userName;
    	 this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Loging [userName=" + userName + ", passWord=" + passWord + "]";
	}
    public static void main(String[] args) {
    	Loging loging = new Loging("xiaowu", "123");
    	System.out.println(loging.toString());
    	try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("loging.out"));
			o.writeObject(loging);
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("loging.out"));
			Loging l = (Loging) in.readObject();
			System.out.println(l.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
	}
}
