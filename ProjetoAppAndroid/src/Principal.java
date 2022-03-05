import java.util.Scanner;
import java.util.ArrayList;

public class Principal extends FuncoesEmpresa {
    protected ArrayList<Cliente> ClientesCadastrados = new ArrayList();

    public Principal(){
        this.initialize();
    }

    protected void ChamaConstrutor()
    {
        this.initialize();
    }

    public void initialize()
    {
        Scanner scan = new Scanner(System.in);
        int opcao;


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
                break;
        }
    }
}
