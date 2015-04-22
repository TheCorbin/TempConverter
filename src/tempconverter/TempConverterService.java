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

    public Vector<String> getDegreeScales() {
        return degreeScales;
    }
    
//    public Vector<String> getOthers(String state) {
//        System.out.println(state);
//        setDegreeScales(degreeScales);
//        System.out.println(degreeScales.toString());
//        int itemIndex = -1;
//        
//        for (String x: degreeScales){
//            if(x == state){
//                itemIndex = x.indexOf(x);
//            }
//        }
//       Vector<String> degreeRemoved = degreeScales;
//       String Removed = degreeRemoved.remove(itemIndex);
//       System.out.println(degreeRemoved.toString());
//       return degreeRemoved;
//    }
    
    public void setDegreeScales(Vector degreeScales){
    degreeScales.clear();
    degreeScales.add(new CelsiusToFarenheit());
    degreeScales.add(new CelsiusToKelvin());
    degreeScales.add(new FarenheitToCelsius());
    degreeScales.add(new FarenheitToKelvin());
    degreeScales.add(new KelvinToFarenheit());
    degreeScales.add(new KelvinToCelsius());
    }
    
}
