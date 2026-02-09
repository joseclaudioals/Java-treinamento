
import java.util.List; 

public class PlataformaPagamentoTeste {
    public static void main(String[] args) { 
        ProcessadorPagamentos processador = new ProcessadorPagamentos(); 
        System.out.println("=== INÍCIO DO TESTE DA PLATAFORMA DE PAGAMENTOS ==="); 
    
            try { 
    
                // ------------------------------- 
                // 1. Pagamentos válidos 
                // ------------------------------- 
    
                Pagamento cartao1 = new PagamentoCartaoCredito( 
                        "PG001", 
                        200.00, 
                        "1111222233334444", 
                        0.10 
                ); 
    
                Pagamento cartao2 = new PagamentoCartaoCredito( 
                        "PG002", 
                        500.00, 
                        "5555666677778888", 
                        0.15 
                ); 
    
                Pagamento pix1 = new PagamentoPix( 
                        "PG003", 
                        80.00, 
                        "cliente1@email.com" 
                ); 
    
                Pagamento pix2 = new PagamentoPix( 
                        "PG004", 
                        150.00, 
                        "cliente2@email.com" 
                ); 
    
                // Polimorfismo: 
                // todos os objetos são tratados como Pagamento 
                processador.adicionarPagamento(cartao1); 
                processador.adicionarPagamento(cartao2); 
                processador.adicionarPagamento(pix1); 
                processador.adicionarPagamento(pix2); 
    
                // ------------------------------- 
                // 2. Tentativa de pagamento inválido 
                // ------------------------------- 
                try { 
                    Pagamento pagamentoInvalido = new PagamentoPix( 
                            "PG005", 
                            0.50, // abaixo do valor mínimo 
                            "email_invalido" 
                    ); 
                    processador.adicionarPagamento(pagamentoInvalido); 
                } catch (PagamentoInvalidoException e) { 
                    System.out.println("Pagamento inválido capturado: " + e.getMessage()); 
                } 
    
                // ------------------------------- 
                // 3. Processamento dos pagamentos 
                // ------------------------------- 
                processador.processarTodos(); 
    
                // ------------------------------- 
                // 4. Exibição detalhada dos resultados 
                // ------------------------------- 
                System.out.println("\nPagamentos após processamento:"); 
    
                List<Pagamento> pagamentos = processador.getPagamentos(); 
                for (Pagamento p : pagamentos) { 
                    System.out.println( 
                            "ID: " + p.getId() + 
                            " | Valor: " + p.getValor() + 
                            " | Pago: " + p.isPago() 
                    ); 
                } 
    
                // ------------------------------- 
                // 5. Demonstração do uso da constante da interface 
                // ------------------------------- 
                System.out.println( 
                        "\nValor mínimo permitido para processamento: " + 
                        Processavel.VALOR_MINIMO_PROCESSAMENTO 
                ); 
    
                // ------------------------------- 
                // 6. Total pago (valor + taxa) 
                // ------------------------------- 
                double totalPago = processador.calcularTotalPago(); 
                System.out.println("\nTotal efetivamente pago: " + totalPago); 
    
                // ------------------------------- 
                // 7. Tentativa de adicionar pagamento já processado 
                // ------------------------------- 
                try { 
                    processador.adicionarPagamento(cartao1); 
                } catch (PagamentoInvalidoException e) { 
                    System.out.println( 
                            "\nTentativa de adicionar pagamento já pago: " + 
                            e.getMessage() 
                    ); 
                } 
    
            } catch (PagamentoInvalidoException e) { 
                System.out.println("Falha durante o processamento: " + e.getMessage()); 
    
            } finally { 
                System.out.println("\n=== FIM DO TESTE DA PLATAFORMA ==="); 
            } 
    } 
} 

    

