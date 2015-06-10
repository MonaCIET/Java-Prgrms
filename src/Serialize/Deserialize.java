/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialize;

import java.io.*;
/**
 *
 * @author assistanz
 */

public class Deserialize{  
 public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("/home/assistanz/Documents/sh.txt"));  
  Car c=(Car)in.readObject();  
  System.out.println(c.num+" "+c.color+" "+c.name);  
  
  in.close();  
 }  
}