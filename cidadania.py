class Pessoa(object):
    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade


class Cidadao(Pessoa):
    def __init__(self, nome, sexo, idade, cpf):
        super().__init__(nome, idade, sexo)
        self.cpf = cpf

#instanciando Pessoa
nomePessoa1 = input('Entre com o nome da Pessoa: ')        
sexoPessoa1 = input('Entre com o sexo da Pessoa: ') 
idadePessoa1 = input('Entre com a idade da Pessoa: ')

Pessoa1 = Pessoa(nomePessoa1, sexoPessoa1, idadePessoa1)


#instanciando Cidadao
nomeCidadao1 = input('Entre com o nome do Cidadão: ')        
sexoCidadao1 = input('Entre com o sexo do Cidadão: ') 
idadeCidadao1 = input('Entre com a idade do Cidadão: ')
cpfCidadao1 = input('Entre com o cpf do Cidadão: ')

Cidadao1 = Cidadao(nomeCidadao1, sexoCidadao1, idadeCidadao1, cpfCidadao1)

#exibindo resultados
print('Características Pessoa1: ')
print(f'Nome: {Pessoa1.nome}')
print(f'Sexo: {Pessoa1.sexo}')
print(f'Idade: {Pessoa1.idade}')

print('Características Cidadao1: ')
print(f'Nome: {Cidadao1.nome}')
print(f'Sexo: {Cidadao1.sexo}')
print(f'Idade: {Cidadao1.idade}')
print(f'Cpf: {Cidadao1.cpf}')