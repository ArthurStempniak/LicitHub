import java.util.Scanner;

public class LicitHub {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bem-Vindo ao LicitHub!" +
                "\nGostaria de Visualizar a introdução do aplicativo?");

        String resposta = scan.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            inicio();
        } else {

            System.out.println("Deseja fazer login como usuário ou como admin?" +
                    "\n1 - Usuário" + "\n2 - Admin");

            int opcao = scan.nextInt();
            scan.nextLine(); 

            if (opcao == 1) {
                login();
            } else if (opcao == 2) {
                loginadmin();
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    public static void loginadmin() {

        System.out.println("Digite a senha do admin:");

        String senha = scan.nextLine();

        if (senha.equals("admin")) {
            menuadmin();
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    public static void inicio() {

        System.out.println("Bem-Vindo ao LicitHub!" +
                "\nA maneira mais fácil de encontrar e participar de licitações públicas." +
                "\n\nEncontre Oportunidades\nBusque licitações por categoria, região ou valor e nunca perca uma oportunidade." +
                "\n\nAlertas Personalizados\nReceba notificações sobre novas licitações que correspondam aos seus critérios." +
                "\n\nGestão Completa\nAcompanhe prazos, documentos e requisitos de cada licitação em um só lugar.");
                
    }

    public static void login() {

        System.out.println("Faça o login para acessar o LicitHub" +
                "\n\nDigite seu e-mail:");

        String email = scan.nextLine();

        System.out.println("Digite sua senha:");

        String senha = scan.nextLine();

        System.out.println("Login efetuado com sucesso!");

        menu();
    }

    public static void menu() {

        System.out.println("Menu Principal" +
                "\n\n1 - Buscar Licitações" +
                "\n2 - Licitações Recentes" +
                "\n3 - Minha Conta" +
                "\n4 - Sair");

        int opcao = scan.nextInt();
        scan.nextLine(); 

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

    public static void menuadmin() {

        System.out.println("Menu Admin" +
                "\n\n1 - Cadastrar Licitação" +
                "\n2 - Editar Licitação" +
                "\n3 - Excluir Licitação" + 
                "\n4 - Ir para o menu Usuario" +
                "\n5 - Sair");

        int opcao = scan.nextInt();
        scan.nextLine();

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
                menu();
                break;
            case 5:
                System.out.println("Saindo do LicitHub...");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void buscarLicitacoes() {
        System.out.println("Buscando licitações...");
        
        System.out.println("Nenhuma licitação encontrada no momento.");
        menu();
    }

    public static void minhasLicitacoes() {
        System.out.println("Exibindo licitações recentes...");
        
        System.out.println("Você ainda não participou de nenhuma licitação.");
    }

    public static void minhaConta() {
        System.out.println("Exibindo informações da conta...");
        
        System.out.println("Nome: Usuário Teste\nE-mail: usuario@exemplo.com");
    }

    public static void cadastrarLicitacao() {
        System.out.println("Cadastrar nova licitação...");
        System.out.println("Digite o nome da licitação:");
        String nome = scan.nextLine();
        System.out.println("Digite a descrição da licitação:");
        String descricao = scan.nextLine();
        System.out.println("Licitação '" + nome + "' cadastrada com sucesso!");
        menuadmin();
    }

    public static void editarLicitacao() {
        System.out.println("Editar licitação...");
        System.out.println("Digite o ID da licitação que deseja editar:");
        int id = scan.nextInt();
        scan.nextLine(); 
        System.out.println("Digite a nova descrição da licitação:");
        String descricao = scan.nextLine();
        System.out.println("Licitação ID " + id + " editada com sucesso!");
    }

    public static void excluirLicitacao() {
        System.out.println("Excluir licitação...");
        System.out.println("Digite o ID da licitação que deseja excluir:");
        int id = scan.nextInt();
        scan.nextLine(); 
        System.out.println("Licitação ID " + id + " excluída com sucesso!");
    }
}