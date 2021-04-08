
public class Produto {
	
	String descricao;
	double preco_compra;
	double lucro;
	double desconto;
	double estoque;
	int codigo;
	double v;
	
	public void comprar(double qtd1) {
	
		this.estoque = estoque + qtd1;
	}	
	
	public void vender(double qtd2) {
		if(estoque > qtd2) {
		if (estoque > 0) {
		this.estoque = estoque - qtd2;
		}
		else {
			System.out.println("Estoque insulficiente!");
		}
	  }
	}
	
	public void valorVenda() {
		
		
		v = (this.preco_compra + this.lucro) - this.desconto;
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco_compra() {
		return preco_compra;
	}
	public void setPreco_compra(double preco_compra) {
		this.preco_compra = preco_compra;
	}
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getEstoque() {
		return estoque;
	}
	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}
	
	
	
	
		
	

}
