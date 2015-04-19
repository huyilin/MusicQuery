package musicdatabase.windows;

import musicdatabase.update.*;

public class UpdateWindow extends javax.swing.JFrame {

    public UpdateWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ArtistUpdateButton = new javax.swing.JButton();
        AreaUpdateButton = new javax.swing.JButton();
        ReleaseUpdateButton = new javax.swing.JButton();
        MediumUpdateButton = new javax.swing.JButton();
        ArtistTrackUpdateButton = new javax.swing.JButton();
        GenreUpdateButton = new javax.swing.JButton();
        RecordingUpdateButton = new javax.swing.JButton();
        ArtistGenreUpdateButton = new javax.swing.JButton();
        TrackUpdateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ArtistUpdateButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistUpdateButton.setText("Artist");
        ArtistUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistUpdateButtonActionPerformed(evt);
            }
        });

        AreaUpdateButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        AreaUpdateButton.setText("Area");
        AreaUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaUpdateButtonActionPerformed(evt);
            }
        });

        ReleaseUpdateButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ReleaseUpdateButton.setText("Release");
        ReleaseUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReleaseUpdateButtonActionPerformed(evt);
            }
        });

        MediumUpdateButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        MediumUpdateButton.setText("Medium");
        MediumUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumUpdateButtonActionPerformed(evt);
            }
        });

        ArtistTrackUpdateButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistTrackUpdateButton.setText("Artist_Track");
        ArtistTrackUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistTrackUpdateButtonActionPerformed(evt);
            }
        });

        GenreUpdateButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        GenreUpdateButton.setText("Genre");
        GenreUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreUpdateButtonActionPerformed(evt);
            }
        });

        RecordingUpdateButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        RecordingUpdateButton.setText("Recording");
        RecordingUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordingUpdateButtonActionPerformed(evt);
            }
        });

        ArtistGenreUpdateButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistGenreUpdateButton.setText("Artist_Genre");
        ArtistGenreUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistGenreUpdateButtonActionPerformed(evt);
            }
        });

        TrackUpdateButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        TrackUpdateButton.setText("Track");
        TrackUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackUpdateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Update a record");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ArtistTrackUpdateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArtistUpdateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArtistGenreUpdateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AreaUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TrackUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenreUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MediumUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RecordingUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReleaseUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArtistUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AreaUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MediumUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArtistTrackUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrackUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecordingUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArtistGenreUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenreUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReleaseUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArtistUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistUpdateButtonActionPerformed
        ArtistUpdate artistUpdate = new ArtistUpdate();
        artistUpdate.setVisible(true);
    }//GEN-LAST:event_ArtistUpdateButtonActionPerformed

    private void AreaUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaUpdateButtonActionPerformed
        AreaUpdate areaUpdate = new AreaUpdate();
        areaUpdate.setVisible(true);
    }//GEN-LAST:event_AreaUpdateButtonActionPerformed

    private void ReleaseUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReleaseUpdateButtonActionPerformed
        ReleasesUpdate releaseUpdate = new ReleasesUpdate();
        releaseUpdate.setVisible(true);
    }//GEN-LAST:event_ReleaseUpdateButtonActionPerformed

    private void MediumUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumUpdateButtonActionPerformed
        MediumUpdate mediumUpdate = new MediumUpdate();
        mediumUpdate.setVisible(true);
    }//GEN-LAST:event_MediumUpdateButtonActionPerformed

    private void ArtistTrackUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistTrackUpdateButtonActionPerformed
        ArtistTrackUpdate artistTrackUpdate = new ArtistTrackUpdate();
        artistTrackUpdate.setVisible(true);
    }//GEN-LAST:event_ArtistTrackUpdateButtonActionPerformed

    private void GenreUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreUpdateButtonActionPerformed
        GenreUpdate genreUpdate = new GenreUpdate();
        genreUpdate.setVisible(true);
    }//GEN-LAST:event_GenreUpdateButtonActionPerformed

    private void RecordingUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordingUpdateButtonActionPerformed
        RecordingUpdate recordingUpdate = new RecordingUpdate();
        recordingUpdate.setVisible(true);
    }//GEN-LAST:event_RecordingUpdateButtonActionPerformed

    private void ArtistGenreUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistGenreUpdateButtonActionPerformed
        ArtistGenreUpdate artistGenreUpdate = new ArtistGenreUpdate();
        artistGenreUpdate.setVisible(true);
    }//GEN-LAST:event_ArtistGenreUpdateButtonActionPerformed

    private void TrackUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackUpdateButtonActionPerformed
        TrackUpdate trackUpdate = new TrackUpdate();
        trackUpdate.setVisible(true);
    }//GEN-LAST:event_TrackUpdateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UpdateWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AreaUpdateButton;
    private javax.swing.JButton ArtistGenreUpdateButton;
    private javax.swing.JButton ArtistTrackUpdateButton;
    private javax.swing.JButton ArtistUpdateButton;
    private javax.swing.JButton GenreUpdateButton;
    private javax.swing.JButton MediumUpdateButton;
    private javax.swing.JButton RecordingUpdateButton;
    private javax.swing.JButton ReleaseUpdateButton;
    private javax.swing.JButton TrackUpdateButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}