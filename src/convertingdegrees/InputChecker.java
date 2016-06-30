/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertingdegrees;

/**
 *
 * @author CAP
 */


/*
    class designed to check if the input is formatted correctly
*/
public class InputChecker {
    
    
    
    
    
    /*
    returns the suffix of the input or null if invalid input
    */
    public static String checkInput(String input){
        
        
        if(!Character.isLowerCase(input.charAt(input.length() - 1))){
            return null;
        }
                
        if(!Character.isLowerCase(input.charAt(input.length() - 2))){
            return null;
        }
                
        
        byte numDecimals = 0;
        for (int i = 0 ; i < input.length() - 2; i++){
            
            if(input.charAt(i) == '.'){
                numDecimals++;
            }
            
            if(!Character.isDigit(input.charAt(i))){
                return null;
            }
            
            if(numDecimals == 2){
                return null;
            }
        }
        
        return input.substring(input.length()-2);
        
            
    }
}
