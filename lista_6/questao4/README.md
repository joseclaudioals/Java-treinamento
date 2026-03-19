### Nível 4: Padrão Strategy e o Fim do "If-Else" Gigante

**O Problema (O Código "Júnior"):**
Imagine que você está criando o sistema de `Checkout` de um E-commerce. Um programador iniciante faria um método `finalizarCompra` recebendo uma `String tipoPagamento` e criaria um `if-else` ou `switch-case` gigantesco. Toda vez que a loja criasse um novo meio de pagamento (ex: Criptomoeda, Apple Pay), ele teria que abrir a classe `Checkout` e adicionar mais um `if`. Isso quebra o princípio **OCP (Open-Closed Principle)** do SOLID: *uma classe deve estar fechada para modificação, mas aberta para extensão.*

**O Seu Desafio (A Solução "Sênior"):**
Você vai criar uma arquitetura onde a classe `Checkout` é **completamente cega**. Ela não faz a menor ideia de como o pagamento é processado. Ela apenas exige que "alguém" cumpra um contrato e devolva se deu certo ou errado.

### Passo 1: O Contrato (A Interface)

Crie uma interface chamada `MetodoPagamento`.

- **O que ela representa:** O contrato obrigatório que qualquer forma de pagamento do presente ou do futuro deverá assinar para ser aceita na nossa loja.
- **O Método:** Crie um método `boolean processarPagamento(double valor)`.

### Passo 2: As Estratégias (Implementações Isoladas)

Agora, você vai criar as regras de negócio totalmente isoladas umas das outras. Cada classe implementa a interface `MetodoPagamento`.

1. **Classe `PagamentoPix`**:
    - **A Regra:** Pagamentos via Pix dão 10% de desconto.
    - **O Comportamento:** No método `processarPagamento`, calcule o valor com desconto, imprima no console *"Pagamento via Pix processado com sucesso. Valor final: R$ X"*, e retorne `true`.
2. **Classe `PagamentoCartaoCredito`**:
    - **O Estado:** Esta classe precisa de informações exclusivas. Crie atributos privados para `nomeTitular`, `numeroCartao` e `quantidadeParcelas`, e peça-os no Construtor.
    - **A Regra (Juros):** Até 3x, sem juros. Em 4x ou mais, acrescente 5% de juros no valor total.
    - **A Regra (Aprovação):** Use a classe `java.util.Random` para gerar um número. Se for par, o pagamento é aprovado (imprima o sucesso com o valor das parcelas e retorne `true`). Se for ímpar, imprima *"Pagamento recusado pela operadora"* e retorne `false`.
3. **Classe `PagamentoBoleto`**:
    - **A Regra:** Boletos não são aprovados na hora.
    - **O Comportamento:** Imprima *"Boleto gerado com sucesso! Vencimento em 3 dias. Código: [Gere uma string aleatória]"*. Retorne `true` (afinal, a *geração* do boleto deu certo, mesmo que o dinheiro não tenha entrado ainda).

### Passo 3: O Desacoplamento (A Injeção de Dependência)

Crie a classe `Checkout`. É aqui que a mágica da Orientação a Objetos acontece.

- Crie um método chamado `finalizarCompra(double valorCompra, MetodoPagamento metodo)`.
- **Atenção:** Repare que o parâmetro espera a **Interface**, e não uma classe específica.
- **A Lógica Interna:** O Checkout não tem nenhum `if` verificando qual é o método. Ele apenas confia no contrato:

```java
System.out.println("Iniciando o checkout...");
boolean sucesso = metodo.processarPagamento(valorCompra);
if (sucesso) {
    System.out.println("Compra finalizada e pedido liberado!");
} else {
    System.out.println("Falha na compra. Tente novamente.");
}
```

### Passo 4: O Teste Real (A Classe Main)

Na sua classe principal, você fará o papel do cliente clicando nos botões do site.

1. Instancie um `Checkout`.
2. Instancie as formas de pagamento (`new PagamentoPix()`, `new PagamentoCartaoCredito(...)`).
3. Passe diferentes formas de pagamento para o *mesmo* método `finalizarCompra` do checkout e veja como o sistema reage de forma dinâmica, adaptando o comportamento sem quebrar a loja.