package com.example.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.Converter;

@FacesConverter("helloConverter")
public class HelloConverter implements Converter {

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// Convert the object to a string representation
		return computeResult(value);
	}

	private String computeResult(Object value) {
		String level = "";

		if (value == null || String.valueOf(value).isEmpty()) {
			return level;
		}

		if (String.valueOf(value).matches("-?\\d+")) {

			switch (Integer.parseInt(value.toString()) / 100) {
			case 0:
				level = "Basic";
				break;
			case 1:
				level = "Silver";
				break;
			case 2:
				level = "Gold";
				break;
			case 3:
				level = "Platinum";
				break;
			case 4:
				level = "Elite";
				break;
			default:
				level = "Entry";
			}
			// The string is a valid integer
		} else {
			return level;
		}
		return level;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return computeResult(value);
	}
}