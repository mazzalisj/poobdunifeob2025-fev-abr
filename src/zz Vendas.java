// consolida o lançamento da venda agregando os totais dos itens pedidos e do
// total dos pagamentos

class Vendas {
    
    // criação dos atributos
    private int idpkvendas;
    private String dataTrabalho;
    private String dataVendas;
    private double valorPagamento;
    private double valorPedidos;
    private int idpkPedido;
    private int idpkPagamento;
    private int idpkusuario;

    
    /// metodo construtor da vendas
    
    public Vendas(int idpkvendas, String dataTrabalho, String dataVendas,
                  double valorPagamento, double valorPedidos,
                  int idpkPedido, int idpkPagamento, int idpkusuario) {
        this.idpkvendas = idpkvendas;
        this.dataTrabalho = dataTrabalho;
        this.dataVendas = dataVendas;
        this.valorPagamento = valorPagamento;
        this.valorPedidos = valorPedidos;
        this.idpkPedido = idpkPedido;
        this.idpkPagamento = idpkPagamento;
        this.idpkusuario = idpkusuario;
    }


    // getters
    public int getIdvendas() { return idpkvendas; }
    public String getDataTrabalho() { return dataTrabalho; }
    public String getDataVendas() { return dataVendas; }
    public double getValorPagamento() { return valorPagamento; }
    public double getValorPedidos() { return valorPedidos; }
    public int getIdpkPedido() { return idpkPedido; }
    public int getIdpkPagamento() { return idpkPagamento; }
    public int getIdpkusuario() { return idpkusuario; }

    // setter
    public void setIdusuario(int idpkusuario) {this.idpkusuario = idpkusuario;}
    public void setDataTrabalho(String dataTrabalho) {this.dataTrabalho = dataTrabalho;}
    public void setDataVendas(String dataVendas) {this.dataVendas = dataVendas;}
    public void setValorPagamento(double valorPagamento) {this.valorPagamento = valorPagamento;}
    public void setValorPedidos(double valorPedidos) {this.valorPedidos = valorPedidos;}
    public void setIdpkPedido(int idpkPedido) {this.idpkPedido = idpkPedido;}
    public void setIdpkPagamento(int idpkPagamento) {this.idpkPagamento = idpkPagamento;}
    public void setIdpkusuario(int idpkusuario) {this.idpkusuario = idpkusuario;}


    @Override
    public String toString() {
        return "ID da Vendas: " + idpkvendas +
                "\nData de trabalho: " + dataTrabalho +
                "\nData da Vendas: " + dataVendas +
                "\nValor total do pagamento: R$ " + valorPagamento +
                "\nValor total dos pedidos: R$ " + valorPedidos +
                "\nID do pedido: " + idpkPedido +
                "\nID do pagamento: " + idpkPagamento +
                "\nID do usuario: " + idpkusuario;

            }
            
}
