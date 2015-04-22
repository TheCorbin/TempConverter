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
public class KelvinToCelsius implements ConverterStrategy{
    
    private static final double OFFSET = 273.15;
    
    @Override
    public double getConverted(double degrees) {
        return degrees - OFFSET;
    }
    
    @Override
    public String toString() {
        return "Kelvin To Celsius";
    }
    
    @Override
    public String oppisite() { 
        return "Celsius";
    }
}
