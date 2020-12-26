package br.com.victor.mudiSecurity.dto;

import br.com.victor.mudiSecurity.model.Pedido;
import br.com.victor.mudiSecurity.model.StatusPedido;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
    private String urlImagem;

    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto(getNomeProduto());
        pedido.setUrlProduto(getUrlProduto());
        pedido.setUrlImagem(getUrlImagem());
        pedido.setDescricao(getDescricao());
        pedido.setStatusPedido(StatusPedido.AGUARDANDO);
        return pedido;
    }
}
