package cl.nekolearning.boot.hibernate.service;

import java.util.List;

import cl.nekolearning.boot.hibernate.entity.Curso;

public interface ICursoService {
	
	  List<Curso> recuperarCursos();
	  String crearCurso(Curso curso);
	  Curso recuperarCursoPorId(int cursoId);
	  String actualizarCurso(Curso curso);
	  String borrarCurso(int cursoId);

}
