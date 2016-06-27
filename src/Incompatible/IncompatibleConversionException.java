/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Incompatible;

/**
 *
 * @author CAP
 */
public class IncompatibleConversionException extends Exception {

    /**
     * Creates a new instance of <code>IncompatibleConversion</code> without
     * detail message.
     */
    public IncompatibleConversionException() {
    }

    /**
     * Constructs an instance of <code>IncompatibleConversion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IncompatibleConversionException(String msg) {
        super(msg);
    }
}
