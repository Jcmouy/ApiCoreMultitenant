package uy.com.antel.fact.converter;

import com.factelcore.entity.SolicitudGenerada;
import com.factelcore.entity.SolicitudServicio;

import uy.com.antel.fact.electronica.model.SolicitudGeneradaVO;
import uy.com.antel.fact.electronica.model.SolicitudServicioVO;

public class SolicitudGeneradaConverter  extends AbstractEntityConverter<SolicitudGenerada, SolicitudGeneradaVO> {
	
	@Override
	protected boolean isAmbiguousSupported() {
		return true;
	}

}
