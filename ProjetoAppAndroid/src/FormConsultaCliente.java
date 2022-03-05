import java.util.Scanner;
import java.util.ArrayList;

public class FormConsultaCliente extends FuncoesEmpresa {

    public Scanner scan = new Scanner(System.in);
    protected ArrayList<Cliente> ClientesCadastrados = new ArrayList<Cliente>();

    public ArrayList<Cliente> criar(){
        int opcao;
        boolean True = true;
        while (True){
            showMenuCliente();
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    this.cadastrarCliente();
                    break;
                case 2:
                    this.imprimirClientes();
                    break;
                default: 
                    True = false;
                    break;
            }
        }
        if (ClientesCadastrados.size() == 0)
        {
            return null;
        }
        else
        {
            return this.ClientesCadastrados;
        }
    }


    public void showMenuCliente()
    {
        String Mensagem = "[1] - Novo   || [2] - Listar\n"
                        + "[3] - Excluir   || [4] - Voltar\n";

        System.out.println(Mensagem);        
    }

    public void cadastrarCliente()
    {
        
        Cliente C = new Cliente();

        System.out.println("Digite o id do cliente");
        C.setId(scan.nextInt());

        System.out.println("Digite o nome do cliente: ");
        String nome = scan.nextLine();
        C.setNome(nome);

        System.out.println("Digite a idade do cliente: ");
        C.setIdade(scan.nextInt());        

        System.out.println("Digite o CPF do cliente: ");
        C.setCPF(scan.nextInt());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-Vamos Agora Informar a Data De Nascimento do Cliente=-=-=-=-=-=-=-=-=-=-=-=-=");
        C.setNascimento(informarData());

        this.ClientesCadastrados.add(C);
        
    }


    public void imprimirClientes()
    {
        if (this.ClientesCadastrados.size() != 0)
        {
            imprimirListaCliente(this.ClientesCadastrados);
        }
        else{
            System.out.println("Não existem clientes cadastrados.");
        }
    }
}
