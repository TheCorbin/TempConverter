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
public class CelsiusToFarenheit implements ConverterStrategy{

    private static final double SCALE = 9 / 5.0;
    private static final double FREEZING_POINT = 32;
    
    @Override
    public double getConverted(double degrees) {
        return SCALE * degrees + FREEZING_POINT;
    }
    
    @Override
    public String toString() {
        return "Celsius To Farenheit";
    }
    
    @Override
    public String oppisite() { 
        return "Farenheit";
    }
    
    @Override
    public String starter(){
        return "Celsius";
    }
}