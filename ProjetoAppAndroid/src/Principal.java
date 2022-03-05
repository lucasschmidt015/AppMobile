import java.util.Scanner;
import java.util.ArrayList;

public class Principal extends FuncoesEmpresa {

    //Lista que vai armazenar os dados de todos clientes cadastrados
    protected ArrayList<Cliente> ClientesCadastrados;


    //Construtor da classe Pricipal que basicamente declara uma nova lista
    public Principal()
    {
        ClientesCadastrados = new ArrayList<Cliente>();
    }

    
    protected void Criar()
    {
        this.initialize();
    }

    public void initialize()
    {
        Scanner scan = new Scanner(System.in);
        int opcao;
        boolean True = true;

        while (True){
            System.out.println("Elementos na lista: " + ClientesCadastrados.size());
            FuncoesEmpresa.showMenu();
            opcao = scan.nextInt();
    
            switch (opcao)
            {
                case 1:
                    FormConsultaCliente cliente = new FormConsultaCliente();
                    cliente.criar();
                    break;
                default:
                    System.out.println("Deu");
                    True = false;
                    break;
            }
        }
    }
}
