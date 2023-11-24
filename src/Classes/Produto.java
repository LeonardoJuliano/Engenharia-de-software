/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

public class Produto {
    private String codigo;
    private String nome;
    private  int preco;
    private String litros;

    // Construtor
    public Produto(String codigo, String nome, int preco, String litros) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco= preco;
        this.litros = litros;
    }

    // Getters e setters (opcional)
    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }

    public String getLitros() {
        return litros;
    }
}
