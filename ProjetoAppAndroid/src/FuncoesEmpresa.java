import java.util.Scanner;

public class FuncoesEmpresa {
    
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
        Scanner scan = new Scanner(System.in);
        Data data = new Data();

        System.out.println("Digite o Dia: ");
        data.Dia = scan.nextInt();

        System.out.println("Digite o Mes: ");
        data.Mes = scan.nextInt();

        System.out.println("Digite o Ano: ");
        data.Ano = scan.nextInt();

        return data;
    }
}
