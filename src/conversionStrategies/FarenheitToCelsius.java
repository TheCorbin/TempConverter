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
public class FarenheitToCelsius implements ConverterStrategy {
    
    private static final double SCALE = 5 / 9.0;
    private static final double FREEZING_POINT = 32;
    
    @Override
    public double getConverted(double degrees) {
        return SCALE * (degrees - FREEZING_POINT);
    }
    
    @Override
    public String toString() {
        return "Farenheit To Celsius";
    }
    
    @Override
    public String oppisite() { 
        return "Celsius";
    }
}
