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
public class KelvinToFarenheit implements ConverterStrategy{
    
    private static final ConverterStrategy C2F = new KelvinToCelsius();
    private static final ConverterStrategy K2C = new CelsiusToFarenheit();
    
    @Override
    public double getConverted(double degrees) {
        return C2F.getConverted(K2C.getConverted(degrees));
    }

    @Override
    public String toString() {
        return "Kelvin To Farenheit";
    }
    
    @Override
    public String oppisite() { 
        return "Farenheit";
    }
    
    @Override
    public String starter(){
        return "Kelvin";
    }
    
    
}
