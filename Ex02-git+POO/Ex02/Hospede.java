package Ex02;

public class Hospede{
    private int id;
    private String nome;
    private int telefone;

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public int getTelefone(){
        return telefone;
    }

    public Hospede(int id, String nome, int telefone){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String exibirHospode(){
        return "Hospede ID: " + id + "Nome: " + nome + "Telefone: " + telefone
    }
}