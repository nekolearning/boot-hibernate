package cl.nekolearning.boot.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.nekolearning.boot.hibernate.dao.ICursoDAO;
import cl.nekolearning.boot.hibernate.entity.Curso;

@Service("curso")
public class CursoService implements ICursoService {
	
	@Autowired
	private ICursoDAO cursoDAO;

	@Override
	public List<Curso> recuperarCursos() {
		//Tu logica de negocio aqui
		return cursoDAO.recuperarCursos();
	}
	
	@Override
	public String crearCurso(Curso curso) {
		//Tu logica de negocio aqui
		return cursoDAO.crearCurso(curso);
	}
	
	@Override
	public Curso recuperarCursoPorId(int cursoId) {
		//Tu logica de negocio aqui
		return cursoDAO.recuperarCursoPorId(cursoId);
	}

	@Override
	public String borrarCurso(int cursoId) {
		//Tu logica de negocio aqui
		return cursoDAO.borrarCurso(cursoId);
	}

	@Override
	public String actualizarCurso(Curso curso) {
		//Tu logica de negocio aqui
		return cursoDAO.actualizarCurso(curso);
	}

}
