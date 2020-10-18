package com.factelcore.enumeration;

public enum EstadoTypes {
	
	PENDIENTE ( "PENDIENTE", "esta pendiente" ),
	TRAMITANDOSE ( "TRAMITANDOSE","esta siendo procesada" ),
	APROBADO ( "APROBADO","fue aprobada" ),
	RECHAZADO ( "RECHAZADO","fue rechazada" ),
	DADO_DE_BAJA ( "DADO DE BAJA","fue dado de baja" ),
	SE_DIO_DE_BAJA ( "SE DIO DE BAJA","se dio de baja" ),
	MODIFICADO ( "MODIFICADO","fue modificada" ),
	ESPERAR_FIRMA ( "ESPERAR FIRMA","esta a espera de firma" ),
	CANCELADO ( "CANCELADO","fue cancelada" );		
	
	private String label;
	private String mensaje;
	
	private EstadoTypes( String label, String mensaje ) 
	{		
		this.label = label;
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public String getLabel() {
		return label;
	}
	
	public static Integer lookOrdinal(String namelabel){
		Integer ordinal = 0;
		for ( EstadoTypes e : EstadoTypes.values())
		{
			if ( e.label.equals(namelabel) )
				ordinal = e.ordinal();
		}
		return ordinal;
		
	}	
	
	public static EstadoTypes getEstadoTypesByLabel(String namelabel){
		if (namelabel!=null && !namelabel.equals("")){
			for (EstadoTypes c  : EstadoTypes.values()){
				if (c.label.equals(namelabel.trim())){
					return c;
				}
			}
		}
		return null;
	}
}
