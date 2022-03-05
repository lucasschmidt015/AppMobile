import java.util.ArrayList;

public class Cliente {

    private int id;
    private String Nome;
    private int Idade;
    private int CPF;
    private Data Nascimento;

    public Cliente(){
        this.Nascimento = new Data();
    }

    public void setId(int ID)
    {
        this.id = ID;
    }

    public void setNome(String Nome)
    {
        this.Nome = Nome;
    }

    public void setIdade(int idade)
    {
        this.Idade = idade;
    }

    public void setCPF(int cpf)
    {
        this.CPF = cpf;
    }

    public void setNascimento(Data nascimento)
    {
        this.Nascimento = nascimento;
    }

    public void setNascimento(int dia, int mes, int ano)
    {
        this.Nascimento.Dia = dia;
        this.Nascimento.Mes = mes;
        this.Nascimento.Ano = ano;
    }

    public int getId()
    {
        return this.id;
    }

    public String getNome()
    {
        return this.Nome;
    }

    public int getIdade()
    {
        return this.Idade;
    }

    public int getCPF()
    {
        return this.CPF;
    }

    public Data getNascimento()
    {
        return this.Nascimento;
    }
}
