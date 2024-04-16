import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private static List<Cliente> clientes = new ArrayList<>();
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public static String cadastrarCliente(String nome, String cpf, String endereco) {
        Cliente novoCliente = new Cliente(nome, cpf, endereco);
        clientes.add(novoCliente);
        return nome + "cadastrado com sucesso";
    }
}
