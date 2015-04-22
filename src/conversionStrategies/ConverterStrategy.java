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
public interface ConverterStrategy {
    public double getConverted(double degrees);
    
    public String toString();
    
    public String oppisite();
}