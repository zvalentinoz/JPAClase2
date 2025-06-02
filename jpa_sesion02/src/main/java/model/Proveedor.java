package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_proveedor")
@Getter @Setter
public class Proveedor {
	
	@Id
	@Column(name = "idproveedor")
	private int idProveedor;
	
	@Column(name = "nombre_rs")
	private String razonSocial;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "email")
	private String email;
	
	@Override
	public String toString() {
		return razonSocial;
	}
	
}
