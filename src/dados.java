import java.util.ArrayList;
public class dados {
    
    static int dicaUniversitarios;
    static int palpiteCerteiro;
    static int Pular;
    static int meioAMeio;
    
    static ArrayList<questao> questoes = new ArrayList();
    static int numQuestoes = 10;
    
    static String [] premio = new String[4]; 
    
    static String [][] pontuacao = new String[10][2];
    static int contadorPontuacao;
    
    public dados(){
        
        palpiteCerteiro=1;
        dicaUniversitarios = 1;
        Pular = 1;
        meioAMeio=1;
        
        contadorPontuacao = 0;
        
        pontuacao[0][0]="1.000.000";
        pontuacao[1][0]="5.000.000";
        pontuacao[2][0]="10.000.000";
        pontuacao[3][0]="20.000.000";
        pontuacao[4][0]="45.000.000";
        pontuacao[5][0]="87.500.000";
        pontuacao[6][0]="175.000.000";
        pontuacao[7][0]="250.000.000";
        pontuacao[8][0]="500.000.000";
        pontuacao[9][0]="1.000.000.000";
        
        pontuacao[0][1]="1.000.000";
        pontuacao[1][1]="1.000.000";
        pontuacao[2][1]="1.000.000";
        pontuacao[3][1]="20.000.000";
        pontuacao[4][1]="20.000.000";
        pontuacao[5][1]="20.000.000";
        pontuacao[6][1]="175.000.000";
        pontuacao[7][1]="175.000.000";
        pontuacao[8][1]="175.000.000";
        pontuacao[9][1]="1.000.000";
        
        
        //questao(String pergunta, String q1,String q2, String q3, String q4, String alternativaCorreta)
        
        questoes.add(new questao("Qual a capital do Canadá?1", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        questoes.add(new questao("Qual a capital do Canadá?2", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        questoes.add(new questao("Qual a capital do Canadá?3", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        questoes.add(new questao("Qual a capital do Canadá?4", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        questoes.add(new questao("Qual a capital do Canadá?5", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        questoes.add(new questao("Qual a capital do Canadá?6", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        questoes.add(new questao("Qual a capital do Canadá?7", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        questoes.add(new questao("Qual a capital do Canadá?8", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        questoes.add(new questao("Qual a capital do Canadá?9", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        questoes.add(new questao("Qual a capital do Canadá?10", "Vancouver", "Ottawa", "Toronto", "Montreal", "Ottawa"));
        
}
    
}
