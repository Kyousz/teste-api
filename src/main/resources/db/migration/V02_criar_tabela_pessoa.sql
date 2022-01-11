CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	logradouro VARCHAR(30),
	numero VARCHAR(30),
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(30),
	cidade VARCHAR(30),
	estado VARCHAR(30),
	ativo BOOLEAN NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Pedro Sampaio', 'Rua do Pedro', '111', 'Apto 111', 'Sampaio', '11.111-111', 'Maceió', 'AL', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Anitta', 'Rua Anira', '222', 'Apto 222', 'Anira', '22.222-222', 'São Paulo', 'SP', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Bob Marley', 'Rua da Maco', '333', null, 'Conha', '33.333-333', 'Goiânia', 'GO', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Eduardo Barbosa', 'Rua Du Dudu e Edu', '444', 'Apto 444', 'Caramelo', '44.444-444', 'Salvador', 'BA', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Thomas Turbano', 'Rua dos Bobos', '555', null, 'Zero', '55.555-555', 'Natal', 'RN', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Takakara Nakama', 'Rua Fujimo Nakombi', '666', 'Apto 666', 'Japoronga', '66.666-666', 'Porto Alegre', 'RS', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Jorge', 'Rua dos Jorges', '777', null , 'Jorginho', '77.777-777', 'Rio de Janeiro', 'RJ', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('São João', 'Rua da Fogueira', '888', null, 'Folia', '88.888-888', 'Belo Horizonte', 'MG', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Abgobaldo Barão', 'Rua do Nashor', '999', null, 'Aroldo', '99.999-999', 'Uberlândia', 'MG', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Mc Danny Bond', 'Rua Não Confuda', '1010', 'Apto 10', 'Ein', '10.101.010', 'Manaus', 'AM', true);