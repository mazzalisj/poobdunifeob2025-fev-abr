// Classe TipoPagtoDesc
// a classe utiliza conceitos de herança, polimorfismo, herdando atributos e modificando
// comportamentos da classe mãe descgenerica

class DescEspecialidade extends DescGenerica {
    public DescEspecialidade(int idDesc, String descricao) {
        super(idDesc, descricao);
    }

    // Método para criar uma nova especialidade
    public void especialidadecriar() {
        System.out.println("Especialidade criado: ID = " + idDesc + ", Descrição = " + descricao);
    }

    // Método para modificar a especilidade já criada
    public void especialidademodificar(int idDesc, String descricao) {
        this.idDesc = idDesc;
        this.descricao = descricao;
        System.out.println("Especialidade modificado: ID = " + idDesc + ", Nova descrição = " + descricao);
    }

    // Método para apagar a especialidade criada
    public void especialidadeapagar() {
        this.idDesc = 0;
        this.descricao = null;
        System.out.println("Especialidade apagado: ID = " + idDesc + ", descrição apagado = " + descricao);   
    }

    // Método para exibir a especialidade
    public void especialidadeexibir() {
        System.out.println("Cargo: ID = " + idDesc + ", Descrição = " + descricao);
    }

}