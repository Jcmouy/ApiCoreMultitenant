package uy.com.antel.fact.converter;

import com.factelcore.entity.SolicitudGenerada;
import com.factelcore.entity.SolicitudServicio;
import com.factelcore.entity.Usuario;

import uy.com.antel.fact.electronica.model.SolicitudGeneradaVO;
import uy.com.antel.fact.electronica.model.SolicitudServicioVO;
import uy.com.antel.fact.electronica.model.UsuarioVO;

public class UsuarioConverter  extends AbstractEntityConverter<Usuario, UsuarioVO> {
	
	@Override
	protected boolean isAmbiguousSupported() {
		return true;
	}

}
