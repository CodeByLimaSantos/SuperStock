package LimaSantos.SuperStock.repository;

import LimaSantos.SuperStock.Carrinho.item.models.CarrinhoItemModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoItemRepository extends JpaRepository<CarrinhoItemModels, Long> {}