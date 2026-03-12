package LimaSantos.SuperStock.repository;

import LimaSantos.SuperStock.Caixa.models.CarrinhoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoRepository extends JpaRepository<CarrinhoModels, Long> {

}