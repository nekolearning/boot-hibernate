package cl.nekolearning.boot.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.nekolearning.boot.hibernate.entity.Curso;
import cl.nekolearning.boot.hibernate.service.ICursoService;

@Controller
public class IndexController {

	@Autowired
	@Qualifier("curso")
	private ICursoService cursoService;

	@GetMapping("/recuperaCursos")
	public @ResponseBody List<Curso> recuperaCursos() {

		List<Curso> cursos = cursoService.recuperarCursos();
		return cursos;
	}

	@GetMapping("/recuperarCursoPorId")
	public @ResponseBody Curso recuperarCursoPorId() {

		Curso curso = cursoService.recuperarCursoPorId(1);
		return curso;
	}

}
