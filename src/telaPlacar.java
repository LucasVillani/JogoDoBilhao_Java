import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
public class telaPlacar extends javax.swing.JFrame {

    static dados Dados;
    
    void novaTela(){
                telaPergunta tPergunta = new telaPergunta(Dados);
                dispose();
                tPergunta.setVisible(true);
    }
    
    public telaPlacar(dados Dados) {
        this.Dados = Dados;
        initComponents();
        switch(Dados.contadorPontuacao){
            case 0:
                p1.setForeground(Color.GREEN);
                break;
            case 1:
                p2.setForeground(Color.GREEN);
                break;
            case 2:
                p3.setForeground(Color.GREEN);
                break;
            case 3:
                p4.setForeground(Color.GREEN);
                break;
            case 4:
                p5.setForeground(Color.GREEN);
                break;
            case 5:
                p6.setForeground(Color.GREEN);
                break;
            case 6:
                p7.setForeground(Color.GREEN);
                break;
            case 7:
                p8.setForeground(Color.GREEN);
                break;
            case 8:
                p9.setForeground(Color.GREEN);
                break;
            case 9:
                p10.setForeground(Color.GREEN);
                break;

            }
        
        ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            
           novaTela();
        }
        };
        Timer timer = new Timer(2000 ,taskPerformer);
        timer.setRepeats(false);
        timer.start();
                
        
        


        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        p1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p1.setForeground(new java.awt.Color(255, 102, 0));
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText("R$ 1.000.000");

        p2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p2.setText("R$ 5.000.000");

        p3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p3.setText("R$ 10.000.000");

        p4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p4.setForeground(new java.awt.Color(255, 102, 0));
        p4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p4.setText("R$ 20.000.000");

        p5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p5.setText("R$ 45.000.000");

        p6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p6.setText("R$ 87.500.000");

        p7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p7.setForeground(new java.awt.Color(255, 102, 0));
        p7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p7.setText("R$ 175.000.000");

        p8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p8.setText("R$ 250.000.000");

        p9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p9.setText("R$ 500.000.000");

        p10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        p10.setForeground(new java.awt.Color(255, 102, 0));
        p10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        p10.setText("R$ 1.000.000.000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p2)
                                .addComponent(p1))
                            .addComponent(p4)
                            .addComponent(p5)
                            .addComponent(p6)
                            .addComponent(p7))
                        .addComponent(p8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(p9, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(497, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(telaPlacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPlacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPlacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPlacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPlacar(Dados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
