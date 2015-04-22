/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;


import javax.swing.JTextField;
import util.validation.ValidatableWithValidator;
import util.validation.Validator;

/**
 *
 * @author ryancorbin
 */
public class JTextFieldValidatable extends JTextField implements ValidatableWithValidator<String>{
    
    private Validator<String> validator;
    private String errorMessage;
    
    @Override
    public Validator<String> getValidator(){
        return validator;
        
    }
        
    @Override    
    public void setValidator(Validator<String> validator) {    
        if (validator == null) {
            throw new IllegalArgumentException();
        } 
        this.validator = validator; 
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    @Override
    public boolean isValidated(){
        return validator.isValid(this.getText());
    }
    
    
    
    
    
}
