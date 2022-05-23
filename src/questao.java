import java.util.ArrayList;
public class questao {
    
    String pergunta;
    ArrayList<String> alternativas = new ArrayList();
    String alternativaCorreta;
    
    public questao(String pergunta, String q1,String q2, String q3, String q4, String alternativaCorreta){
        this.pergunta = pergunta;
        this.alternativas.add(q1);
        this.alternativas.add(q2);
        this.alternativas.add(q3);
        this.alternativas.add(q4);
        this.alternativaCorreta = alternativaCorreta;
    }
    
    boolean validarReposta(String resposta){
        return resposta.equals(alternativaCorreta);
    }
    
    ArrayList getAlternativas(){
        return alternativas;
    }
    
    String getPergunta(){
        return pergunta;
    }
    
    String getAltCorreta(){
        return alternativaCorreta;
    }
    }

