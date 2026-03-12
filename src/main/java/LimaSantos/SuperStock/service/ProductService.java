package LimaSantos.SuperStock.service;

import LimaSantos.SuperStock.Product.models.ProductModels;
import LimaSantos.SuperStock.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductModels salvar(ProductModels produto) {
        return productRepository.save(produto);
    }

    public List<ProductModels> listarTodos() {
        return productRepository.findAll();
    }
}
