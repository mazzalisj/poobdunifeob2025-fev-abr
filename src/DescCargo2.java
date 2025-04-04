// Classe DESCCARGO
// a classe utiliza conceitos de herança, polimorfismo, herdando atributos e modificando
// comportamentos da classe mãe descgenerica
// package pacote;

class DescCargo2 extends DescGenerica {
    // public DescCargo(int idDesc, String descricao) {
    
    // public DescGenerica(int idDesc, String descricao) {
    //    super(int idDesc, String descricao);
    //    this.idDesc = idDesc;
    //    this.descricao = descricao;
    

    // Método para criar um novo cargo
    @Override // sobrescrita
    public void novoRegistro1() {
        super.novoRegistro1(); // herda
        System.out.println("--com o super ele herda os metodos e atributos da classe mae-------");
        System.out.println("--e os especializa com os da classe desccargo2-------");
        System.out.println("direto da classe DescCargo");
        System.out.println("Cargo criado: ID = " + idDesc + ", Descricao = " + descricao);
    }

    // Método para modificar a especilidade já criada
    @Override
    public void modificarRegistro() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe DescCargo");
        System.out.println("Cargo modificado: ID = " + idDesc + ", Nova descricao = " + descricao);
    }

    // Método para apagar a especialidade criada
    @Override
    public void apagarRegistro() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe DescCargo");
        System.out.println("Cargo Apagado: ID = " + idDesc + ", Descricao Apagada = " + descricao);
    }

    // Método para exibir a especialidade
    public void exibirDetalhes() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("direto da classe DescCargo");
        System.out.println("Cargo: ID = " + idDesc + ", Descrição o Cargo e de = " + descricao);
    }

}