// ok revisado
// falta testar a implementação no app


// Classe TipoPagtoDesc
// a classe utiliza conceitos de herança, polimorfismo, herdando atributos e modificando
// comportamentos da classe mãe descgenerica

class TipoPagtoDesc extends DescGenerica {
    public TipoPagtoDesc(int idDesc, String descricao) {
        super(idDesc, descricao);
    }

    // Método para criar o tipo de pagamento
    public void tipopagtocriar() {
        System.out.println("Tipo de Pagto criado: ID = " + idDesc + ", Descrição = " + descricao);
    }

         // insert (idcargo, descargo) into tabcargo 


    // Método para modificar a descrição do tipo de pagamento
    public void tipopagtomodificar(int idDesc, String descricao) {
        this.idDesc = idDesc;
        this.descricao = descricao;
        System.out.println("Tipo de Pagto modificado: ID = " + idDesc + ", Nova descrição do Tipo Pagto= " + descricao);
    }




    // Método para apagar os registro de descrição dos tipos de pagamento
    public void tipopagtoapagar(int idDesc, String descricao) {
        this.idDesc = 0;
        this.descricao = "APAGADA";
        System.out.println("IDDESC Apagado: ID = " + idDesc + ", DESCRICAO apagado= " + descricao);
    }
        //  delete idpktipagto from tabtipopagto where idpktipopagto = idcargo



    // Método para exibir o os tipos de pagamento
    public void tipopagtoexibir() {
        System.out.println("chave primaria: ID = " + idDesc + ", Descrição = " + descricao);
    }

}