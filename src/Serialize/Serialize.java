/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialize;

import java.io.*;

/**
 *
 * @author Mona
 */
public class Serialize {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        Car c=new Car(7777,"green","spark");
        FileOutputStream fout=new FileOutputStream("/home/assistanz/Documents/sh.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(c);
        out.flush();
        System.out.println("victory victory");
        
    }
    
}
