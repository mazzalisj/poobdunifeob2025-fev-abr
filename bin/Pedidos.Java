

public class Pedidos {
    // Atributos da classe
    private int idPedidos;
    private String dataSistema;
    private String dataLancamento;
    private int idFkEspecialidade;
    private String protocolo;
    private double valor;
    private int idFkVendas;

    // Construtor para inicializar um pedido
    public Pedidos(int idPedidos, String dataSistema, String dataLancamento, int idFkEspecialidade, String protocolo, double valor, int idFkVendas) {
        this.idPedidos = idPedidos;
        this.dataSistema = dataSistema;
        this.dataLancamento = dataLancamento;
        this.idFkEspecialidade = idFkEspecialidade;
        this.protocolo = protocolo;
        this.valor = valor;
        this.idFkVendas = idFkVendas;
    }

    // Métodos get e set
    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
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

    public int getIdFkEspecialidade() {
        return idFkEspecialidade;
    }

    public void setIdFkEspecialidade(int idFkEspecialidade) {
        this.idFkEspecialidade = idFkEspecialidade;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
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

    // Métodos para exibir, criar, modificar e apagar
    public void exibir() {
        System.out.println("ID Pedido: " + idPedidos);
        System.out.println("Data Sistema: " + dataSistema);
        System.out.println("Data Lançamento: " + dataLancamento);
        System.out.println("ID Especialidade: " + idFkEspecialidade);
        System.out.println("Protocolo: " + protocolo);
        System.out.println("Valor: R$ " + valor);
        System.out.println("ID Vendas: " + idFkVendas);
    }

    public void criar(int idPedidos, String dataSistema, String dataLancamento, int idFkEspecialidade, String protocolo, double valor, int idFkVendas) {
        this.idPedidos = idPedidos;
        this.dataSistema = dataSistema;
        this.dataLancamento = dataLancamento;
        this.idFkEspecialidade = idFkEspecialidade;
        this.protocolo = protocolo;
        this.valor = valor;
        this.idFkVendas = idFkVendas;
        System.out.println("Pedido criado com sucesso!");
    }

    public void modificar(int novoIdPedidos, String novaDataSistema, String novaDataLancamento, int novoIdFkEspecialidade, String novoProtocolo, double novoValor, int novoIdFkVendas) {
        this.idPedidos = novoIdPedidos;
        this.dataSistema = novaDataSistema;
        this.dataLancamento = novaDataLancamento;
        this.idFkEspecialidade = novoIdFkEspecialidade;
        this.protocolo = novoProtocolo;
        this.valor = novoValor;
        this.idFkVendas = novoIdFkVendas;
        System.out.println("Pedido modificado com sucesso!");
    }

    public void apagar() {
        this.idPedidos = 0;
        this.dataSistema = null;
        this.dataLancamento = null;
        this.idFkEspecialidade = 0;
        this.protocolo = null;
        this.valor = 0.0;
        this.idFkVendas = 0;
        System.out.println("Pedido apagado com sucesso!");
    }
}
