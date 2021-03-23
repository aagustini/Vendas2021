public class Main {

    // tema de casa para 15/03
    //  - completar a classe Venda
    //  - criar duas classes de cadatro: clientes e produtos
    //  - testar.... SEMPRE!!!


    public static void main(String[] args) {
        Cliente c1 = new Cliente(123, "Sr. Smith");
        Cliente c2 = new Cliente(321, "John Doe");

        CadastroClientes cadCli = CadastroClientes.getInstance();
        cadCli.inserir(c1);
        cadCli.inserir(c2);
        cadCli.inserir(127, "Tio Patinhas");

        System.out.println(cadCli);


        //System.out.println(c1.toString() );
        //System.out.println("c2: " + c2.getCodigo() + " "+ c2.getNome() );
        //System.out.println();

        CadastroProdutos cadProd = CadastroProdutos.getInstance();

        Produto pee = new ProdutoEE(100, "Ferro de passar", 100, 180);
        cadProd.inserir(pee);



        //Produto p2 = new Produto(2, "borracha", 1.5);
        //Produto p3 = new Produto(3, "lápis", 1);
        //Produto p4 = new Produto(4, "Chocolate", 10);

        cadProd.inserir(1, "caneta azul", 2);
        cadProd.inserir(2, "borracha", 1.5);

        Produto palc = new ProdAlcoolico(300, "51 uma má ideia", 10);
        cadProd.inserir(palc);

        cadProd.inserir(3, "lápis", 1);
        cadProd.inserir(4, "Chocolate", 10);

        ProdAlcoolico.setTaxaAlcoolico(25);

        System.out.println(cadProd.toString());


        //System.out.println( p1.toString() );
        //System.out.println( p4 );

        //ItemVenda i1 = new ItemVenda(3, p4);
        //ItemVenda i2 = new ItemVenda(2, p1);

        //System.out.println();
        //System.out.println(i1);
        //System.out.println(i2);


        // testar a classe venda...
        //Cliente c1 = cadCli.pesquisar(123);
        //if (c1 = null)
        //   System.out.println("cliente nao existe...");
/*
        Venda v1 = new Venda( cadCli.pesquisar(123) );

        v1.inserir( cadProd.pesquisar(1) );
        v1.inserir(10, cadProd.pesquisar(4) );

        System.out.println( v1.getNotaFiscal() );

        Venda v2 = new Venda( cadCli.pesquisar(321) );

        v2.inserir( cadProd.pesquisar(2) );
        v2.inserir(5, cadProd.pesquisar(3) );

        System.out.println( v2.getNotaFiscal() );

        Venda v3 = new Venda( cadCli.pesquisar(127) );

        v3.inserir( cadProd.pesquisar(4));




        System.out.println( v3.getNotaFiscal() );

        System.out.println("\nPróxima venda será a de número: " + Venda.getProximaVenda());

*/

        String nome1 = "joao";
        String nome2 = "joao";

        String nome3 = nome1;



    }
}
