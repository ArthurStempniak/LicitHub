
import java.util.Scanner;

public class LicitHub {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
  
        System.out.println("Bem-Vindo ao LicitHub!"+
        "\nGostaria de Visualizar a indroducao do aplicativo?");

        String resposta = scan.nextLine();

        if (resposta.equals("sim")) {
            inicio();
        }
        else{

            System.out.println("Deseja fazer login como usuário ou como admin?"+
            "\n1 - Usuário"+"\n2 - Admin");

            int opcao = scan.nextInt();

            if (opcao == 1) {
                login();
            }
            else if (opcao == 2) {
                System.out.println("Digite a senha do admin:");
                String senha = scan.nextLine();
                if (senha.equals("admin")) {
                    menuadmin();
                }
                else{
                    System.out.println("Senha incorreta!");
                }
            }
            else{
                System.out.println("Opção inválida!");
            }

            login();

        }



    }

    public static void inicio() {

        System.out.println("Bem-Vindo ao LicitHub!"+
        "\nA maneira mais fácil de encontrar e participar de licitações públicas."+
        "\n\nEncontre Oportunidades\nBusque licitações por categoria, região ou valor e nunca perca uma oportunidade."+
        "\n\nAlertas Personalizados\nReceba notificações sobre novas licitações que correspondam aos seus critérios."+
        "\n\nGestão Completa\nAcompanhe prazos, documentos e requisitos de cada licitação em um só lugar.");

    }

    public static void login(){

        System.out.println("Faça o login para acessar o LicitHub"+
        "\n\nDigite seu e-mail:");

        String email = scan.nextLine();

        System.out.println("Digite sua senha:");

        String senha = scan.nextLine();

        System.out.println("Login efetuado com sucesso!");

        menu();

    }

    public static void menu(){
        
        System.out.println("Menu Principal"+
        "\n\n1 - Buscar Licitacoes"+
        "\n2 - Licitacoes Recentes"+
        "\n3 - Minha Conta"+
        "\n4 - Sair");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                buscarLicitacoes();
                break;
            case 2:
                minhasLicitacoes();
                break;
            case 3:
                minhaConta();
                break;
            case 4:
                System.out.println("Saindo do LicitHub...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void menuadmin(){

        System.out.println("Menu Admin"+
        "\n\n1 - Cadastrar Licitacao"+
        "\n2 - Editar Licitacao"+
        "\n3 - Excluir Licitacao"+
        "\n4 - Sair");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                cadastrarLicitacao();
                break;
            case 2:
                editarLicitacao();
                break;
            case 3:
                excluirLicitacao();
                break;
            case 4:
                System.out.println("Saindo do LicitHub...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }

}