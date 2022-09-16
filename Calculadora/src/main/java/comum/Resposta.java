package comum;

public class Resposta {
    private float resultado;
    private int status;
    
    public Resposta(){
        
    }
    
    public Resposta(float resultado, int status){
        this.resultado = resultado;
        this.status = status;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
