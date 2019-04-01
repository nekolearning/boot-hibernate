package cl.nekolearning.boot.hibernate.dao;

import java.util.List;

import cl.nekolearning.boot.hibernate.entity.Curso;

public interface ICursoDAO {

	  List<Curso> recuperaCursos();
	  String crearCurso(Curso curso);
	  Curso recuperarCurso(Long cursoId);
	  String actualizarCurso(Curso curso);
	  String borrarCurso(Long cursoId);
}
