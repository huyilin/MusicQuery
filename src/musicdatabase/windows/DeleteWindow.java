package musicdatabase.windows;

import musicdatabase.delete.MediumDelete;
import musicdatabase.delete.GenreDelete;
import musicdatabase.delete.TrackDelete;
import musicdatabase.delete.RecordingDelete;
import musicdatabase.delete.ArtistTrackDelete;
import musicdatabase.delete.AreaDelete;
import musicdatabase.delete.ArtistGenreDelete;
import musicdatabase.delete.ArtistDelete;
import musicdatabase.delete.ReleasesDelete;

public class DeleteWindow extends javax.swing.JFrame {

    public DeleteWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ArtistDeleteButton = new javax.swing.JButton();
        AreaDeleteButton = new javax.swing.JButton();
        ReleasesDeleteButton = new javax.swing.JButton();
        MediumDeleteButton = new javax.swing.JButton();
        ArtistTrackDeleteButton = new javax.swing.JButton();
        GenreDeleteButton = new javax.swing.JButton();
        RecordingDeleteButton = new javax.swing.JButton();
        ArtistGenreDeleteButton = new javax.swing.JButton();
        TrackDeleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ArtistDeleteButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistDeleteButton.setText("Artist");
        ArtistDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistDeleteButtonActionPerformed(evt);
            }
        });

        AreaDeleteButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        AreaDeleteButton.setText("Area");
        AreaDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaDeleteButtonActionPerformed(evt);
            }
        });

        ReleasesDeleteButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ReleasesDeleteButton.setText("Releases");
        ReleasesDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReleasesDeleteButtonActionPerformed(evt);
            }
        });

        MediumDeleteButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        MediumDeleteButton.setText("Medium");
        MediumDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumDeleteButtonActionPerformed(evt);
            }
        });

        ArtistTrackDeleteButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistTrackDeleteButton.setText("Artist_Track");
        ArtistTrackDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistTrackDeleteButtonActionPerformed(evt);
            }
        });

        GenreDeleteButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        GenreDeleteButton.setText("Genre");
        GenreDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreDeleteButtonActionPerformed(evt);
            }
        });

        RecordingDeleteButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        RecordingDeleteButton.setText("Recording");
        RecordingDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordingDeleteButtonActionPerformed(evt);
            }
        });

        ArtistGenreDeleteButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        ArtistGenreDeleteButton.setText("Artist_Genre");
        ArtistGenreDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistGenreDeleteButtonActionPerformed(evt);
            }
        });

        TrackDeleteButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        TrackDeleteButton.setText("Track");
        TrackDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackDeleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Delete a record");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ArtistDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArtistTrackDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArtistGenreDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AreaDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TrackDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenreDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RecordingDeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MediumDeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReleasesDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ArtistDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ArtistTrackDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ArtistGenreDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AreaDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TrackDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GenreDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ReleasesDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MediumDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RecordingDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArtistDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistDeleteButtonActionPerformed
        ArtistDelete artistRemove = new ArtistDelete();
        artistRemove.setVisible(true);
    }//GEN-LAST:event_ArtistDeleteButtonActionPerformed

    private void AreaDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaDeleteButtonActionPerformed
        AreaDelete areaRemove = new AreaDelete();
        areaRemove.setVisible(true);
    }//GEN-LAST:event_AreaDeleteButtonActionPerformed

    private void ReleasesDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReleasesDeleteButtonActionPerformed
        ReleasesDelete releaseRemove = new ReleasesDelete();
        releaseRemove.setVisible(true);
    }//GEN-LAST:event_ReleasesDeleteButtonActionPerformed

    private void MediumDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumDeleteButtonActionPerformed
        MediumDelete mediumRemove = new MediumDelete();
        mediumRemove.setVisible(true);
    }//GEN-LAST:event_MediumDeleteButtonActionPerformed

    private void ArtistTrackDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistTrackDeleteButtonActionPerformed
        ArtistTrackDelete artistTrackRemove = new ArtistTrackDelete();
        artistTrackRemove.setVisible(true);
    }//GEN-LAST:event_ArtistTrackDeleteButtonActionPerformed

    private void GenreDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreDeleteButtonActionPerformed
        GenreDelete genreRemove = new GenreDelete();
        genreRemove.setVisible(true);
    }//GEN-LAST:event_GenreDeleteButtonActionPerformed

    private void RecordingDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordingDeleteButtonActionPerformed
        RecordingDelete recordingRemove = new RecordingDelete();
        recordingRemove.setVisible(true);
    }//GEN-LAST:event_RecordingDeleteButtonActionPerformed

    private void ArtistGenreDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistGenreDeleteButtonActionPerformed
        ArtistGenreDelete artistGenreRemove = new ArtistGenreDelete();
        artistGenreRemove.setVisible(true);
    }//GEN-LAST:event_ArtistGenreDeleteButtonActionPerformed

    private void TrackDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackDeleteButtonActionPerformed
        TrackDelete trackRemove = new TrackDelete();
        trackRemove.setVisible(true);
    }//GEN-LAST:event_TrackDeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AreaDeleteButton;
    private javax.swing.JButton ArtistDeleteButton;
    private javax.swing.JButton ArtistGenreDeleteButton;
    private javax.swing.JButton ArtistTrackDeleteButton;
    private javax.swing.JButton GenreDeleteButton;
    private javax.swing.JButton MediumDeleteButton;
    private javax.swing.JButton RecordingDeleteButton;
    private javax.swing.JButton ReleasesDeleteButton;
    private javax.swing.JButton TrackDeleteButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
