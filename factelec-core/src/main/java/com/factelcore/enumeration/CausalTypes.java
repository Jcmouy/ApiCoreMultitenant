package com.factelcore.enumeration;


public enum CausalTypes {
	
	NO_PASO_POR_TRAMITACION ( "NO PASO POR TRAMITACION", EstadoTypes.PENDIENTE ),
	TRAMITANDOSE ( "DEJADO PENDIENTE EN TRAMITACION",EstadoTypes.TRAMITANDOSE ),
	APROBADO ( "APROBADO NORMALMENTE",EstadoTypes.APROBADO ),
	RECHAZADO ( "RECHAZADO",EstadoTypes.RECHAZADO ),
	DADO_DE_BAJA ( "DADO DE BAJA",EstadoTypes.DADO_DE_BAJA ),
	SE_DIO_DE_BAJA ( "SE DIO DE BAJA",EstadoTypes.SE_DIO_DE_BAJA ),
	MODIFICADO ( "MODIFICADO POR EL USUARIO",EstadoTypes.MODIFICADO ),
	ESPERAR_FIRMA ( "PENDIENTE EN ESPERA DE FIRMA",EstadoTypes.PENDIENTE ),
	CANCELADO ( "CANCELADO",EstadoTypes.CANCELADO),
	NUEVA_CAUSAL ( "NUEVA CAUSAL",EstadoTypes.APROBADO);		
	
	private String label;
	private EstadoTypes estado;
	
	private CausalTypes( String label, EstadoTypes estado ) 
	{		
		this.label = label;
		this.estado = estado;
	}

	public EstadoTypes getEstado() {
		return estado;
	}

	public String getLabel() {
		return label;
	}
	
	public static Integer lookOrdinal(String namelabel){
		Integer ordinal = 0;
		for ( CausalTypes e : CausalTypes.values())
		{
			if ( e.label.equals(namelabel) )
				ordinal = e.ordinal();
		}
		return ordinal;
		
	}	
	
	public static CausalTypes getCausalTypesByLabel(String namelabel){
		if (namelabel!=null && !namelabel.equals("")){
			for (CausalTypes c  : CausalTypes.values()){
				if (c.label.equals(namelabel.trim())){
					return c;
				}
			}
		}
		return null;
	}
}
