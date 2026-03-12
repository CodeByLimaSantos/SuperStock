package LimaSantos.SuperStock.repository;

import LimaSantos.SuperStock.Product.models.ProductModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModels, Long> {}
