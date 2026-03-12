package LimaSantos.SuperStock.controller;

import LimaSantos.SuperStock.Product.models.ProductModels;
import LimaSantos.SuperStock.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductModels criar(@RequestBody ProductModels produto) {
        return productService.salvar(produto);
    }

    @GetMapping
    public List<ProductModels> listar() {
        return productService.listarTodos();
    }
}