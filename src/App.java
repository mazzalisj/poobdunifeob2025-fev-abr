

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! aprendendo POO em Java");
    

              
        //---------------------------------------------------------------------
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

        System.out.println(".                         ");
        System.out.println(",                         ");
        System.out.println(".                         ");


        Usuario usuario2 = new Usuario();
        usuario2.idusuario = 2;
        usuario2.nome = "maria";
        usuario2.cpf = "333.444.555-77";
        usuario2.cargo = 2;
        usuario2.usuario = "mariamaria";
        usuario2.senha = "4561";
               
        //usando o metodo dentro da class usuário
        usuario2.exibeusuario();

        //-fim do uso e  instanciamento da classe usuário --  até aqui ok
        //----------------------------------------------------------------------------------------


        
        
        //---------------------------------------------------------------------
        // classe cargo usando a classe generica

        System.out.println(".                         ");
        System.out.println(",                         ");
        System.out.println(".                         ");


        DescGenerica cargo3 = new DescGenerica();
        cargo3.idDesc = 154645;
        cargo3.descricao = "oficial";
        cargo3.novoRegistro1();
        cargo3.descricao = "auxiliar";
        cargo3.modificarRegistro();
        cargo3.apagarRegistro();

        // usando a classe generica DescCargo


        System.out.println(".                         ");
        System.out.println(",                         ");
        System.out.println(".                         ");


        DescCargo2 cargo5 = new DescCargo2();
        cargo5.idDesc = 1;
        cargo5.descricao = "oficial maior";
        cargo5.novoRegistro1();
        
        cargo5.descricao = "auxiliar junior";
        cargo5.modificarRegistro();
        
        
        cargo5.apagarRegistro();


        


        //---------------------------------------------------------------------
        // usando a classe generica DescEspecialidade

        System.out.println(".                         ");
        System.out.println(",                         ");
        System.out.println(".                         ");

        DescEspecialidade descespecialidade1 = new DescEspecialidade();
        descespecialidade1.idDesc = 3;
        descespecialidade1.descricao = "Registro de Imoveis";
        descespecialidade1.novoRegistro1();
        descespecialidade1.descricao = "Titulos e Documentos";
        descespecialidade1.modificarRegistro();
        descespecialidade1.apagarRegistro();

        
        //---------------------------------------------------------------------
        // usando a classe generica DesctipoPagto

        System.out.println(".                         ");
        System.out.println(",                         ");
        System.out.println(".                         ");


        DescTipoPagto desctipopagto33 = new DescTipoPagto();
        desctipopagto33.idDesc = 3;
        desctipopagto33.descricao = "Dinheiro";
        desctipopagto33.novoRegistro1();
        desctipopagto33.descricao = "Pix";
        desctipopagto33.modificarRegistro();
        desctipopagto33.apagarRegistro();


        
        //---------------------------------------------------------------------
        //  instanciando um objeto pedido para cadastrar os itens vendidos
        // atributos no private acessando com os metodos get e set

        Pedidos pedido1 = new Pedidos(1, "03/04/2025", "03/04/2025", 1, "272800", 100.00, 1);
        // pedido1.idPedidos = 1;
        // pedido1.dataSistema = "03/04/2025";
        // pedido1.dataLancamento = "03/04/2025";
        // pedido1.idFkEspecialidade = 1;
        // pedido1.protocolo = 272800;
        // pedido1.valor = 100.00;
        
        pedido1.metodoexibirpedidos();
        System.out.println(".                         ");
        System.out.println(",                         ");
        System.out.println(".                         ");

        // modificando os atributos com o set
        System.out.println("alterando atributos com set                   ");
        pedido1.setIdPedidos(3);
        pedido1.setDataSistema("02/01/2025");
        pedido1.setDataLancamento("02/01/2025");
        pedido1.setIdFkEspecialidade(2);
        pedido1.setProtocolo("272900");
        pedido1.setValor(300.00);

        pedido1.metodomodificar2();



        System.out.println(".                         ");
        pedido1.metodoapagar();




//---------------------------------------------------------------------
        //  instanciando um objeto pagamento para cadastrar os itens vendidos
        // atributos no private acessando com os metodos get e set

        Pagtos pagamento1 = new Pagtos(1, "03/04/2025",
                        "03/04/2025", 1, 100.00, 1);
                
        pagamento1.exibirpagto();
        System.out.println(".                         ");
        System.out.println(",                         ");
        System.out.println(".                         ");

        // modificando os atributos com o set
        System.out.println("alterando atributos com set                   ");
        pagamento1.setIdPagtos(9);
        pagamento1.setDataSistema("02/01/2021");
        pagamento1.setDataLancamento("02/01/2021");
        pagamento1.setIdFkTipoPagto(2);
        pagamento1.setValor(900000.00);
        pagamento1.exibirpagto();

        System.out.println(".                         ");
        System.out.println("setando os atributos no metodo e usando o this");
        
        pagamento1.modificarpagto(1, "02/01/2023", "02/01/2023", 800, 333333.33, 2);
        pagamento1.exibirpagto();


        System.out.println(".                         ");
        pedido1.metodoapagar();

        //--------------------------------------------------------------------------
        // instanciando o objeto vendas
        Vendas venda = new Vendas(1, "2025-04-04", "2025-04-03", 1500.50, 1490.50, 1001, 2002, 3003);


        System.out.println(".    -------------------------                     ");
        System.out.println("exibindo detalhes da venda");
        venda.exibirDetalhesVenda();



    }

}




