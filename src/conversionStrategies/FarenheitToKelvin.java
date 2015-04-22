/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionStrategies;

/**
 *
 * @author ryancorbin
 */
public class FarenheitToKelvin implements ConverterStrategy{
    
    private static final ConverterStrategy F2C = new FarenheitToCelsius();
    private static final ConverterStrategy C2K = new CelsiusToKelvin();

    @Override
    public double getConverted(double degrees) {
        return C2K.getConverted(F2C.getConverted(degrees));
    }
    
    @Override
    public String toString() {
        return "Farenheit To Kelvin";
    }
    
    @Override
    public String oppisite() { 
        return "Kelvin";
    }
    
    
}
