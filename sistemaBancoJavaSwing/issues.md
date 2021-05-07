### 🔨Criação de classes
- [] Cliente</br>
- [] Conta</br>
- [] Conta Corrente</br>
- [] Conta Poupança</br>
✔ Funcionário</br>
- [] Gerente</br>
- [] Diretor</br>
- [] Presidente</br>
✔Sistema Interno (main)</br>
- [] Login</br>
- [] CFP</br>
- [] Senha</br></br>
### 🖋Descrição das Classes
#### 💼Conta 
- [] Deve ser abstrata;</br>
- [] Deve conter atributos CPF e agência do titular para relacionar a conta com o usuário logado e saldo.</br>
#### 💼Conta Corrente e Poupança
- [] Deve herda os atributos e métodos da classe conta;</br>
- [] Devem conter atributo 'tipo' para identificação do tipo de conta.</br>
#### 🧑‍Funcionário
- [] Deve ser abstrata;</br>
- [] Deve conter CPF e senha para login;</br>
- [] Deve ter um atributo cargo.</br>
#### 🧑‍Gerente
- [] Deve conter o atributo de identificação da agência, responsável por gerir.</br></br>
### 🔑Sistema características gerais
- [] Menu interativo;</br>
- [] É esperado que seja populado com os valores referentes aos clientes: contas e funcionários;</br>
- [] O sistema deve guardar os dados em um arquivo de texto.</br></br>
### 🦥Passos de execução do Sistema
- [] Menu inicial: fornecer CPF e Senha para login;</br>
- [] Deve ser capaz de identificar se o usuário é um cliente, gerente, diretor ou presidente;</br></br>
### 📌Casos
#### 🧍Cliente
- [] Movimentação na conta:</br>
- [] Saque;</br>
- [] Depósito;</br>
- [] Transferência.</br>
#### 📃Relatório
- [] Exibir saldo na tela;</br>
- [] Exibir relatório de tributação, que devera apresentar: total de gastos nas operações ate o momento de impressão;</br>
- [] Deve ser informado o valor de taxas por operação: Saque R$ 0,10 - Depósito R$ 0,10 - Transferência R$ 0,20);</br>
- [] Deve ser cobrado apenas do remetente.</br>
#### 📃Relatório de rendimento da poupança
- [] Simular rendimento da poupança em um prazo informado, o cliente deve informar o valor e quantidade de dias.</br>
#### 🧑Gerente
- [] Relatório devera ser igual ao do cliente, com acréscimo das seguintes informações: numero de contas na mesma agência que este gerente trabalha.</br>
#### 👨‍Diretor
- [] Relatório devera ser igual ao do gerente, com acréscimo das seguintes informações: nome, CPF, agência de todos os clientes do sistema em ordem alfabética.</br>
#### 👨‍⚖Presidente
- [] Relatório devera ser igual ao do diretor, com acréscimo das seguintes informações: valor total do capital do banco.</br></br>
### ⚠Obs: Restrições
- [] As operações de saque, depósito e transferência, devem ter registro em um arquivo de texto de saída que armazena as operações realizadas durante a execução;</br>
- [] Todos os relatórios devem ter registro em um arquivo de texto individual;</br>
- [] O sistema deve realizar no mínimo um tratamento de erro personalizado
- [] Sugestão: Tentativa de depósito indevida (valores negativos).</br></br>
### ⚡Desafio 
#### ⚰Seguro de vida
- [] Criar uma classe seguro de vida;</br>
- [] Deve ser contratado pelo cliente que ira informar: o valor a ser assegurado, a contratação custara 20% do valor contratado;</br> 
- [] O valor devera ser incluído no relatório de tributação.</br> </br> 
### 🧪Teste Funcionamento
- [] OK