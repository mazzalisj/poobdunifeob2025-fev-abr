-- para não precisar ficar usando o mouse e rodar a linha de comando com o icone do raio
-- usar a combinação de teclas > ctrl + enter


-- comando para exibir os bandos de dados existentes
-- SHOW DATABASES
show databases;

-- comando para criar um bando de dados
-- CREATE DATABASE
create database caixadb;

-- comando para usar determinado banco de dados
-- USE 
use caixadb;

-- comando para criar as tabelas de dados
-- CREATE TABLE

create table tabCargo (
      idCargo Int Primary Key auto_increment,
      cargoDesc varchar(15)
      );
      
create table tabUser (
	-- idUser int primary key auto,
    idUser int primary key auto_increment,
    userNome varchar(45) Not null,
    userCpf varchar(15) not null unique,
    userNameUser varchar(20) not null unique,
    userSenha varchar(20) not null,
    userFKidCargo Int,
    foreign key (userFkidCargo) references tabCargo(idCargo)
    );

-- Primeiro campo chave primaria é tipo int (inteiro) e autoincrementado
-- campos varchar definido texto com tamanho definido com o limite de caractes esperados na inserção
-- usado a restrição unique para definir que não pode ter outra tupla com o mesmo valor armazenado
-- cpf como unique evita que a mesma pessoa seja cadastrada com vários nomes de usuario
-- username com a restrição Unique não permite que várias pessoas tenham o mesmo nome de usuário
-- campo userFkidcargo é usado com chave estrangeria referenciada com a chave primaria da tabela cargo
    
Create table tabVendas (
	idVendas int primary key auto_increment,
    vendasdataSystem timestamp not null,
    vendasdatatrabalho date not null,
    vendasTotalPedidos Double not null,
    vendasTotalPagto Double not null,
    vendasFkidUser int,
    foreign key (vendasFkidUser) references tabUser(idUser)
    );
    
    
Create table tabEspecialidade (
	idEspec Int primary key auto_increment,
    EspecDesc varchar(20) not null unique
    );
    
Create table tabTipoPagto (
	idtipopagto int primary key,
    tipopagtodesc varchar(14) not null unique
    );
	
 
 Create table tabPedidos (
	idPedidos int primary key auto_increment,
    pedidosdatasistema timestamp not null,
    pedidosdatatrabalho date not null,
    pedidosvalor double not null,
    pedidosfkidEspec int,
    pedidosfkidvendas int,
    foreign key (pedidosfkidespec) references tabEspecialidade(idEspec),
    foreign key (pedidosfkidvendas) references tabVendas(idvendas)
    );

Create table tabPagtos (
	idPagtos int primary key auto_increment,
    pagtosdatasistema timestamp not null,
    pagtosdatatrabalho date not null,
    pagtosvalor double not null,
    pagtosfkidtipopagto int,
    pagtosfkidvendas int,
    foreign key (pagtosfkidtipopagto) references tabtipopagto(idtipopagto),
    foreign key (pagtosfkidvendas) references tabVendas(idvendas)
    );


Create table tabTotaisrelacao (
	idtotais int primary key auto_increment,
    totaisData date not null UNIQUE,
    totaisEspecRI double not null,
    totaisEspecTD double not null,
    totaisEspecPJ double not null
    );
 
 -- os comandos de criação de tabela foram arrumados com o atributo auto_increment nas chaves primarias
 -- para teste é só rodar a execução do comando
 -- é trabalhoso arrumar uma tabela com chave primaria e estrangeria 
 
 
show tables;
 -- comando para mostrar as tabelas do bando de dados
 
show columns from tabcargo;

show columns from tabuser;

-- ok corrigido
show columns from tabvendas;
  
-- ok corrigido
show columns from tabpagtos;
 
-- ok corrigido
 show columns from tabtipopagto;
 
-- ok corrigido
show columns from tabpedidos;
 
-- ok corrigido
 show columns from tabespecialidade;
  
-- ok corrigido
show columns from tabtotaisrelacao;
-- mostra os campos de uma tabela
 

-- ************************************************************************************************
-- trabalhando com insert e select




-- vamos para a inserção de dados para depois testar os comandos select 

-- inserindo um a um

INSERT INTO tabcargo (idcargo, cargodesc)
VALUES (null, 'oficial');

INSERT INTO tabcargo (idcargo, cargodesc)
VALUES (null, 'substituto');

INSERT INTO tabcargo (idcargo, cargodesc)
VALUES (null, 'escrevente');

INSERT INTO tabcargo (idcargo, cargodesc)
VALUES (null, 'auxiliar');

-- seleciona e exibe todos os campos da tabela cargo
select * from tabcargo;

-- para inserir varias tuplas de uma só vez usar o código abaixo
INSERT INTO tabcargo (idcargo, cargodesc)
VALUES
     (null, 'auxiliar 1'),
     (null, 'auxiliar 2'),
     (null, 'auxiliar 3'),
     (null, 'auxiliar 4');

-- verificando as inserções
select * from tabcargo;

-- seleciona todos os campos da tabela tabcargo onde no campo cargodesc inicia com o texto aux
select * from tabcargo where cargodesc like 'aux%';

-- seleciona todos os campos da tabela tabcargo onde no campo cargodesc contenham o
select * from tabcargo where cargodesc like '%liar%';

-- seleciona todos os campos da tabela tabcargo onde no campo cargodesc terminem com aux
select * from tabcargo where cargodesc like '%liar';

-- testando o comando delete
delete from tabcargo where cargodesc = 'auxiliar 2';
-- precisa desabilitar o safe upodade mode
-- verificar depois para desabilitar


insert into tabuser (iduser, usernome, usercpf, Usernameuser, usersenha, userfkidcargo)
   values (null, 'elton', '111.111.111-11', 'elton', '12345678', 1),
   (null, 'kathlyn', '222.222.222-22', 'katlhyn', '87456321', 2),
   (null, 'gabriel', '333.333.333-33', 'gabriel', 'abc123', 3),
   (null, 'joice', '444.444.444-44', 'joice', 'abc123', 3),
   (null, 'eduardo', '555.555.555.55', 'eduardo',  'abc123', 3);

select * from tabuser;

-- Filtra os campos que contém as condições abaixo especificadas por qualquer das condições especificadas
select * from tabuser where userfkidcargo = 2 or userfkidcargo = 3 OR USERFKIDCARGO = 1;

select iduser, usernome from tabuser where userfkidcargo = 2 or userfkidcargo = 3 OR USERFKIDCARGO = 1;

-- filtra todos os substitutos e escreventes
select * from tabuser where userfkidcargo = 2 or userfkidcargo = 3;
select iduser, usernome from tabuser where userfkidcargo = 2 or userfkidcargo = 3;

-- filtra todos os usuários cargo 3 e de nome usuario gabriel
select * from tabuser where userfkidcargo = 3 And usernameuser = 'gabriel';
select iduser, usernome from tabuser where userfkidcargo = 3 And usernameuser = 'gabriel';


-- filtro com busca fonetica
select * from tabuser where soundex(usernameuser) = soundex('eltom');
select * from tabuser where soundex(usernameuser) = soundex('joise');
select * from tabuser where soundex(usernameuser) = soundex('eduardi');
select * from tabuser where soundex(usernameuser) = soundex('gabril');


-- atualização do cargo por nome de usuário
update tabuser set userfkidcargo = 2 where usernameuser = 'elton';
select * from tabuser;
update tabuser set userfkidcargo = 1 where usernameuser = 'elton';
select * from tabuser;

update tabuser set usernome = 'elton' where usernome = 'eltom';

-- REALIZA O UPDATE DE VÁRIOS COLUNAS NO MESMO REGISTRO ONDE O USUÁRO DENOMINA ELTON
update tabuser set userfkidcargo = 1,  USERNOME = 'ELTOM' where usernameuser = 'elton';

insert into tabespecialidade (idespec, especdesc)
   values (null, 'registro de imóveis'),
          (null, 'titulos e documentos'),
          (null, 'pessoa juridica');
   
   -- testando os valores inseridos na tabela
   select * from tabespecialidade;
   -- notou-se que os campos estão em ordem alfabetica pelo campo especdesc
   -- para retornar os campos na ordem que foram inseridos pela chave primaria usar o comando abaixo
   -- seleciona todos os campos da tabela tabespecialidade ordenados pelo campo idespec
   -- utilizando a clausula order by
   select * from tabespecialidade order by idespec;
   
   
   -- insere os valores na tabela tipo de pagamento
   insert into tabtipopagto (idtipopagto, tipopagtodesc)
   values (null, 'dinheiro'),
          (null, 'cheque'),
          (null, 'cartão'),
          (null, 'depósito'),
          (null, 'transf.banc');
   
   -- verifica os valores inseridos
   -- curiosidade o sistema não sei se pelo problema da chave primaria estrangeria criou a partir da
   -- id 11
   select * from tabtipopagto order by idtipopagto;
   
   
     
   -- SELECIONA ITENS nA TABELA VENDA
   -- verifica o conteudo da tabela venda selecionando todos os registros (tuplas)
   SELECT * FROM TABVENDAS;
   
   insert into tabvendas (
             idvendas, vendasdatasystem, vendasdatatrabalho, vendastotalpedidos,
             vendastotalpagto, vendasfkiduser) VALUES
             (null, '2025-03-24', '2025-03-24', 500, 500, 1),
             (null, '2025-03-24', '2025-03-24', 70, 70, 1),
             (null, '2025-03-24', '2025-03-24', 50, 60, 1),
             (null, '2025-03-24', '2025-03-24', 10, 10, 1),
             (null, '2025-03-24', '2025-03-24', 10, 10, 1);
   
 
   
   
   -- SELECIONA TODOS OS ITENS DA TABELA VENDA 
   SELECT * FROM TABVENDAS;

   -- insert into tabvendas (idvendas, vendasdatasystem, vendasdatatrabalho, vendastotalpedidos,
             -- vendastotalpagto, vendasfkiduser) VALUES
             -- (null, '2025-03-24', '2025-03-24', SELECT SUM(PEDIDOSVALOR) AS SOMATOTAL FROM TABPEDIDOS WHERE IDPEDIDOS = 2;

SELECT * FROM TABPEDIDOS;

SELECT SUM(PEDIDOSVALOR) AS SOMATOTAL FROM TABPEDIDOS WHERE IDPEDIDOS = 2;

SELECT SUM(nome_da_coluna) AS soma_total
			FROM nome_da_tabela
			WHERE IDPedido = 1;



   
-- EXEMPLO DE JOINS
SELECT C.ID_CLIENTE, C.NOME, COUNT(CO.IDCOMPRA) AS TOTAL_COMPRAS  -- RETORNA O ID E O NOME DA PESSOA E O TOTAL DE COMPRAS
    FROM CLIENTE C  ---  SELECIONA A TABELA PRINCIPAL
         JOIN COMPRA CO ON C.ID_CLINETE=CO.ID_CLINETE  -- JUNTA COM OUTRA TABELA - RETORNA PRODUTOS QUE FORAM COMPRADOS
         ORDER BY TOTAL_COMPRAS DESC -- ORDENA POR ORDEM DECRESCENTE
         LIMIT 1; -- LIMITA O NUMERO DE ITENS
         
         -- DA PRA OBTER O TOTAL DE PAGAMENTOS DE UMA TABELA E O OTOTAL DOS VALORES DO PEDIDO DE OUTRA E OBTER OS TOTAIS PARA ALIMENTAR A TAB VENDAS
         
SELECT NumOfer, NumCurso, Oferecimento.CPFProf, Professor.CPFProf,
NomeProf, SobrenomeProf
FROM Oferecimento LEFT JOIN Professor
ON Oferecimento.CPFProf = Professor.CPFProf
WHERE NumCurso LIKE ’SI*        
         







--  --------------------------------------------------------------------------------------
-- ignorar essa parte do códido, parte essa usada para corrigir as pk que foram criadas sem o atributo de
-- auto incremento no momento da criação da tabela


 
-- INCLUIDO PARA CORRIGIR A CHAVE PRIMARIA COM AUTO INCREMENTO
alter table TABvendas
 modify idvendas INT auto_increment;
 
 alter table tabespecialidade
 modify idespec INT auto_increment;
 
 
 -- VERIFICANDO SE A CORREÇÃO DEU CERTO
 show columns from TABPEDIDOS; 
 
 
 
 
 --  -------------------------------------------------------------------------------------------------
 -- verificado que na criaçao das tabelas as campos das chaves primarias não foram determinados
 -- como do tipo autoincremento
 
-- ERRO CHAVE PRIMARIA QUE É CHAVE ESTRANGEIRA DE OUTRA TABELA TEM QUE DESFAZER
 -- A REFERENCIA E ALTERAR O CAMPO E REFAZER A REFERENCIA NOVAMENTE (QUE TRABALHO HEHEHE misericordia)
 -- aprendendo pra nunca mais esquecer  definir ao criar uma tabela com pk o auto_increment
 
 -- identifica a chave estrangeira na tabela dependente
 SELECT table_name, column_name
 FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
 WHERE REFERENCED_TABLE_NAME = 'tabpagtos';
 
 -- mostra as restrições relacionadas a chave estrangeira da tabela pagtos
 SELECT CONSTRAINT_NAME
FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE TABLE_NAME = 'tabpagtos';

SELECT CONSTRAINT_NAME
FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE TABLE_NAME = 'tabpedidos';

 
 -- remove o campo como chave estrangeira na tabela dependente
  ALTER TABLE tabPagtos
 DROP FOREIGN KEY tabpagtos_ibfk_1;
 ALTER TABLE tabPagtos
 DROP FOREIGN KEY tabpagtos_ibfk_2;
 
 ALTER TABLE tabpedidos
 DROP FOREIGN KEY tabvendas;
 ALTER TABLE tabpedidos
 DROP FOREIGN KEY tabpedidos_ibfk_2;
 
  
  -- INCLUIDO PARA CORRIGIR A CHAVE PRIMARIA COM AUTO INCREMENTO
alter table tabVendas
 modify idvendas INT auto_increment;
 
  -- INCLUIDO PARA CORRIGIR A CHAVE PRIMARIA COM AUTO INCREMENTO
alter table TABTIPOPAGTO
 modify idTIPOPAGTO INT auto_increment;
 
 -- VERIFICANDO SE A CORREÇÃO DEU CERTO
 show columns from TABPAGTOS;
    
   
    -- INCLUIDO PARA CORRIGIR A CHAVE PRIMARIA COM AUTO INCREMENTO
alter table TABPAGTOS
 modify idPAGTOS INT auto_increment;
 
 -- VERIFICANDO SE A CORREÇÃO DEU CERTO
 show columns from TABPAGTOS;


-- não esquecer de voltar a definir os campos como chave estrangeira

ALTER TABLE tabpedidos
 DROP FOREIGN KEY tabpedidos_ibfk_1;

ALTER TABLE tabpedidos ADD CONSTRAINT tabpedidos_ibfk_1 foreign key (pedidosfkidespec) references tabEspecialidade(idEspec);
ALTER TABLE tabpedidos ADD CONSTRAINT tabpedidos_ibfk_2 foreign key (pedidosfkidvendas) references tabVendas(idvendas);
    
ALTER TABLE tabpagtos ADD CONSTRAINT tabpagtos_ibfk_1 foreign key (pagtosfkidtipopagto) references tabtipopagto(idtipopagto);
ALTER TABLE tabpagtos ADD CONSTRAINT tabpagtos_ibfk_2 foreign key (pagtosfkidvendas) references tabVendas(idvendas);
    
    -- foreign key (pagtosfkidtipopagto) references tabtipopagto(idtipopagto),
    -- foreign key (pagtosfkidvendas) references tabVendas(idvendas)
   
  
    -- foreign key (pedidosfkidespec) references tabEspecialidade(idEspec),
    -- foreign key (pedidosfkidvendas) references tabVendas(idvendas)
 


-- nunca mais esquecer de colocar o tipo autoincrement ao criar a chave primaria
-- nunca mais esquecer de colocar o tipo autoincrement ao criar a chave primaria
-- nunca mais esquecer de colocar o tipo autoincrement ao criar a chave primaria
-- nunca mais esquecer de colocar o tipo autoincrement ao criar a chave primaria
-- nunca mais esquecer de colocar o tipo autoincrement ao criar a chave primaria


-- montando script de correção de chave primaria auto increment oh senhor pq eu fui querer fazer ads

 SELECT table_name, column_name
 FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
 WHERE REFERENCED_TABLE_NAME = 'tabpagtos';
 
 -- mostra as restrições relacionadas a chave estrangeira da tabela pagtos
 SELECT CONSTRAINT_NAME
FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE TABLE_NAME = 'tabcargo';

-- 1 revoga a foreing key da tabela dependente
-- altera o campo para autoincremente da tabela principal
-- volta o campo fk da tabela dependente para fk novamente

-- o problema é quando a tabela da tabela dependente tem campos chaves estrangerias em cascata
-- é nescessario dar um drop em todas as chaves estrangeiras e refazer novamente. 
-- é mais facil dar um update sem where, acabar com tudo pedir as contas e viver de vendar as coisas que a natureza da pra gente




ALTER TABLE tabvendas DROP FOREIGN KEY tabvendas_ibfk_1;
ALTER TABLE tabuser DROP FOREIGN KEY tabuser_ibfk_1;
alter table tabcargo modify idcargo INT auto_increment;
alter table tabuser modify iduser INT auto_increment;
ALTER TABLE tabuser ADD CONSTRAINT tabuser_ibfk_1 foreign key (userfkidcargo) references tabuser(iduser);
ALTER TABLE tabvendas ADD CONSTRAINT tabvendas_ibfk_1 foreign key (vendasfkiduser) references tabuser(iduser);

-- tabelas arrumadas (assim esperamos) oh senhor que trabalheira 
-- encerramento da rotina de correção 
-- ------------------------------------------------------------------------------------------------

         