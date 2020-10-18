package com.factelcore.enumeration;

public enum PerfilTypes {
	
	SOLICITANTE ( "USUARIOS SOLICITANTES"),
	PADRE ( "USUARIOS PADRES"),
	HIJO ( "USUARIOS HIJOS"),
	ADMINISTRADOR ( "USUARIOS ADMINISTRADORES"),
	TRAMITADOR_COMUN ( "USUARIOS TRAMITADORES COMUNES"),
	TRAMITADOR_EXPERTO ( "USUARIOS TRAMITADORES EXPERTOS"),
	ADMINISTRADOR_EXPERTO ( "ADMINISTRADORES EXPERTOS"),
	CONSULTA ( "USUARIOS CONSULTA");		
	
	private String label;
	
	private PerfilTypes( String label) 
	{		
		this.label = label;
	}

	public String getLabel() {
		return label;
	}


}
