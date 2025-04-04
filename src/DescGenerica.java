// SUPERCLASSE GENERICA (DESCRIÇÃO)
// CLASSE PARA SERVIR COMO BASE PARA AS CLASSES DE DESCRIÇÃO
// DO CARGO, TIPO DE PAGAMENTO E ESPECIALIDADES DO CARTORIO

public class DescGenerica {
    // criação dos atributos genericos
    
    public int idDesc; // Chave primária
    public String descricao; // Atributo descrição cargos, especialidades, tipos de pagamentos

    // Construtor
    public void descgenerica(int idDesc, String descricao) {
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
    // public void novoRegistro1(int idDesc, String descricao) {
        public void novoRegistro1() {
        // this.idDesc = idDesc;
        // this.descricao = descricao;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe descgenerica (mae)");
        System.out.println("Novo registro criado com ID: " + idDesc + "descricao: " + descricao);
    }

    //  Comportamento do objeto modificar registro
    public void modificarRegistro() {
        // this.descricao = novaDescricao;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe descgenerica (mae)");
        System.out.println("Registro modificado. Nova descricao: " + descricao);
    }

    //  Comportamento do objeto apagar registro
    public void apagarRegistro() {
        //this.idDesc = 0;
        //this.descricao = null;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe descgenerica (mae)");
        System.out.println("Registro apagado.");
    }
}