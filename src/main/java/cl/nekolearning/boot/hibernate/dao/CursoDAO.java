package cl.nekolearning.boot.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.nekolearning.boot.hibernate.entity.Curso;

@Transactional
@Repository
public class CursoDAO implements ICursoDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Curso> recuperarCursos() {

		List<Curso> result = new ArrayList<Curso>();

		try {

			String hql = "FROM Curso as c ORDER BY c.cursoId";

			result = (List<Curso>) entityManager.createQuery(hql).getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			result = new ArrayList<Curso>(); // better empty than null
		}

		return result;

	}

	@Override
	public String crearCurso(Curso curso) {

		String result;

		try {

			entityManager.getTransaction().begin();
			entityManager.persist(curso);
			entityManager.getTransaction().commit();

			result = "ok";

		} catch (Exception e) {
			e.printStackTrace();
			result = "fail";

		}

		return result;
	}

	@Override
	public Curso recuperarCursoPorId (int cursoId) {

		Curso curso = new Curso();

		try {
			curso = entityManager.find(Curso.class, cursoId);
			entityManager.detach(curso);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return curso;

	}

	@Override
	public String actualizarCurso(Curso curso) {

		String result;

		try {
			Curso cursoActualizado = curso;
			entityManager.detach(cursoActualizado);

			cursoActualizado.setCosto(curso.getCosto());
			cursoActualizado.setDuracion(curso.getDuracion());
			cursoActualizado.setTitulo(curso.getTitulo());
			entityManager.getTransaction().begin();
			entityManager.merge(cursoActualizado);
			entityManager.getTransaction().commit();
			result = "ok";
		} catch (Exception e) {
			e.printStackTrace();
			result = "fail";
		}

		return result;
	}

	@Override
	public String borrarCurso(int cursoId) {
		String result;
		
		try {
			
			entityManager.find(Curso.class, cursoId);
			entityManager.remove(cursoId);
			entityManager.getTransaction().commit();
			result = "ok";
			
		} catch (Exception e) {
			e.printStackTrace();
			result = "fail";
		}
		
		return result;
	}
}
