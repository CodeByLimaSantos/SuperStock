package LimaSantos.SuperStock.controller;

import LimaSantos.SuperStock.Caixa.models.CarrinhoModels;
import LimaSantos.SuperStock.service.CarrinhoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    private final CarrinhoService carrinhoService;

    public CarrinhoController(CarrinhoService carrinhoService) {
        this.carrinhoService = carrinhoService;
    }

    @PostMapping
    public CarrinhoModels criar(@RequestBody CarrinhoModels carrinho) {
        return carrinhoService.salvar(carrinho);
    }

    @GetMapping
    public List<CarrinhoModels> listar() {
        return carrinhoService.listarTodos();
    }
}