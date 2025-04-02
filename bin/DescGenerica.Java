// SUPERCLASSE GENERICA (DESCRIÇÃO)
// CLASSE PARA SERVIR COMO BASE PARA AS CLASSES DE DESCRIÇÃO
// DO CARGO, TIPO DE PAGAMENTO E ESPECIALIDADES DO CARTORIO

public class DescGenerica {
    // criação dos atributos genericos
    
    public int idDesc; // Chave primária
    public String descricao; // Atributo descrição cargos, especialidades, tipos de pagamentos

    // Construtor
    public DescGenerica(int idDesc, String descricao) {
        this.idDesc = idDesc;
        this.descricao = descricao;
    }

    // Métodos get e set
    public int getIdDesc() {
        return idDesc;
    }

    public void setIdDesc(int idDesc) {
        this.idDesc = idDesc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Comportamento do objeto novo registro
    public void novoRegistro(int idDesc, String descricao) {
        this.idDesc = idDesc;
        this.descricao = descricao;
        System.out.println("direto da classe descgenerica");
        System.out.println("Novo registro criado com ID: " + idDesc);
    }

    //  Comportamento do objeto modificar registro
    public void modificarRegistro(String novaDescricao) {
        this.descricao = novaDescricao;
        System.out.println("Registro modificado. Nova descrição: " + novaDescricao);
    }

    //  Comportamento do objeto apagar registro
    public void apagarRegistro() {
        this.idDesc = 0;
        this.descricao = null;
        System.out.println("Registro apagado.");
    }
}