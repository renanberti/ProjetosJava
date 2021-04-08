import java.util.Scanner;
public class Loja {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Produto[] p = new Produto[3];
		int localizar = 0;
		Scanner ler1 = new Scanner(System.in);
		String opcao;
		System.out.println(">>>Menu<<<");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Localizar Produto");
		System.out.println("3 - Comprar Produto");
		System.out.println("4 - Vender Produto");
		System.out.println("x - Sair");
		System.out.println("Digite o número da opção: ");
		opcao = ler1.next();
		System.out.println("***********");
		
		
		while (opcao.toUpperCase() != "X") {
			
			switch (opcao) {
			
			case "1":
				
				for (int i = 0; i < p.length; i++) {
					Scanner ler = new Scanner(System.in);
					System.out.println("***CADASTRAR PRODUTO: Nº"+(i+1)+" ***");
					p[i] = new Produto();
					System.out.println("Insira o código do produto: ");
					p[i].setCodigo(ler.nextInt());
					System.out.println("Insira a descrição: ");
					p[i].setDescricao(ler.next());
					System.out.println("Insira o Preço de compra: ");
					p[i].setPreco_compra(ler.nextDouble());
					System.out.println("Insira o valor do lucro");
					p[i].setLucro(ler.nextDouble());
					System.out.println("Insira o desconto: ");
					p[i].setDesconto(ler.nextDouble());			
					System.out.println("***********");
				}
					
					break;
				
					case "2":
						System.out.println("*******LOCALIZAR PRODUTO:*******");
						Scanner ler = new Scanner(System.in);
						System.out.println("Insira o código: ");
						localizar = ler.nextInt();
						for (int i = 0; i < p.length; i++) {
							if(localizar == p[i].codigo) {
								
								System.out.println(p[i].getDescricao());
								System.out.println("Estoque: " + p[i].getEstoque());
								System.out.println("Desconto: " + p[i].getDesconto());
								
								System.out.println("***********");
								
								
							}
						}
					break;
					
					case "3":
						System.out.println("*******COMPRAR PRODUTO:*******");
						Scanner ler2 = new Scanner(System.in);
						System.out.println("Insira o código: ");
						localizar = ler2.nextInt();
						for (int i = 0; i < p.length; i++) {
							if(localizar == p[i].codigo) {
								
								System.out.println("Insira a Quantidade: ");
								p[i].comprar(ler2.nextInt());
								System.out.println("Descrição: " + p[i].getDescricao());
								System.out.println("Estoque: " + p[i].getEstoque());
								
								System.out.println("***********");
								
							}
						}
					break;
					
					case "4":
						System.out.println("*******VENDER PRODUTO:*******");
						Scanner ler3 = new Scanner(System.in);
						System.out.println("Insira o código: ");
						localizar = ler3.nextInt();
						for (int i = 0; i < p.length; i++) {
							if(localizar == p[i].codigo) {
								double qtd;
								System.out.println("Insira a Quantidade: ");
								qtd = ler3.nextDouble();
								p[i].vender(qtd);
								System.out.println("Descrição: " + p[i].getDescricao());
								System.out.println("Estoque: " + p[i].getEstoque());
								System.out.println("---TOTAL---");
								double total;
								
								p[i].valorVenda();
							
								total = (p[i].v * qtd);
								
								System.out.println("Valor da Venda: " + total);
								
								System.out.println("***********");
								
							
								
							
								
							}
						}
						break;
						default:
							System.exit(0);
					
						
						
			}
			
			System.out.println(">>>Menu<<<");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Localizar Produto");
			System.out.println("3 - Comprar Produto");
			System.out.println("4 - Vender Produto");
			System.out.println("x - Sair");
			System.out.println("Digite o número da opção: ");
			opcao = ler1.next();
			System.out.println("***********");
		}		
		
	}	
		
}

