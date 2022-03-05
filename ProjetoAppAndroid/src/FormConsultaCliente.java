import java.util.ArrayList;
import java.util.Scanner;

public class FormConsultaCliente extends Principal {

    public void showMenuCliente()
    {
        String Mensagem = "[1] - Novo   || [2] - Listar\n"
                        + "[3] - Excluir   || [4] - Voltar\n";

        System.out.println(Mensagem);        
    }

    public void cadastrarCliente()
    {
        try{
            Cliente C = new Cliente();
            Scanner scan = new Scanner(System.in);
            int Dia, Mes, Ano;

            System.out.println("Digite o id do cliente");
            C.setId(scan.nextInt());
    
            System.out.println("Digite o nome do cliente: ");
            C.setNome(scan.nextLine());
    
            System.out.println("Digite a idade do cliente: ");
            C.setIdade(scan.nextInt());        
    
            System.out.println("Digite o CPF do cliente: ");
            C.setCPF(scan.nextInt());
    
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-Vamos Agora Informar a Data De Nascimento do Cliente=-=-=-=-=-=-=-=-=-=-=-=-=");
            C.setNascimento(informarData());
    
            ClientesCadastrados.add(C);
        }
        catch (Exception e)
        {
            System.out.println("Erro ao cadastrar");
        }
    }


    public void imprimirClientes()
    {
        if (ClientesCadastrados.size() != 0)
        {
            imprimirListaCliente(ClientesCadastrados);
        }
    }
}
