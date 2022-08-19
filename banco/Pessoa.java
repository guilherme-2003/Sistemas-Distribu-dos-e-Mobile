package banco;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String imprimir(){
        return "Nome: " + nome + "\n" +
               "Idade: " + idade;
    }
    
    
    
}