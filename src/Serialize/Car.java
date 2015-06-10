/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialize;

import java.io.Serializable;

/**
 *
 * @author assistanz
 */
public class Car implements Serializable {

    int num;
    String color;
    String name;
   // Double price;

    public Car(int num, String color, String name) {
        this.num = num;
        this.color = color;
        this.name = name;
       
    }
    
   
}
