package br.com.impacta.models;
import java.util.ArrayList;

public class Produto {

  public int codigo;
  public String descricao;
  public double valor;

  public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codigoProduto) {

    for(int cont = 0; cont < listaDeProdutos.size(); cont++){

      Produto prod = listaDeProdutos.get(cont);

      if(codigoProduto == prod.codigo){
        return prod;
      }

    }

    return null;

	}

}