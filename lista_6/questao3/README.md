-

---

### Nível 3: Herança e Polimorfismo

**Cenário: Plataforma de Streaming (Netflix Clone)**

Você vai criar a estrutura de mídia de um serviço de streaming. O catálogo possui Filmes e Séries, mas eles se comportam de forma levemente diferente.

**Requisitos:**

1. **Classe Mãe:** Crie uma classe abstrata `Conteudo` (titulo, ano, genero, assistido).
2. **Classes Filhas:**
    - `Filme`: Possui `duracaoEmMinutos`.
    - `Serie`: Possui `temporadas` e `episodiosPorTemporada`.
3. **Contrato:** Todo conteúdo deve ter um método `calcularTempoTotal()`.
    - No filme, retorna a duração.
    - Na série, multiplica temporadas * episódios * duração média (fixa de 45min, por exemplo).
4. **A Lista de Favoritos:** Crie uma classe `Usuario` que tem uma `List<Conteudo>`. O usuário pode adicionar tanto filmes quanto séries nessa mesma lista (Polimorfismo).
5. **Requisito de Saída:** Ao listar os favoritos, o sistema deve mostrar o título e o tempo total de cada um, sem saber se é filme ou série (usando o método abstrato).

**O que você vai treinar:**

- Classes Abstratas (`abstract`).
- Sobrescrita de métodos (`@Override`).
- Listas genéricas que aceitam múltiplos tipos de filhos.