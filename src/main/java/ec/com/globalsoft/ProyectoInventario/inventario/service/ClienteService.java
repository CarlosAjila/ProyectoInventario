package ec.com.globalsoft.ProyectoInventario.inventario.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Periodo;

public interface ClienteService {

	@Transactional
	public List<Periodo> obtenerPorId(Integer id);

	@Transactional
	public List<Periodo> obtenerTodos();

}
