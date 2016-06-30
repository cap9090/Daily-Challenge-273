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
import Celcius.*;
import Farenheit.*;
import Kelvin.*;
import Radian.*;
import Degree.*;

public class MethodCaller {
    
    /*
    this method will only get called if we have a valid input
    calls the approprite library routine and returns the conveted output
    */
    public static Double convert(String suffix, double input){
        switch(suffix){
            case "rd":
                return new Rad2Deg().convert(input);
            case "dr":
                return new Deg2Rad().convert(input);
            case "kf":
                return new Kel2Far().convert(input);
            case "kc":
                return new Kel2Cel().convert(input);
            case "fk":
                return new Far2Kel().convert(input);
            case "fc":
                return new Far2Cel().convert(input);
            case "ck":
                return new Celcius2Kelvin().convert(input);
            case "cf":
                return new Celcius2Far().convert(input);
            default:
                return null;
        }
    }
}
