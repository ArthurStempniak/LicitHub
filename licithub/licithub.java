import java.util.ArrayList;
import java.util.Scanner;
import objetos.licitacoes;
import objetos.prefeitura;
import objetos.usuarios;

public class licithub {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<usuarios> listaUsuarios = new ArrayList<>();
    static ArrayList<prefeitura> listaPrefeituras = new ArrayList<>();
    static ArrayList<licitacoes> listaLicitacoes = new ArrayList<>();
    static usuarios usuarioLogado;

    public static void main(String[] args) {

        System.out.println("Bem-Vindo ao LicitHub!" +
                "\nGostaria de Visualizar a introdução do aplicativo?");

        String resposta = scan.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            
                System.out.println("Bem-Vindo ao LicitHub!" +
                        "\nA maneira mais fácil de encontrar e participar de licitações públicas." +
                        "\n\nEncontre Oportunidades\nBusque licitações por categoria, região ou valor e nunca perca uma oportunidade." +
                        "\n\nAlertas Personalizados\nReceba notificações sobre novas licitações que correspondam aos seus critérios." +
                        "\n\nGestão Completa\nAcompanhe prazos, documentos e requisitos de cada licitação em um só lugar.");
                        
                System.out.println("Gostaria de fazer login agora? (sim/não)");
                String loginAgora = scan.nextLine();
                if (loginAgora.equalsIgnoreCase("sim")) {
                    System.out.println("Deseja fazer login como usuário ou como admin?" +
                            "\n1 - Usuário" + "\n2 - Admin" + "\n3 - Criar Conta");

                    int opcao = scan.nextInt();
                    scan.nextLine(); 

                    if (opcao == 1) {
                        login();
                    } else if (opcao == 2) {
                        loginadmin();
                    } else if (opcao == 3) {
                        System.out.println("Criar conta de usuário...");
                        System.out.println("Digite seu nome:");
                        String nome = scan.nextLine();
                        System.out.println("Digite seu CPF:");
                        String cpf = scan.nextLine();
                        System.out.println("Digite seu endereço:");
                        String endereco = scan.nextLine();
                        System.out.println("Digite seu telefone:");
                        String telefone = scan.nextLine();
                        System.out.println("Digite seu e-mail:");
                        String email = scan.nextLine();
                        System.out.println("Digite sua senha:");
                        String senha = scan.nextLine();

                        usuarios novoUsuario = new usuarios(nome, cpf, endereco, telefone, email, senha, String.valueOf(listaUsuarios.size() + 1));
                        listaUsuarios.add(novoUsuario);

                        System.out.println("Conta criada com sucesso!");
                        login();
                    } else {
                        System.out.println("Opção inválida!");
                    }
                } else {
                    System.out.println("Você pode fazer login mais tarde.");
                }
        } else if (resposta.equalsIgnoreCase("não")) {
            System.out.println("Você pode fazer login diretamente." +
                    "\n\nDeseja fazer login como usuário ou como admin?" +
                    "\n1 - Usuário" + "\n2 - Admin" + "\n3 - Criar Conta");

            int opcao = scan.nextInt();
            scan.nextLine(); 

            if (opcao == 1) {
                login();
            } else if (opcao == 2) {
                loginadmin();
            } else if (opcao == 3) {
                System.out.println("Criar conta de usuário...");
                System.out.println("Digite seu nome:");
                String nome = scan.nextLine();
                System.out.println("Digite seu CPF:");
                String cpf = scan.nextLine();
                System.out.println("Digite seu endereço:");
                String endereco = scan.nextLine();
                System.out.println("Digite seu telefone:");
                String telefone = scan.nextLine();
                System.out.println("Digite seu e-mail:");
                String email = scan.nextLine();
                System.out.println("Digite sua senha:");
                String senha = scan.nextLine();

                usuarios novoUsuario = new usuarios(nome, cpf, endereco, telefone, email, senha, String.valueOf(listaUsuarios.size() + 1));
                listaUsuarios.add(novoUsuario);

                System.out.println("Conta criada com sucesso!");
                login();
            } else {
                System.out.println("Opção inválida!");
            }

        } else {

            System.out.println("Deseja fazer login como usuário ou como admin?" +
                    "\n1 - Usuário" + "\n2 - Admin" + "\n3 - Criar Conta");

            int opcao = scan.nextInt();
            scan.nextLine(); 

            if (opcao == 1) {
                login();
            } else if (opcao == 2) {
                loginadmin();
            } else if (opcao == 3) {
                System.out.println("Criar conta de usuário...");
                System.out.println("Digite seu nome:");
                String nome = scan.nextLine();
                System.out.println("Digite seu CPF:");
                String cpf = scan.nextLine();
                System.out.println("Digite seu endereço:");
                String endereco = scan.nextLine();
                System.out.println("Digite seu telefone:");
                String telefone = scan.nextLine();
                System.out.println("Digite seu e-mail:");
                String email = scan.nextLine();
                System.out.println("Digite sua senha:");
                String senha = scan.nextLine();

                usuarios novoUsuario = new usuarios(nome, cpf, endereco, telefone, email, senha, String.valueOf(listaUsuarios.size() + 1));
                listaUsuarios.add(novoUsuario);

                System.out.println("Conta criada com sucesso!");
                System.out.println("Deseja fazer login agora? (sim/não)");
                String loginAgora = scan.nextLine();
                if (loginAgora.equalsIgnoreCase("sim")) {
                    login();
                } else {
                    System.out.println("Você pode fazer login mais tarde.");

                    System.out.println("Deseja fazer login como usuário ou como admin?" +
                    "\n1 - Usuário" + "\n2 - Admin" + "\n3 - Criar Conta");

            int opcao2 = scan.nextInt();
            scan.nextLine(); 

            if (opcao2 == 1) {
                login();
            } else if (opcao2 == 2) {
                loginadmin();
            }
                    
                }
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

    public static void login() {
        System.out.println("Faça o login para acessar o LicitHub" +
                "\n\nDigite seu e-mail:");
        String email = scan.nextLine();

        System.out.println("Digite sua senha:");
        String senha = scan.nextLine();

        // Verificar se o usuário existe na lista de usuários
        for (usuarios u : listaUsuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                usuarioLogado = u;
                System.out.println("Login efetuado com sucesso!");
                menu();
                return;
            }
        }

        System.out.println("Usuário não encontrado ou senha incorreta!");
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
                "\n4 - Cadastrar Prefeitura" + 
                "\n5 - Ir para o menu Usuario" +
                "\n6 - Sair");

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
                cadastrarPrefeitura();
                break;
            case 5:
                menu();
                break;
            case 6:
                System.out.println("Saindo do LicitHub...");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void buscarLicitacoes() {
        System.out.println("Buscando licitações disponíveis...");
    
        if (listaLicitacoes.isEmpty()) {
            System.out.println("Nenhuma licitação encontrada no momento.");
        } else {
            for (int i = 0; i < listaLicitacoes.size(); i++) {
                System.out.println("[" + i + "] " + listaLicitacoes.get(i));
            }
    
            System.out.println("\nDeseja participar de alguma licitação? (sim/não)");
            String resposta = scan.nextLine();
    
            if (resposta.equalsIgnoreCase("sim")) {
                if (usuarioLogado == null) {
                    System.out.println("Você precisa estar logado como usuário para participar de uma licitação.");
                    login();
                    return;
                }
    
                System.out.println("Digite o número da licitação que deseja participar:");
                int indice = scan.nextInt();
                scan.nextLine();
    
                if (indice >= 0 && indice < listaLicitacoes.size()) {
                    licitacoes licitacaoEscolhida = listaLicitacoes.get(indice);
                    licitacaoEscolhida.adicionarParticipante(usuarioLogado);
                    usuarioLogado.adicionarLicitacao(licitacaoEscolhida);
                    System.out.println("Você foi adicionado à licitação com sucesso!");
                } else {
                    System.out.println("Número de licitação inválido.");
                }
            }
        }
        menu();
    }
    
    

    public static void minhasLicitacoes() {
        if (usuarioLogado == null) {
            System.out.println("Você precisa fazer login primeiro.");
            login();
            return;
        }
    
        ArrayList<licitacoes> minhas = usuarioLogado.getLicitacoesParticipando();
    
        if (minhas.isEmpty()) {
            System.out.println("Você ainda não participou de nenhuma licitação.");
        } else {
            System.out.println("Licitações que você está participando:");
            for (licitacoes l : minhas) {
                System.out.println(l);
                System.out.println("-----------");
            }
        }
    
        menu();
    }
    
    

    public static void minhaConta() {
        if (usuarioLogado == null) {
            System.out.println("Você precisa fazer login primeiro.");
            return;
        }
        System.out.println("Exibindo informações da conta...");
        System.out.println("Nome: " + usuarioLogado.getNome() +
                "\nE-mail: " + usuarioLogado.getEmail() +
                "\nEndereço: " + usuarioLogado.getEndereco());
                menu();
    }

    public static void cadastrarLicitacao() {
        System.out.println("Cadastrar nova licitação...");
        System.out.println("Digite o nome da licitação:");
        String nome = scan.nextLine();
        System.out.println("Digite a descrição da licitação:");
        String descricao = scan.nextLine();
        System.out.println("Digite a data de início da licitação:");
        String dataInicio = scan.nextLine();
        System.out.println("Digite a data de fim da licitação:");
        String dataFim = scan.nextLine();
        System.out.println("Digite a categoria da licitação:");
        String categoria = scan.nextLine();
        System.out.println("Digite o status da licitação:");
        String status = scan.nextLine();

        licitacoes lic = new licitacoes(nome, descricao, dataInicio, dataFim, categoria, status, String.valueOf(listaLicitacoes.size() + 1));
        listaLicitacoes.add(lic);

        System.out.println("Licitação '" + nome + "' cadastrada com sucesso!");
        menuadmin();
    }

    public static void editarLicitacao() {
        System.out.println("Editar licitação...");
        System.out.println("Digite o ID da licitação que deseja editar:");
        String id = scan.nextLine();
        for (licitacoes l : listaLicitacoes) {
            if (l.getId().equals(id)) {
                System.out.println("Digite a nova descrição da licitação:");
                String descricao = scan.nextLine();
                l.setDescricao(descricao);
                System.out.println("Licitação ID " + id + " editada com sucesso!");
                return;
            }
        }
        System.out.println("Licitação não encontrada.");
        menuadmin();
    }

    public static void excluirLicitacao() {
        System.out.println("Excluir licitação...");
        System.out.println("Digite o ID da licitação que deseja excluir:");
        String id = scan.nextLine();
        for (licitacoes l : listaLicitacoes) {
            if (l.getId().equals(id)) {
                listaLicitacoes.remove(l);
                System.out.println("Licitação ID " + id + " excluída com sucesso!");
                return;
            }
        }
        System.out.println("Licitação não encontrada.");
        menuadmin();
    }

    public static void cadastrarPrefeitura() {
        System.out.println("Cadastrar nova prefeitura...");
        System.out.println("Digite o nome da prefeitura:");
        String nome = scan.nextLine();
        System.out.println("Digite o CNPJ da prefeitura:");
        String cnpj = scan.nextLine();
        System.out.println("Digite o endereço da prefeitura:");
        String endereco = scan.nextLine();
        System.out.println("Digite o telefone da prefeitura:");
        String telefone = scan.nextLine();
        System.out.println("Digite o e-mail da prefeitura:");
        String email = scan.nextLine();

        prefeitura p = new prefeitura(nome, cnpj, endereco, telefone, email, String.valueOf(listaPrefeituras.size() + 1));
        listaPrefeituras.add(p);

        System.out.println("Prefeitura '" + nome + "' cadastrada com sucesso!");
        menuadmin();
    }
}
