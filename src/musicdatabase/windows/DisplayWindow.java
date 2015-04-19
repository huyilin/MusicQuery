package musicdatabase.windows;

import musicdatabase.display.*;

public class DisplayWindow extends javax.swing.JFrame {

    public DisplayWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreaDisplayButton = new javax.swing.JButton();
        ArtistDisplayButton = new javax.swing.JButton();
        RecordingDisplayButton = new javax.swing.JButton();
        GenreDisplayButton = new javax.swing.JButton();
        ArtistTrackDisplayButton = new javax.swing.JButton();
        MediumDisplayButton = new javax.swing.JButton();
        TrackDisplayButton = new javax.swing.JButton();
        ArtistGenreDisplayButton = new javax.swing.JButton();
        ReleasesDisplayButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AreaDisplayButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        AreaDisplayButton.setText("Area");
        AreaDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaDisplayButtonActionPerformed(evt);
            }
        });

        ArtistDisplayButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistDisplayButton.setText("Artist");
        ArtistDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistDisplayButtonActionPerformed(evt);
            }
        });

        RecordingDisplayButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        RecordingDisplayButton.setText("Recording");
        RecordingDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordingDisplayButtonActionPerformed(evt);
            }
        });

        GenreDisplayButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        GenreDisplayButton.setText("Genre");
        GenreDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreDisplayButtonActionPerformed(evt);
            }
        });

        ArtistTrackDisplayButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistTrackDisplayButton.setText("Artist_Track");
        ArtistTrackDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistTrackDisplayButtonActionPerformed(evt);
            }
        });

        MediumDisplayButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        MediumDisplayButton.setText("Medium");
        MediumDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumDisplayButtonActionPerformed(evt);
            }
        });

        TrackDisplayButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        TrackDisplayButton.setText("Track");
        TrackDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackDisplayButtonActionPerformed(evt);
            }
        });

        ArtistGenreDisplayButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistGenreDisplayButton.setText("Artist_Genre");
        ArtistGenreDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistGenreDisplayButtonActionPerformed(evt);
            }
        });

        ReleasesDisplayButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ReleasesDisplayButton.setText("Releases");
        ReleasesDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReleasesDisplayButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Display a table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ArtistDisplayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArtistTrackDisplayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArtistGenreDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TrackDisplayButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AreaDisplayButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenreDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RecordingDisplayButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MediumDisplayButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReleasesDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArtistDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AreaDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MediumDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArtistTrackDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrackDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecordingDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArtistGenreDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenreDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReleasesDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AreaDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaDisplayButtonActionPerformed
        AreaDisplay areatable = new AreaDisplay();
        areatable.setVisible(true);
    }//GEN-LAST:event_AreaDisplayButtonActionPerformed

    private void ArtistTrackDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistTrackDisplayButtonActionPerformed
        ArtistTrackDisplay artistTrackTable = new ArtistTrackDisplay();
        artistTrackTable.setVisible(true);
    }//GEN-LAST:event_ArtistTrackDisplayButtonActionPerformed

    private void GenreDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreDisplayButtonActionPerformed
        GenreDisplay genreTable = new GenreDisplay();
        genreTable.setVisible(true);
    }//GEN-LAST:event_GenreDisplayButtonActionPerformed

    private void RecordingDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordingDisplayButtonActionPerformed
        RecordingDisplay recordingTable = new RecordingDisplay();
        recordingTable.setVisible(true);
    }//GEN-LAST:event_RecordingDisplayButtonActionPerformed

    private void ArtistDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistDisplayButtonActionPerformed
        ArtistDisplay artistTable = new ArtistDisplay();
        artistTable.setVisible(true);
    }//GEN-LAST:event_ArtistDisplayButtonActionPerformed

    private void MediumDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumDisplayButtonActionPerformed
        MediumDisplay mediumTable = new MediumDisplay();
        mediumTable.setVisible(true);
    }//GEN-LAST:event_MediumDisplayButtonActionPerformed

    private void TrackDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackDisplayButtonActionPerformed
        TrackDisplay trackTable = new TrackDisplay();
        trackTable.setVisible(true);
    }//GEN-LAST:event_TrackDisplayButtonActionPerformed

    private void ArtistGenreDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistGenreDisplayButtonActionPerformed
        ArtistGenreDisplay artistGenreTable = new ArtistGenreDisplay();
        artistGenreTable.setVisible(true);
    }//GEN-LAST:event_ArtistGenreDisplayButtonActionPerformed

    private void ReleasesDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReleasesDisplayButtonActionPerformed
        ReleasesDisplay releaseTable = new ReleasesDisplay();
        releaseTable.setVisible(true);
    }//GEN-LAST:event_ReleasesDisplayButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DisplayWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AreaDisplayButton;
    private javax.swing.JButton ArtistDisplayButton;
    private javax.swing.JButton ArtistGenreDisplayButton;
    private javax.swing.JButton ArtistTrackDisplayButton;
    private javax.swing.JButton GenreDisplayButton;
    private javax.swing.JButton MediumDisplayButton;
    private javax.swing.JButton RecordingDisplayButton;
    private javax.swing.JButton ReleasesDisplayButton;
    private javax.swing.JButton TrackDisplayButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
