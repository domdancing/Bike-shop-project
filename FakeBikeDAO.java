/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import javax.swing.JTextField;
import model.Bike;

/**
 *
 * @author dominick valentine
 */
// this is the interface of Bike and EBike with use this interface
public interface FakeBikeDAO {

    /**
     *
     * @return
     */
    // makes the bike and adds it to the text file using user input
    public Bike createBike(String type,int gears,double cost, double tireSize);
    // this will look thought the whole textfile for the word the user puts in and prints the line the word is on
    
   public void find(String word);
   // just prints the whole text file
    public void Look();
   // takes a file and a userinput and deletes the userinput from the file using append 
    public  void delete(String file, String userInput);
   
    
}
