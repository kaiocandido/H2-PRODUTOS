package com.example.Produtos.API.produtosapi.repository;

import com.example.Produtos.API.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
