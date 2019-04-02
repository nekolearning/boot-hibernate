package cl.nekolearning.boot.hibernate.service;

import java.util.List;

import cl.nekolearning.boot.hibernate.entity.Curso;

public interface ICursoService {
	
	List<Curso> recuperarCursos();
	Curso recuperarCursoPorId(int cursoId);

}
