// Classe DESCCARGO
// a classe utiliza conceitos de herança, polimorfismo, herdando atributos e modificando
// comportamentos da classe mãe descgenerica
// package pacote;

class DescTipoPagto extends DescGenerica {
    //public DescCargo(int idDesc, String descricao) {
    
    //public DescGenerica(int idDesc, String descricao) {
    //    super(int idDesc, String descricao);
    //    this.idDesc = idDesc;
    //    this.descricao = descricao;
    

    // Método para criar um novo cargo
    @Override
    public void novoRegistro1() {
        // super.novoRegistro1();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe Desctipopagto");
        System.out.println("Cargo criado: ID = " + idDesc + ", Descrição = " + descricao);
    }

    // Método para modificar a especilidade já criada
    @Override
    public void modificarRegistro() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe Desctipopagto");
        System.out.println("Cargo modificado: ID = " + idDesc + ", Nova descrição = " + descricao);
    }

    // Método para apagar a especialidade criada
    @Override
    public void apagarRegistro() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe Desctipopagto");
        System.out.println("Cargo Apagado: ID = " + idDesc + ", Descrição Apagada = " + descricao);
    }

    // Método para exibir a especialidade
    public void exibirDetalhes() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe Desctipopagto");
        System.out.println("Cargo: ID = " + idDesc + ", Descrição o o é de = " + descricao);
    }

}