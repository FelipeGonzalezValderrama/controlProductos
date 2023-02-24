package cl.felipeGonzalez.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = true, length = 60)
	private String nombre;
	@Column(nullable = true, length = 60)
	private String marca;
	@Column(nullable = true, length = 60)
	private String fabricado_en;
	@Column(nullable = false)
	private float precio;

	public Producto(Long id, String nombre, String marca, String fabricado_en, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.fabricado_en = fabricado_en;
		this.precio = precio;
	}

	public Producto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricado_en() {
		return fabricado_en;
	}

	public void setFabricado_en(String fabricado_en) {
		this.fabricado_en = fabricado_en;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", fabricado_en=" + fabricado_en
				+ ", precio=" + precio + "]";
	}

}
