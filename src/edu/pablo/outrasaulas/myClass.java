package edu.pablo.outrasaulas;
public class myClass {
    
    // método
    public static void main(String[] args) {


        // System.out.print("Hello, world. Now I'm learning Java. Let's Go!");

        
        // sobre a sintaxe de variáveis:
        // quando uma variável é escrita em letra maiúscula, pressupõe-se que o valor é "final", logo não pode ser alterado. 
            // String BR = "Brasil";
            // BR = "Brazil";
        // quando a variável for "inalterável" e for escrita de forma composta, deve-se seguir o padrão: PALAVRA_PALAVRA. Não se deve utilizar números e simbolos
        // estrutura de declaração de variáveis:
        // Tipo nomeBemDefinido = Atribuição

        // String meuNome = "Pablo";
        // int meuAniversário = 1997;
        // meuAniversário = 2202;
        // System.out.println(meuNome + " "+ meuAniversário);

        String primeiroNome = "Pablo";
        String segundoNome = "Rodrigues";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        // int ano = 2021;
        // ano = 2022;   
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "O resultado é " + primeiroNome + " " + segundoNome;
    }
}
