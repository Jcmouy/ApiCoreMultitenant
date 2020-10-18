package uy.com.antel.fact.converter;

import com.factelcore.entity.SolicitudInformacion;

import uy.com.antel.fact.electronica.model.SolicitudInformacionVO;

public class SolicitudInformacionConverter  extends AbstractEntityConverter<SolicitudInformacion, SolicitudInformacionVO> {
	
	@Override
	protected boolean isAmbiguousSupported() {
		return true;
	}

}
