/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanformjava2.Model;

/**
 *
 * @author Abner
 */
public class ModelProgram {
    public String label = "Please Put Your Information To Get The Result";
    
    public String returnGenderNoun(String gender){
        String noun = "He";
   
        if(gender.toLowerCase().equals("female")){
            noun = "She";
        }
        
        return noun;
    }

    public String returnMental(String mental){
        switch(mental){
            case "Skuy":
                return "Smilling";
            case "Filing Guud":
                return "Happy";
            case "SadBoy":
                return "Sad";
            case "ambyar":
                return "Crying";
            default:
                return "In Love";            
        }
    }
}
    


