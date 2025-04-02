public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! aprendendo POO em Java");
    
        
        //trabalhando com a classe usuário

        Usuario usuario1 = new Usuario();
        usuario1.idusuario = 1;
        usuario1.nome = "jose";
        usuario1.cpf = "111.222.333-44";
        usuario1.cargo = 2;
        usuario1.usuario = "testerusername";
        usuario1.senha = "1234";
               
        //usando o metodo dentro da class usuário
        usuario1.exibeusuario();

        Usuario usuario2 = new Usuario();
        usuario2.idusuario = 2;
        usuario2.nome = "maria";
        usuario2.cpf = "333.444.555-77";
        usuario2.cargo = 2;
        usuario2.usuario = "usuariomaria";
        usuario2.senha = "4561";
               
        //usando o metodo dentro da class usuário
        usuario2.exibeusuario();

        //-fim do uso e  instanciamento da classe usuário --  até aqui ok
        //----------------------------------------------------------------------------------------


        DescGenerica cargo3 = New DescGenerica();
        cargo3.idDesc = 1;
        cargo3.descricao = "oficial";

        cargo3.novoRegistro();



    }


}
