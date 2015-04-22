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
public class CelsiusToKelvin implements ConverterStrategy{
    
    private static final double OFFSET = 273.15;
    
    @Override
    public double getConverted(double degrees) {
        return degrees + OFFSET;
    }
    
    @Override
    public String toString() {
        return "Celsius To Kelvin";
    }
    
    @Override
    public String oppisite() { 
        return "Kelvin";
    }
    
    @Override
    public String starter(){
        return "Celsius";
    }
}
