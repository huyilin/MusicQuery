package musicdatabase.windows;

import musicdatabase.add.*;

public class AddWindow extends javax.swing.JFrame {

    public AddWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ArtistAddButton = new javax.swing.JButton();
        AreaAddButton = new javax.swing.JButton();
        ReleasesAddButton = new javax.swing.JButton();
        MediumAddButton = new javax.swing.JButton();
        ArtistTrackAddButton = new javax.swing.JButton();
        GenreAddButton = new javax.swing.JButton();
        RecordingAddButton = new javax.swing.JButton();
        ArtistGenreAddButton = new javax.swing.JButton();
        TrackAddButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ArtistAddButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistAddButton.setText("Artist");
        ArtistAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistAddButtonActionPerformed(evt);
            }
        });

        AreaAddButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        AreaAddButton.setText("Area");
        AreaAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaAddButtonActionPerformed(evt);
            }
        });

        ReleasesAddButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ReleasesAddButton.setText("Releases");
        ReleasesAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReleasesAddButtonActionPerformed(evt);
            }
        });

        MediumAddButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        MediumAddButton.setText("Medium");
        MediumAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumAddButtonActionPerformed(evt);
            }
        });

        ArtistTrackAddButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistTrackAddButton.setText("Artist_Track");
        ArtistTrackAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistTrackAddButtonActionPerformed(evt);
            }
        });

        GenreAddButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        GenreAddButton.setText("Genre");
        GenreAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreAddButtonActionPerformed(evt);
            }
        });

        RecordingAddButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        RecordingAddButton.setText("Recording");
        RecordingAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordingAddButtonActionPerformed(evt);
            }
        });

        ArtistGenreAddButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistGenreAddButton.setText("Artist_Genre");
        ArtistGenreAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistGenreAddButtonActionPerformed(evt);
            }
        });

        TrackAddButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        TrackAddButton.setText("Track");
        TrackAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackAddButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Add a record");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ArtistAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArtistTrackAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArtistGenreAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TrackAddButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AreaAddButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenreAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MediumAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RecordingAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReleasesAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AreaAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArtistAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MediumAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArtistTrackAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrackAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecordingAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenreAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArtistGenreAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReleasesAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArtistAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistAddButtonActionPerformed
        ArtistAdd artistAdd = new ArtistAdd();
        artistAdd.setVisible(true);
    }//GEN-LAST:event_ArtistAddButtonActionPerformed

    private void AreaAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaAddButtonActionPerformed
        AreaAdd areaAdd = new AreaAdd();
        areaAdd.setVisible(true);
    }//GEN-LAST:event_AreaAddButtonActionPerformed

    private void ReleasesAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReleasesAddButtonActionPerformed
        ReleasesAdd releaseAdd = new ReleasesAdd();
        releaseAdd.setVisible(true);
    }//GEN-LAST:event_ReleasesAddButtonActionPerformed

    private void MediumAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumAddButtonActionPerformed
        MediumAdd mediumAdd = new MediumAdd();
        mediumAdd.setVisible(true);
    }//GEN-LAST:event_MediumAddButtonActionPerformed

    private void ArtistTrackAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistTrackAddButtonActionPerformed
        ArtistTrackAdd artistTrackAdd = new ArtistTrackAdd();
        artistTrackAdd.setVisible(true);
    }//GEN-LAST:event_ArtistTrackAddButtonActionPerformed

    private void GenreAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreAddButtonActionPerformed
        GenreAdd genreAdd = new GenreAdd();
        genreAdd.setVisible(true);
    }//GEN-LAST:event_GenreAddButtonActionPerformed

    private void RecordingAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordingAddButtonActionPerformed
        RecordingAdd recordingAdd = new RecordingAdd();
        recordingAdd.setVisible(true);
    }//GEN-LAST:event_RecordingAddButtonActionPerformed

    private void ArtistGenreAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistGenreAddButtonActionPerformed
        ArtistGenreAdd artistGenreAdd = new ArtistGenreAdd();
        artistGenreAdd.setVisible(true);
    }//GEN-LAST:event_ArtistGenreAddButtonActionPerformed

    private void TrackAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackAddButtonActionPerformed
        TrackAdd trackAdd = new TrackAdd();
        trackAdd.setVisible(true);
    }//GEN-LAST:event_TrackAddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AreaAddButton;
    private javax.swing.JButton ArtistAddButton;
    private javax.swing.JButton ArtistGenreAddButton;
    private javax.swing.JButton ArtistTrackAddButton;
    private javax.swing.JButton GenreAddButton;
    private javax.swing.JButton MediumAddButton;
    private javax.swing.JButton RecordingAddButton;
    private javax.swing.JButton ReleasesAddButton;
    private javax.swing.JButton TrackAddButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}