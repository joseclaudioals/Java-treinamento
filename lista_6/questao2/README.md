### Nível 2: Composição e Relacionamento 1:N

**Cenário: O Sistema de Pedidos de Delivery**

Um aplicativo de comida precisa gerenciar pedidos. Um pedido não existe sozinho; ele pertence a um cliente e contém vários itens.

**Requisitos:**

1. **Classes:** `Cliente`, `Produto` (Nome, Preço), `ItemPedido` (Produto + Quantidade) e `Pedido`.
2. **Associação:** O `Pedido` deve ter uma lista de `ItemPedido`.
3. **Cálculo:** O `Pedido` deve ter um método `calcularTotal()` que varre a lista de itens, multiplica preço pela quantidade e retorna o valor final.
4. **Regra de Negócio:** Se o total do pedido passar de R$ 100,00, o frete é grátis. Caso contrário, adicione uma taxa fixa
5. **Imutabilidade:** Uma vez que o pedido for marcado como "FINALIZADO", não deve ser possível adicionar ou remover itens.

**O que você vai treinar:**

- `ArrayList` e laços (`for-each`).
- Objetos dentro de objetos (Composição).
- Uso de `BigDecimal` para dinheiro (não use `double`!).
- Bloqueio de ações baseado em status.