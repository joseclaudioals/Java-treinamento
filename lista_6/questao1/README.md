### Nível 1: Encapsulamento e Lógica de Estado

**Cenário: O Elevador Inteligente**

Você foi contratado para programar o sistema de controle de um elevador de um prédio comercial de 20 andares (Térreo = 0). O elevador não é apenas uma caixa que sobe e desce; ele tem regras de segurança e capacidade.

**Requisitos:**

1. **Estado:** O elevador deve saber em que andar está, quantas pessoas estão dentro e se a porta está aberta ou fechada.
2. **Segurança:** O elevador **não pode** se mover se a porta estiver aberta.
3. **Capacidade:** O elevador suporta no máximo 8 pessoas ou 600kg. Você deve bloquear a entrada de novas pessoas (ou disparar um alerta) se o limite for excedido.
4. **Logística:** Crie um método `moverPara(int andar)`. Ele deve validar se o andar existe. Se o elevador estiver no 5º e for para o 10º, ele deve imprimir "Passando pelo 6º... 7º..." até chegar.

**O que você vai treinar:**

- Atributos `private`.
- Métodos que alteram o estado do objeto validando regras (Setters inteligentes).
- Lógica condicional (If/Else) dentro de métodos de ação.