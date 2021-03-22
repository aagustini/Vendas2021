                    // é um tipo de...
public class ProdutoEE    extends      Produto {

    private int diasValidade;

    public ProdutoEE(int umCodigo, String umNome, double umPreco, int dias) {
        //codigo = umCodigo;
        //nome = umNome;
        //preco = umPreco;
        super(umCodigo, umNome, umPreco);

        this.diasValidade = dias;
    }

    public int getDiasValidade() {
        return diasValidade;
    }

    @Override
    public String toString() {
        return "ProdutoEE{" +
               super.toString() +
                ", dias validade='" + getDiasValidade() + '\'' +
                '}';
    }
}

