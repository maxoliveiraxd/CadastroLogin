import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                        //Variáveis
        boolean bSenha = false;

        String nome;
        String sobrenome;
        String login;
        String senha = null;

        System.out.println("         Cadastro ");

                        //Entradas
        System.out.println("Digite seu nome:");
        nome = in.nextLine();


        System.out.println("Digite seu sobrenome:");
        sobrenome = in.nextLine();


        while (!bSenha) {

            System.out.println("Digite uma senha:");
            senha = in.nextLine();

            if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[!@-])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {
                bSenha = true;

            } else {
                System.out.println("A senha precisa conter números, símbolos (-, ! ou @), letras maiúsculas, minúsculas e ter no mínimo 8 caracteres!");

            }




        }
                         //Saídas
        System.out.println("Cadastro feito com sucesso!");

        login = nome.charAt(0) + "_" + sobrenome;
        System.out.println("    Seu login é:" + login);

                        //Variáveis
        boolean validar = false;

                         //Entradas

        while (!validar) {

            System.out.println("         Acesse sua conta: ");

            System.out.println("Digite seu login:");
            String vLogin = in.nextLine();

            System.out.println("Digite sua senha:");
            String vSenha = in.nextLine();

                                   //Saida
            if (vLogin.equals(login) && vSenha.equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                validar = true;

            } else {
                System.out.println("Login ou senha errados, tente novamente!");

            }

        }
    }
}