/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import conversionStrategies.*;
import java.util.Vector;

/**
 *
 * @author ryancorbin
 */
public class TempConverterService {
    
    private Vector<String> degreeScales;

    public TempConverterService() {
        degreeScales = new Vector<String>();
        setDegreeScales(degreeScales);
    }

    /**
     * Getter method for the vector of converter strategies
     * @return 
     */
    public final Vector<String> getDegreeScales() {
        return degreeScales;
    }
    
    /**
     * Sets all of the different strategy objects in the program.  If we want to
     * add another strategy we would do it here.
     * @param degreeScales - The hopefully empty vector into which the conversion
     * strategy objects will be placed.
     */
    private final void setDegreeScales(Vector degreeScales){
        degreeScales.clear();
        degreeScales.add(new CelsiusToFarenheit());
        degreeScales.add(new CelsiusToKelvin());
        degreeScales.add(new FarenheitToCelsius());
        degreeScales.add(new FarenheitToKelvin());
        degreeScales.add(new KelvinToFarenheit());
        degreeScales.add(new KelvinToCelsius());
    }
    
}
