public class Pagtos {
    // Atributos da classe
    private int idPagtos;
    private String dataSistema;
    private String dataLancamento;
    private int idFkTipoPagto;
    private double valor;
    private int idFkVendas;

    // Construtor para inicializar um pagamento
    public Pagtos(int idPagtos, String dataSistema, String dataLancamento, int idFkTipoPagto, double valor, int idFkVendas) {
        this.idPagtos =       idPagtos;
        this.dataSistema =    dataSistema;
        this.dataLancamento = dataLancamento;
        this.idFkTipoPagto =  idFkTipoPagto;
        this.valor =          valor;
        this.idFkVendas =     idFkVendas;
    }

    // get e sets
    public int getIdPagtos() {
        return idPagtos;
    }

    public void setIdPagtos(int idPagtos) {
        this.idPagtos = idPagtos;
    }

    public String getDataSistema() {
        return dataSistema;
    }

    public void setDataSistema(String dataSistema) {
        this.dataSistema = dataSistema;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getIdFkTipoPagto() {
        return idFkTipoPagto;
    }

    public void setIdFkTipoPagto(int idFkTipoPagto) {
        this.idFkTipoPagto = idFkTipoPagto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdFkVendas() {
        return idFkVendas;
    }

    public void setIdFkVendas(int idFkVendas) {
        this.idFkVendas = idFkVendas;
    }

    // metodos
    public void exibirpagto() {
        System.out.println("ID Pagamento: " + idPagtos);
        System.out.println("Data Sistema: " + dataSistema);
        System.out.println("Data Lançamento: " + dataLancamento);
        System.out.println("ID Tipo Pagamento: " + idFkTipoPagto);
        System.out.println("Valor: R$ " + valor);
        System.out.println("ID Vendas: " + idFkVendas);
    }

    public void criarpagto(int idPagtos, String dataSistema, String dataLancamento, int idFkTipoPagto, double valor, int idFkVendas) {
        this.idPagtos = idPagtos;
        this.dataSistema = dataSistema;
        this.dataLancamento = dataLancamento;
        this.idFkTipoPagto = idFkTipoPagto;
        this.valor = valor;
        this.idFkVendas = idFkVendas;
        System.out.println("Pagamento criado");
    }

    public void modificarpagto(int novoIdPagtos, String novaDataSistema, String novaDataLancamento, int novoIdFkTipoPagto, double novoValor, int novoIdFkVendas) {
        this.idPagtos = novoIdPagtos;
        this.dataSistema = novaDataSistema;
        this.dataLancamento = novaDataLancamento;
        this.idFkTipoPagto = novoIdFkTipoPagto;
        this.valor = novoValor;
        this.idFkVendas = novoIdFkVendas;
        System.out.println("Pagamento modificado");
    }

    public void apagarpagto() {
        this.idPagtos = 0;
        this.dataSistema = null;
        this.dataLancamento = null;
        this.idFkTipoPagto = 0;
        this.valor = 0.0;
        this.idFkVendas = 0;
        System.out.println("Pagamento apagado");
    }
}