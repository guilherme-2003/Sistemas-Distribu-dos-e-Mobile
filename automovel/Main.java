package automovel;

public class Main {
    public static void main(String[] args) throws Exception {
        Automovel a = new Automovel("Gustavo", "Gol", "GGG2G03", 1999);
        
        System.out.println(a.imprimir());
        
        System.out.println(a.alterarProprietario("Guilherme"));
        
        System.out.println(a.imprimir());
        
        Automovel a2 = Mudanca.transferenciaProprietario(a, "Giovana");
        
        if(a2 != null){
            System.out.println(a2.imprimir());
        }else{
            System.out.println("A transferência não foi efetuada");
        }
    }
}