import java.util.ArrayList;
import java.util.Scanner;

public class FuncoesEmpresa {
    public Scanner scan = new Scanner(System.in);

    public static void showMenu()
    {
        String Mensagem = "[1] - Clientes   || [2] - Vendas\n"
        + "[3] - Produtos   || [4] - Sair\n";
        
        System.out.println(Mensagem);                        
    }
    

    protected String formatarNumeroDouble(double numero)
    {
        return String.format("%.2f", numero);
    }

    protected Data informarData()
    {
        Data data = new Data();

        System.out.println("Digite o Dia: ");
        data.Dia = scan.nextInt();

        System.out.println("Digite o Mes: ");
        data.Mes = scan.nextInt();

        System.out.println("Digite o Ano: ");
        data.Ano = scan.nextInt();

        return data;
    }

    protected void imprimirListaCliente(ArrayList<Cliente> clientes)
    {
        for (int i = 0; i < clientes.size(); i++)
        {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("ID: " + clientes.get(i).getId());
            System.out.println("Nome: " + clientes.get(i).getNome());
            System.out.println("Idade: " + clientes.get(i).getIdade());
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }

}
