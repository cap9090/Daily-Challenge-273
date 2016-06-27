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
public enum DegreeTypes {
    
    
      DEGREE("d"), RADIAN("r"), KELVIN("k"), CELCIUS("c"), FARENHEIT("f");


      private String nameAsString;

      private DegreeTypes(String nameAsString){
        this.nameAsString = nameAsString;
      }

      @Override
      public String toString(){
        return this.nameAsString;
      }
  

}
