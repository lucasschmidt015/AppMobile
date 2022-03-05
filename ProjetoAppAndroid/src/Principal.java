import java.util.Scanner;
import java.util.ArrayList;

public class Principal extends FuncoesEmpresa {
    protected ArrayList<Cliente> ClientesCadastrados;

    public Principal()
    {
        ClientesCadastrados = new ArrayList();
    }

    protected void ChamaConstrutor()
    {
        this.initialize();
    }

    public void initialize()
    {
        Scanner scan = new Scanner(System.in);
        int opcao;
        boolean True = true;

        while (True){
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
