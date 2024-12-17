# Conversor de Moedas 💱

## Descrição do Projeto 📝

Um aplicativo de console simples para conversão de moedas em tempo real, utilizando a API Exchange Rate para obtenção de taxas de câmbio atualizadas. O projeto permite aos usuários converter valores entre diferentes moedas de forma rápida e intuitiva.

## Funcionalidades ✨

- Conversão em tempo real entre 6 moedas diferentes
- Interface de menu intuitiva
- Formatação de moeda de acordo com a localidade
- Tratamento de erros robusto
- Suporte para diferentes códigos de moeda

## Moedas Suportadas 🌍

- Real Brasileiro (BRL)
- Dólar Americano (USD)
- Peso Argentino (ARS)
- Peso Chileno (CLP)
- Iene Japonês (JPY)
- Yuan Chinês (CNY)

## Pré-requisitos 🛠️

- Java 14 ou superior
- Biblioteca Gson
- Conexão com a internet

## Dependências 📦

- Gson (para parsing de JSON)
- Java HTTP Client
- Exchange Rate API

## Instalação 🔧

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/conversor-moedas.git
```

2. Importe as dependências
   - Maven:
   ```xml
   <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.10.1</version>
   </dependency>
   ```
   - Gradle:
   ```groovy
   implementation 'com.google.code.gson:gson:2.10.1'
   ```

3. Compile o projeto

## Como Usar 🚀

1. Selecione a moeda de origem
2. Escolha a moeda de destino
3. Digite o valor a ser convertido
4. Veja o resultado instantaneamente!

## Exemplo de Uso 💡

```
Selecione a moeda de origem: Real Brasileiro (BRL)
Selecione a moeda de destino: Dólar Americano (USD)
Digite o valor: 100
Resultado: R$ 100,00 = $ 20.00
```

## Tratamento de Erros 🛡️

- Validação de entrada de usuário
- Tratamento de exceções de rede
- Mensagens de erro claras e informativas

## Limitações Conhecidas ⚠️

- Requer conexão com a internet
- Dependente da disponibilidade da API de conversão
- Chave de API limitada (considere usar plano pago para uso intensivo)

## Contribuições 🤝

Contribuições são bem-vindas! Por favor, leia as diretrizes de contribuição antes de enviar um pull request.

## Licença 📄

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE.md para detalhes.
