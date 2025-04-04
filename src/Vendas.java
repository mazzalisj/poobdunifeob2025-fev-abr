public class Vendas {

    // atributos definidos
    private int idpkvendas;
    private String datasistema;
    private String datavendas;
    private double valortotalpedidos;
    private double valortotalpagamento;
    private int idfkpedido;
    private int idfkpagto;
    private int idfkusuario;

   // metodo construtor
    public Vendas(int idpkvendas, String datasistema, String datavendas, double valortotalpedidos,
                  double valortotalpagamento, int idfkpedido, int idfkpagto, int idfkusuario) {
        this.idpkvendas = idpkvendas;
        this.datasistema = datasistema;
        this.datavendas = datavendas;
        this.valortotalpedidos = valortotalpedidos;
        this.valortotalpagamento = valortotalpagamento;
        this.idfkpedido = idfkpedido;
        this.idfkpagto = idfkpagto;
        this.idfkusuario = idfkusuario;
    }

    // set e gets
    public int getIdpkvendas() {
        return idpkvendas;
    }

    public void setIdpkvendas(int idpkvendas) {
        this.idpkvendas = idpkvendas;
    }

    public String getDatasistema() {
        return datasistema;
    }

    public void setDatasistema(String datasistema) {
        this.datasistema = datasistema;
    }

    public String getDatavendas() {
        return datavendas;
    }

    public void setDatavendas(String datavendas) {
        this.datavendas = datavendas;
    }

    public double getValortotalpedidos() {
        return valortotalpedidos;
    }

    public void setValortotalpedidos(double valortotalpedidos) {
        this.valortotalpedidos = valortotalpedidos;
    }

    public double getValortotalpagamento() {
        return valortotalpagamento;
    }

    public void setValortotalpagamento(double valortotalpagamento) {
        this.valortotalpagamento = valortotalpagamento;
    }

    public int getIdfkpedido() {
        return idfkpedido;
    }

    public void setIdfkpedido(int idfkpedido) {
        this.idfkpedido = idfkpedido;
    }

    public int getIdfkpagto() {
        return idfkpagto;
    }

    public void setIdfkpagto(int idfkpagto) {
        this.idfkpagto = idfkpagto;
    }

    public int getIdfkusuario() {
        return idfkusuario;
    }

    public void setIdfkusuario(int idfkusuario) {
        this.idfkusuario = idfkusuario;
    }

    // metodo para exibir detalhes da venda
    public void exibirDetalhesVenda() {
        System.out.println("ID Venda: " + idpkvendas);
        System.out.println("Data do Sistema: " + datasistema);
        System.out.println("Data da Venda: " + datavendas);
        System.out.println("Valor Total de Pedidos: R$ " + valortotalpedidos);
        System.out.println("ID Pedido: " + idfkpedido);
        System.out.println("Valor Total de Pagamentos: R$ " + valortotalpagamento);
        System.out.println("ID Pagamento: " + idfkpagto);
        System.out.println("ID Usuário: " + idfkusuario);
    }
}