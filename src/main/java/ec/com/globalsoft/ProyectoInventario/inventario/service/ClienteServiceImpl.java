package ec.com.globalsoft.ProyectoInventario.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.dao.PeriodoDao;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Periodo;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private PeriodoDao periodoDao;

	public List<Periodo> obtenerPorId(Integer id) {
		if (id != null && id != 0)
			return periodoDao.obtenerPorHql("select p from Periodo p where p.id like ?1", new Object[] { id });
		else
			return null;

	}

	public List<Periodo> obtenerTodos() {
		return periodoDao.obtenerPorHql("select p from Periodo p", new Object[] {});

	}

}
