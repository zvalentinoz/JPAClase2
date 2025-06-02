package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_categorias")
@Getter
@Setter
public class Categoria {
	@Id
	@Column(name = "idcategoria")
	private int idCategoria;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Override
	public String toString() {
		return descripcion;
	}
}
