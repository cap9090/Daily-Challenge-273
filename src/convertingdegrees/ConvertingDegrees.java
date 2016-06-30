/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertingdegrees;

import java.util.Scanner;
import Incompatible.IncompatibleConversionException;
import Converter.*;
/**
 *
 * @author CAP
 */
public class ConvertingDegrees {

    
    public static void main(String[] args) {
        
        if(args.length  != 1){
            System.err.println("Only one argument for input");
        }
        
        String input = args[0];
        
        String suffix;
        
        if((suffix = InputChecker.checkInput(input)) == null){
            System.err.println("Invalid input");
            System.exit(1);
        }
        
        double value = Double.parseDouble(input.substring(0,input.length()-2));
        System.out.println(MethodCaller.convert(suffix, value));
    }
    
}
