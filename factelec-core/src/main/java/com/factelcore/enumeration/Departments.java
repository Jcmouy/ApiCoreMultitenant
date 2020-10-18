package com.factelcore.enumeration;

public enum Departments {
	NINGUNO(""),
	ARTIGAS("ARTIGAS"),
	CANELONES("CANELONES"),
	CERRO_LARGO("CERRO LARGO"),
	COLONIA("COLONIA"),
	DURAZNO("DURAZNO"),
	FLORES("FLORES"),
	FLORIDA("FLORIDA"),
	LAVALLEJA("LAVALLEJA"),
	MALDONADO("MALDONADO"),
	MONTEVIDEO("MONTEVIDEO"),
	PAYSANDU("PAYSANDU"),
	RIO_NEGRO("RIO NEGRO"),
	RIVERA("RIVERA"),
	ROCHA("ROCHA"),
	SALTO("SALTO"),
	SAN_JOSE("SAN JOSE"),
	SORIANO("SORIANO"),
	TACUAREMBO("TACUAREMBO"),
	TREINTA_Y_TRES("TREINTA Y TRES");
	

	private String label;

	private Departments(String label) {
		this.label = label;		
	}

	public String getLabel() {
		return label;
	}

}
