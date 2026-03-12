package LimaSantos.SuperStock.service;

import LimaSantos.SuperStock.Caixa.models.CarrinhoModels;
import LimaSantos.SuperStock.repository.CarrinhoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarrinhoService {

    private final CarrinhoRepository carrinhoRepository;

    public CarrinhoService(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }

    public CarrinhoModels salvar(CarrinhoModels carrinho) {
        carrinho.calculateTotal(); // atualiza o total antes de salvar
        return carrinhoRepository.save(carrinho);
    }

    public List<CarrinhoModels> listarTodos() {
        return carrinhoRepository.findAll();
    }
}