package com.arica.infraccionservice.validator;

import com.arica.infraccionservice.entity.Infraccion;
import com.arica.infraccionservice.exception.ValidateServiceException;

public class InfraccionValidator {
	public static void save(Infraccion infraccion) {
		if(infraccion.getDni()==null || infraccion.getDni().isEmpty()) {
			throw new ValidateServiceException("El DNI es requerido");
		}
		if(infraccion.getDni().length()>8) {
			throw new ValidateServiceException("Se requeire solo 8 digitos");
		}
		
		if(infraccion.getFecha()==null) {
			throw new ValidateServiceException("La fecha es requerida");
		}
		
		if(infraccion.getFalta()==null || infraccion.getFalta().isEmpty()) {
			throw new ValidateServiceException("La falta es requerida");
		}
		if(infraccion.getFalta().length()>4) {
			throw new ValidateServiceException("Se requeire solo 3 caracteres");
		}
		
		if(infraccion.getInfraccion()==null || infraccion.getInfraccion().isEmpty()) {
			throw new ValidateServiceException("La Infraccion es requerida");
		}
		if(infraccion.getInfraccion().length()>200) {
			throw new ValidateServiceException("Se requeire solo 200 caracteres");
		}	
	}
}
