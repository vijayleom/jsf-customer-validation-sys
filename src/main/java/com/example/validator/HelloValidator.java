package com.example.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("helloValidator")
public class HelloValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String input = value.toString();

        // Example validation: input must not be empty and must be at least 5 characters long
        if (input == null || input.isEmpty() || input.length() < 3) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation Error", 
                                                     "Input must be at least 3 characters long.");
            throw new ValidatorException(message);
        }
    }
}