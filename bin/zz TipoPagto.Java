public class Tipopagto {
    
    // criação do objeto tipopagto (modelo do objeto  / forma do objeto)

    // tipo da variavel string texto, numero > int ex 1000 1 100 ,  float  decimal 00.00 preço,  date bolean 
    // double _> decimal exemplos qtd de casa decimal pi 3.142224616564615651
    
    // atributos - é a criação das caracteristicas do objeto - instancia
        //controle de acesso - public; private; protected;
        //public = acesso de qualquer classe
        //private = somente a classe que é dona daquele atributo ou método tem acesso
        //protected = completar
    
    // criação dos atributos da classe usuário
       private String idtipopagto;
       private String tipopagtodesc;
       
    // metodo construtor de inicialização dos atributos
    public Tipopagto(String idtipopagto, String tipopagtoDesc) {
        this.idtipopagto = idtipopagto;
        this.tipopagtoDesc = tipopagtoDesc;
    }

    // setters and getters - esses metodos sao usados para encapsular e interagir
    // com os atributos da classe
  
    // 0 atributo tipopagto
 
    public String getidtipopagto() {
        return idtipopagto;
    }
    
    public void setidtipopagto(String idtipopagto) {
        this.idtipopagto = idtipopagto;
    }

    

    // 1 proximo atributo tipopagtodescricao

    public String gettipopagtoDesc() {
        return tipopagtoDesc;
    }

    public void settipopagtoDesc(String tipopagtoDesc) {
        this.tipopagtoDesc = tipopagtoDesc;
    }



 /// -----------------------------------------------

    // Método para criar o tipopagto 
    public void tipopagtocriar() {
        System.out.println("tipopagto criado: ID = " + idtipopagto + ", Descrição = " + tipopagtoDesc);
    }

    // Método para modificar o tipopagto
    public void tipopagtomodificar(int novoIdtipopagto, String novatipopagtoDesc) {
        this.idtipopagto = novoIdtipopagto;
        this.tipopagtoDesc = novatipopagtoDesc;
        System.out.println("tipopagto modificado: ID = " + idtipopagto + ", Nova descrição = " + tipopagtoDesc);
    }

    // Método para apagar o tipopagto
    public void tipopagtoapagar() {
        this.idtipopagto = 0;
        this.tipopagtoDesc = null;
        System.out.println("tipopagto apagado.");
    }

    // Método para exibir o tipopagto
    public void tipopagtoexibir() {
        System.out.println("tipopagto: ID = " + idtipopagto + ", Descrição = " + tipopagtoDesc);
    }

}