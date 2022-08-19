package automovel;

public class Automovel{
    private String nomeProprietario;
    private String modelo;
    private String placa;
    private int ano;
    
    public Automovel(String nomeProprietario, String modelo, String placa, int ano){
        this.nomeProprietario = nomeProprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }
    
    private void setNomeProprietario(String nomeProprietario){
        this.nomeProprietario = nomeProprietario;
    }
    
    public String getNomeProprietario(){
        return nomeProprietario;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    // Alterar proprietário
    public boolean alterarProprietario(String novoProprietario){
        this.setNomeProprietario(novoProprietario);
        return true;
    }
    
    public String imprimir(){
        return "Nome do proprietário: " + nomeProprietario + "\n" +
               "Modelo do veículo: " + modelo + "\n" +
               "Placa do veículo: " + placa + "\n" +
               "Ano do veículo: " + ano;
    }
}