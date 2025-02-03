/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Bike;

/**
 *
 * @author dominick valentine
 */
public class BikeDAO implements FakeBikeDAO {
    private Bike b;
    
private JTextField typeField;
    private JTextField gearsField;
    private JTextField costField;
 
    private JTextField tireSizeField;
    private JButton lookButton;
    private JTextField findField;
  
    @Override
    public Bike createBike(String types,int gears,double cost, double tireSize) {
          // addinn bikes
        
            // Get the user input
        
            // Create the Bike object
            Bike bike = new Bike(types, gears, cost,  tireSize);

            // Write the bike data to the file
            File file = new File("bikes.txt");
            try (PrintWriter outFile = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
                outFile.write(bike.toString());
                outFile.write("\n");
                JOptionPane.showMessageDialog(costField, "Bike is in file");
                //System.out.println("Bike added to the file");
            }
   
         catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(typeField, "Error writing to file");
        }
    // return bike;
    return bike;
    }
//


   
    @Override
    public void Look() {
       try {
      File myObj = new File("bikes.txt");
      Scanner myReader = new Scanner(myObj);
     
       // we just need to use \\Z as delimiter
        myReader.useDelimiter("\\Z");
       
      String data;
       data=myReader.next();
 
     
        JOptionPane.showMessageDialog(lookButton,data);
      
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    
    
     public void find(String word){
  
        Scanner obj=new Scanner(System.in);//standard input
        File input=new File("bikes.txt");      
        FileReader fr=null;       
        String SearcWord,str="";
        
      
        SearcWord=word;      
     
        try{
           fr=new FileReader(input);
           BufferedReader br=new BufferedReader(fr);  
            
           do{
               
           if(str.contains(SearcWord)){
               JOptionPane.showMessageDialog(findField,str);
               //System.out.println(str.contains(SearcWord)); 
          }
           
           
           }while((str=br.readLine())!=null);
           
        }
        
        catch (IOException ex) {            
            Logger.getLogger(Biketest.class.getName()).log(Level.SEVERE, null, ex);
        }            
        
        
        finally{            
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(Biketest.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            } 
    }

    @Override
    public void delete(String file, String userInput) {
        try {
            // Read the content of the file
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder fileContent = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Check if the line contains the user input
                if (!line.contains(userInput)) {
                    // get rid of the line that has the user input and put a newline
                    fileContent.append(line).append("\n");
                }
            }

            bufferedReader.close();

            // Write the updated content back to the file
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(fileContent.toString());
            bufferedWriter.close();
 JOptionPane.showMessageDialog(costField, "Bike is removed from file");
           // System.out.println("User input removed successfully.");

        } catch (IOException e) {
            System.err.println("Error: ");
        }
    }
       
    }


    
    

    
    
    

    
    

