public class Usuario {
    
    // ok finalizado

    // testar a implementação no app
    
    // criação do objeto usuário (modelo do objeto  / forma do objeto)

    // tipo da variavel string texto, numero > int ex 1000 1 100 ,  float  decimal 00.00 preço,  date bolean 
    // double _> decimal exemplos qtd de casa decimal pi 3.142224616564615651
    
    // atributos - é a criação das caracteristicas do objeto - instancia
        //controle de acesso - public; private; protected;
        //public = acesso de qualquer classe
        //private1 = somente a classe que é dona daquele atributo ou método tem acesso
        //protected = completar
    
    // criação dos atributos da classe usuário
       public int idusuario;  // chave primaria da tabela usuário
       public String nome;  // nome completo do funcionario
       public String cpf;  // documento de identificação do usuário
       public int cargo;   // campo chave estrangeria da tabela cargo
       public String usuario;  // nome do usuário do sistema
       public String senha;  // senha do usuário do sistema

    // metodo construtor
    // this. é usado para indicar o uso os nomes metodos construtor diferenciado dos atributos de classe
    // serve para instanciar as variaveis do metodo construtor

    public void usuarioa(int idusuario, String nome, String cpf, int cargo, String usuario, String senha) {
            this.idusuario = idusuario;
            this.nome = nome;
            this.cpf = cpf;
            this.cargo = cargo;
            this.usuario = usuario;
            this.senha = senha;
    }

        // setters and getters - esses metodos sao usados para encapsular e interagir
    // com os atributos da classe
  
   // 0 atributo idusuario

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public int getIdusuario() {
        return idusuario;
    }

    // 1 proximo atributo nome

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    // 2 proximo atributo cpf

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    // 3 proximo atributo cargo

    public void setCargo (int cargo) {
        this.cargo = cargo;
    }
    public int getCargo() {
        return cargo;
    }

    // 4 proximo atributo usuario

    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    // 5 proximo atributo Senha

    public void setSenha (String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

 /// -----------------------------------------------


 // exibe o nome do funcionario e usuário 
    public void exibeusuario() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("--executando o metodo exibeusuario da classe usuario----------------");
        System.out.println("nome usuario logado: " + nome + " - user name do usuario: " + usuario);
        System.out.println("-------------------------------------------------------------------");
    }

 // metodo muda a senha do usuario

    //private void trocasenhasuario(String Senha) {
      //  if (senha.length() < 8) {
        //    System.out.println("Senha fraca! A senha deve possuir 8 caracteres.");
        // } else {
         //   this.senha = senha;
         //   System.out.println("Senha alterada com sucesso!");
        //}
   // }


// metodo verificação senha do usuário na entrada do sistema

    // public void identificausuario(String campousuario, String camposenha) {
        // set i = 0
        // set usuario = select usernome from tabuser where usernameuser = 'campousuario';
        
        // if campousuario = usuario
            // if camposenha = senha
                  //formularioentrada()
                  // system.out.println("usuario e senha ok - inicia o programa");
            // else
                  // system.out.println("há há há vc não disse a senha!!!");
                  // Dennis Nedry espirito intrusivo
                  // system.out.println("usuário e ou senha errada");
                  // i = i++
                  // for (int i = 0; i <= 3; i++) {
                    // system.out.println("tentativas excedidas tente novamente mais tarde!")}
             // }
        // else
             // system.out.println("usuário não encontrado");
    // }


// metodo botão sair
    public void btnSair() {
        // em vba seria algo como exit.aplication ou aplication.exit;
        // verificar como isso é feito em java ok
        System.out.println("Saindo do sistema, até logo....");
        //System.exit(0);
    }   

}
