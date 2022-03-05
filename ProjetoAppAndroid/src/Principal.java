import java.util.Scanner;
import java.util.ArrayList;

public class Principal extends FuncoesEmpresa {

    //Lista que vai armazenar os dados de todos clientes cadastrados
    protected ArrayList<Cliente> ClientesCadastrados;
    protected ArrayList<Cliente> ClientesCadastradosTemp;


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
                    ClientesCadastradosTemp = cliente.criar();
                    if (ClientesCadastradosTemp != null)
                    {
                        for (int i = 0; i < ClientesCadastradosTemp.size(); i++)
                        {
                            this.ClientesCadastrados.add(ClientesCadastrados.get(i));
                        }
                        ClientesCadastradosTemp.clear();
                    }
                    break;
                default:
                    System.out.println("Deu");
                    True = false;
                    break;
            }
        }
    }
}
