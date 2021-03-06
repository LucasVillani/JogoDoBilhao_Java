import java.util.Random;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class telaPergunta extends javax.swing.JFrame {

    static dados Dados;
    static questao questaoAtual;
    static int altEx1;
    static int altEx2;      

    
    void desabilitar(){
    
    a1.setEnabled(false);
    a2.setEnabled(false);
    a3.setEnabled(false);
    a4.setEnabled(false);
    }
    
    void validarResposta(JButton s, questao q){
        if(s.getText().equals(q.getAltCorreta())){
           
            Dados.contadorPontuacao++;
            s.setForeground(Color.GREEN);
            
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    if(Dados.contadorPontuacao!=10){
                        telaPlacar tPlacar = new telaPlacar(Dados);
                        tPlacar.setVisible(true);
                        dispose();
                    }else{
                        telaBilhao tBilhao = new telaBilhao();
                        tBilhao.setVisible(true);
                        dispose();
                    }
    }
        };
        Timer timer = new Timer(2000 ,taskPerformer);
        timer.setRepeats(false);
        timer.start();
            
            
        }else{
            s.setForeground(Color.RED);
            
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    JOptionPane.showMessageDialog(null,"Alternativa ERRADA!!!\n\nVocê ganhou R$"+Dados.pontuacao[Dados.contadorPontuacao][1]);
                    Inicio inicio = new Inicio();
                    inicio.setVisible(true);
                    dispose();
    }
        };
        Timer timer = new Timer(2000 ,taskPerformer);
        timer.setRepeats(false);
        timer.start();
       
            
    }}
    
    public telaPergunta(dados Dados) {
        
        altEx1=-1;
        altEx2=-1;
        
        this.Dados = Dados;
        initComponents();
        
        if(Dados.dicaUniversitarios == 0){
        universitarios.setEnabled(false);
        }
        
        if(Dados.palpiteCerteiro == 0){
        palpite.setEnabled(false);
        }
        
        if(Dados.Pular == 0){
        pular.setEnabled(false);
        }
        
        if(Dados.meioAMeio == 0){
        meio.setEnabled(false);
        }
        
        placar.setText("Pergunta valendo R$ "+Dados.pontuacao[Dados.contadorPontuacao][0]);
        Random random = new Random();
        int numPerguntas = Dados.questoes.size();
        int numPergunta = random.nextInt(numPerguntas);
        questaoAtual = Dados.questoes.get(numPergunta);
        Dados.questoes.remove(numPergunta);
        pergunta.setText(questaoAtual.getPergunta());
        
        
        ArrayList<String> alts = questaoAtual.getAlternativas();
        
        Random ordemAlt = new Random();
        int qDisponiveis = 4;
        int i;
        i = ordemAlt.nextInt(qDisponiveis);
        
        
        a1.setText(alts.get(i));
        alts.remove(i);
        qDisponiveis--;
        i = ordemAlt.nextInt(qDisponiveis);
        
        a2.setText(alts.get(i));
        alts.remove(i);
        qDisponiveis--;
        i = ordemAlt.nextInt(qDisponiveis);
        
        a3.setText(alts.get(i));
        alts.remove(i);
        qDisponiveis--;
        i = ordemAlt.nextInt(qDisponiveis);
        
        a4.setText(alts.get(i));
            
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        placar = new javax.swing.JLabel();
        pergunta = new javax.swing.JLabel();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        universitarios = new javax.swing.JButton();
        palpite = new javax.swing.JButton();
        pular = new javax.swing.JButton();
        meio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        placar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        placar.setForeground(new java.awt.Color(255, 255, 0));
        placar.setText("Pergunta de R$ ");

        pergunta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pergunta.setForeground(new java.awt.Color(255, 204, 0));
        pergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pergunta.setText("jLabel2");

        a1.setText("jButton1");
        a1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        a1.setBorderPainted(false);
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setText("jButton2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setText("jButton3");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a4.setText("jButton4");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        universitarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        universitarios.setText("Universitários");
        universitarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universitariosActionPerformed(evt);
            }
        });

        palpite.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        palpite.setText("Palpite Certeiro");
        palpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palpiteActionPerformed(evt);
            }
        });

        pular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pular.setText("Pular");
        pular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pularActionPerformed(evt);
            }
        });

        meio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        meio.setText("Meio a Meio");
        meio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meioActionPerformed(evt);
            }
        });

        jLabel1.setText("A)");

        jLabel2.setText("B)");

        jLabel3.setText("C)");

        jLabel4.setText("D)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(universitarios)
                .addGap(26, 26, 26)
                .addComponent(palpite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(meio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pular, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(a3)))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a2)
                            .addComponent(a4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(placar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(placar)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(universitarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(meio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(palpite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(pergunta)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(a2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(a4)
                    .addComponent(a3)
                    .addComponent(jLabel3))
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(564, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        desabilitar();
        validarResposta(a2,questaoAtual);
        
    }//GEN-LAST:event_a2ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        desabilitar();
        validarResposta(a1,questaoAtual);
    }//GEN-LAST:event_a1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        desabilitar();
        validarResposta(a3,questaoAtual);
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        desabilitar();
        validarResposta(a4,questaoAtual);
    }//GEN-LAST:event_a4ActionPerformed

    private void universitariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universitariosActionPerformed
        universitarios.setEnabled(false);
        Dados.dicaUniversitarios--;
        boolean validar = false;
        int [] porcentagens = new int[4];
        int maiorPorcentagem;
        Random random = new Random();
        int chance = random.nextInt(100);   
        while(!validar){
        int porcentagem = 101;
        
        if(chance>5){
               
                if(altEx1 != 0 && altEx2 != 0){
                    porcentagens[0] =random.nextInt(porcentagem);
                    porcentagem-= porcentagens[0];
                }else{
                    porcentagens[0]=0;
                }
                 
                if(altEx1 != 1 && altEx2 != 1){
                    porcentagens[1]=random.nextInt(porcentagem);
                    porcentagem-= porcentagens[1];
                }else{
                    porcentagens[1]=0;
                }
                
                if(altEx1 != 2 && altEx2 != 2){
                    porcentagens[2] =random.nextInt(porcentagem);
                    porcentagem-= porcentagens[2];
                }else{
                    porcentagens[2]=0;
                }
                
                if(altEx1 != 3 && altEx2 != 3){
                    porcentagens[3]=porcentagem;
                }else{
                    porcentagens[3]=0;
                }
               
                maiorPorcentagem=porcentagens[0];
                for(int i=0; i<4; i++){
                    if(porcentagens[i]>maiorPorcentagem){
                        maiorPorcentagem=porcentagens[i];
                    }
                }
                
                
                if(a1.getText().equals(questaoAtual.getAltCorreta())&& maiorPorcentagem == porcentagens[0]){
                    validar = true;
                }
                if(a2.getText().equals(questaoAtual.getAltCorreta())&& maiorPorcentagem == porcentagens[1]){
                    validar = true;
                }
                if(a3.getText().equals(questaoAtual.getAltCorreta())&& maiorPorcentagem == porcentagens[2]){
                    validar = true;
                }
                if(a4.getText().equals(questaoAtual.getAltCorreta())&& maiorPorcentagem == porcentagens[3]){
                    validar = true;
                }
                
                if((porcentagens[0]==porcentagens[1] || porcentagens[0]==porcentagens[2] || porcentagens[0]==porcentagens[3] || 
                   porcentagens[1]==porcentagens[2] || porcentagens[1]==porcentagens[3] || porcentagens[2]==porcentagens[3]) && altEx1==-1 && altEx2==-1){
                     validar = false;
                    }
                

        }else{
                if(altEx1 != 0 && altEx2 != 0){
                    porcentagens[0] =random.nextInt(porcentagem);
                    porcentagem-= porcentagens[0];
                }else{
                    porcentagens[0]=0;
                }
                 
                if(altEx1 != 1 && altEx2 != 1){
                    porcentagens[1]=random.nextInt(porcentagem);
                    porcentagem-= porcentagens[1];
                }else{
                    porcentagens[1]=0;
                }
                
                if(altEx1 != 2 && altEx2 != 2){
                    porcentagens[2] =random.nextInt(porcentagem);
                    porcentagem-= porcentagens[2];
                }else{
                    porcentagens[2]=0;
                }
                
                if(altEx1 != 3 && altEx2 != 3){
                    porcentagens[3]=porcentagem;
                }else{
                    porcentagens[3]=0;
                }
              
                validar=true;
        }}
        JOptionPane.showMessageDialog(null,"A: "+ porcentagens[0]+"%   B: "+ porcentagens[1]+"%   C: "+ porcentagens[2]+"%   D: "+ porcentagens[3]+"%");
    }//GEN-LAST:event_universitariosActionPerformed

    private void palpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palpiteActionPerformed
        palpite.setEnabled(false);
        Dados.palpiteCerteiro--;
        
            if(a1.getText().equals(questaoAtual.getAltCorreta())){
                JOptionPane.showMessageDialog(null,"A alternativa correta é a letra A");
            }
            if(a2.getText().equals(questaoAtual.getAltCorreta())){
                JOptionPane.showMessageDialog(null,"A alternativa correta é a letra B");
            }
            if(a3.getText().equals(questaoAtual.getAltCorreta())){
                JOptionPane.showMessageDialog(null,"A alternativa correta é a letra C");
            }
            if(a4.getText().equals(questaoAtual.getAltCorreta())){
                JOptionPane.showMessageDialog(null,"A alternativa correta é a letra D");
            }
   
    }//GEN-LAST:event_palpiteActionPerformed

    private void pularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pularActionPerformed
        Dados.Pular--;
        telaPergunta tPergunta = new telaPergunta(Dados);
        dispose();
        tPergunta.setVisible(true);
    }//GEN-LAST:event_pularActionPerformed

    private void meioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meioActionPerformed
        Dados.meioAMeio--;
        meio.setEnabled(false);
        boolean validar = false;
        altEx1=-1;
        altEx2=-1;
        while(!validar){
            Random random = new Random();
            altEx1=-1;
            altEx2=-1;
            boolean validarAltEx = false;
            while(!validarAltEx){
                altEx1 = random.nextInt(4);
                altEx2 = random.nextInt(4);
                
                if(altEx1 != altEx2){
                    validarAltEx=true;
                }
            }
            
            int numAltCorreta=0;
            if(questaoAtual.getAltCorreta().equals(a1.getText())){
                numAltCorreta = 0;
            }
            if(questaoAtual.getAltCorreta().equals(a2.getText())){
                numAltCorreta = 1;
            }
            if(questaoAtual.getAltCorreta().equals(a3.getText())){
                numAltCorreta = 2;
            }           
            if(questaoAtual.getAltCorreta().equals(a4.getText())){
                numAltCorreta = 3;
            }            
            
            if(altEx1 != numAltCorreta && altEx2 != numAltCorreta){
                validar = true;
            }
        }
        
        switch(altEx1){
            case 0:
                a1.setVisible(false);
                break;
            case 1:
                a2.setVisible(false);
                break;
            case 2:
                a3.setVisible(false);
                break;
            case 3:
                a4.setVisible(false);
                break;
        }
        
                switch(altEx2){
            case 0:
                a1.setVisible(false);
                break;
            case 1:
                a2.setVisible(false);
                break;
            case 2:
                a3.setVisible(false);
                break;
            case 3:
                a4.setVisible(false);
                break;
        }
    }//GEN-LAST:event_meioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPergunta(Dados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton meio;
    private javax.swing.JButton palpite;
    private javax.swing.JLabel pergunta;
    private javax.swing.JLabel placar;
    private javax.swing.JButton pular;
    private javax.swing.JButton universitarios;
    // End of variables declaration//GEN-END:variables
}
