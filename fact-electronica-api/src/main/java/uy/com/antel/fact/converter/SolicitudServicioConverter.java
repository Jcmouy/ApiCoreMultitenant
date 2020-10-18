package uy.com.antel.fact.converter;

import com.factelcore.entity.SolicitudServicio;

import uy.com.antel.fact.electronica.model.SolicitudServicioVO;

public class SolicitudServicioConverter  extends AbstractEntityConverter<SolicitudServicio, SolicitudServicioVO> {
	
	@Override
	protected boolean isAmbiguousSupported() {
		return true;
	}

}
