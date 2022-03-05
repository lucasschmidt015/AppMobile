import java.util.Scanner;
import java.util.ArrayList;

public class Principal extends FuncoesEmpresa {
    protected ArrayList<Cliente> ClientesCadastrados = new ArrayList();

    public void initialize()
    {
        Scanner scan = new Scanner(System.in);
        int opcao;


        FuncoesEmpresa.showMenu();
        opcao = scan.nextInt();

        switch (opcao)
        {
            case 1:
                
        }
    }
}
