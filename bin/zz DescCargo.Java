public class DescCargo {
    
    // criação do objeto cargo (modelo do objeto  / forma do objeto)

    // tipo da variavel string texto, numero > int ex 1000 1 100 ,  float  decimal 00.00 preço,  date bolean 
    // double _> decimal exemplos qtd de casa decimal pi 3.142224616564615651
    
    // atributos - é a criação das caracteristicas do objeto - instancia
        //controle de acesso - public; private; protected;
        //public = acesso de qualquer classe
        //private = somente a classe que é dona daquele atributo ou método tem acesso
        //protected = completar
    
    // criação dos atributos da classe usuário
       private String idcargo;
       private String cargodesc;
       
    // metodo construtor de inicialização dos atributos
    public Cargo(String idCargo, String cargoDesc) {
        this.idCargo = idCargo;
        this.cargoDesc = cargoDesc;
    }

    // setters and getters - esses metodos sao usados para encapsular e interagir
    // com os atributos da classe
  
   // 0 atributo cargo
 
    public String getidCargo() {
        return idCargo;
    }
    
    public void setidCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    

    // 1 proximo atributo cargodescricao

    public String getcargoDesc() {
        return cargoDesc;
    }

    public void setcargoDesc(String cargoDesc) {
        this.cargoDesc = cargoDesc;
    }



 /// -----------------------------------------------

    // Método para criar o cargo 
    public void cargocriar() {
        System.out.println("Cargo criado: ID = " + idCargo + ", Descrição = " + cargoDesc);
    }

    // Método para modificar o cargo
    public void cargomodificar(int novoIdCargo, String novacargoDesc) {
        this.idCargo = novoIdCargo;
        this.cargoDesc = novacargoDesc;
        System.out.println("Cargo modificado: ID = " + idCargo + ", Nova descrição = " + cargoDesc);
    }

    // Método para apagar o cargo
    public void cargoapagar() {
        this.idCargo = 0;
        this.cargoDesc = null;
        System.out.println("Cargo apagado.");
    }

    // Método para exibir o cargo
    public void cargoexibir() {
        System.out.println("Cargo: ID = " + idCargo + ", Descrição = " + cargoDesc);
    }

}