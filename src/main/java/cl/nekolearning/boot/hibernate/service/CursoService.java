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
		
		return cursoDAO.recuperaCursos();
	}
	
	@Override
	public Curso recuperarCursoPorId(int cursoId) {
		
		return cursoDAO.recuperarCursoPorId(cursoId);
	}

}
