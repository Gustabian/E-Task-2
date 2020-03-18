/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanformjava2.Function;

import latihanformjava2.Model.ModelProgram;

/**
 *
 * @author Abner
 */
public class ProgramLogic extends ModelProgram{
    
    ModelProgram modelProgram = new ModelProgram();
    
    public String result(String name, String born_date, String mental,
            String gender){
        
        String noun = modelProgram.returnGenderNoun(gender);
        String mental_Status = modelProgram.returnMental(mental);
        
        return "The Name Is " + name + "\nwas born at " + born_date +
                ".\n" + noun + " is currently " + mental_Status;
    }
    public String result(String name){
        return "The Name Is " + name + ".";
    }
    
    public String result(String name, String mental){
        String mental_status = modelProgram.returnMental(mental);
        
        return "The Name Is " + name + " \nis currently " + mental_status + ".";
    }    
}
