package cl.felipeGonzalez.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.felipeGonzalez.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	@Query("SELECT p FROM Producto p WHERE" + " CONCAT(p.id,p.nombre,p.marca,p.fabricado_en,p.precio)" + " LIKE %?1%")
	public List<Producto> findAll(String palabraClave);

}
