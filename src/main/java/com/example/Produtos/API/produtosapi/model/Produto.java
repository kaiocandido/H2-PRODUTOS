package com.example.Produtos.API.produtosapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// POJO - Plain old java object

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @Column(name = "id")
    private String id;

    @Column
    private String name;

    @Column
    private String descricao;

    @Column
    private Double preco;

    public Produto (){

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
