package cl.nekolearning.boot.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="curso_id")
	private int cursoId;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="duracion")
	private String duracion;
	
	@Column(name="costo")
	private int costo;
	
	public Curso() {	
	}
	
	public Curso (int cursoId, String titulo, String duracion, int costo) {
		this.cursoId = cursoId;
		this.titulo = titulo;
		this.duracion = duracion;
		this.costo = costo;
	}

	public int getCursoId() {
		return cursoId;
	}

	public void setCursoId(int cursoId) {
		this.cursoId = cursoId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
}
