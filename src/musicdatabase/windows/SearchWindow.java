package musicdatabase.windows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import musicdatabase.Connector;

public class SearchWindow extends javax.swing.JFrame {

    Statement statement1;
    Statement statement2;
    Connector connector = new Connector();
    
    public SearchWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        textArtistName = new javax.swing.JTextField();
        ArtistSearchButton = new javax.swing.JButton();
        textRecordingName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textGenreName = new javax.swing.JTextField();
        RecordingSearchButton = new javax.swing.JButton();
        GenreSearchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Keyword Search");

        ArtistSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ArtistSearchButton.setText("SEARCH");
        ArtistSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistSearchButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setText("ARTIST NAME");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setText("RECORDING NAME");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setText("GENRE NAME");

        RecordingSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        RecordingSearchButton.setText("SEARCH");
        RecordingSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordingSearchButtonActionPerformed(evt);
            }
        });

        GenreSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GenreSearchButton.setText("SEARCH");
        GenreSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textRecordingName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(textArtistName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textGenreName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RecordingSearchButton)
                    .addComponent(ArtistSearchButton)
                    .addComponent(GenreSearchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textArtistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ArtistSearchButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecordingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(RecordingSearchButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textGenreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenreSearchButton)
                    .addComponent(jLabel3))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArtistSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistSearchButtonActionPerformed
        String artistName = textArtistName.getText();
        ResultSet recordingsRS;
        ResultSet genresRS;
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn(artistName + " Recordings");
        model.addColumn(artistName + " Genres");
        
        String artistQueryRecordings = "SELECT DISTINCT r.RecordingName FROM artist a, artist_track at, track t, recording r " +
                                       "WHERE a.ArtistName = '"+ artistName + "' AND a.IDArtist = at.IDArtist " +
                                       "AND at.IDTrack = t.IDTrack AND t.IDRecording = r.IDRecording";
        
        String artistQueryGenres = "SELECT DISTINCT g.GenreName FROM artist a, artist_genre ag, genre g " +
                                   "WHERE a.ArtistName = '"+ artistName + "' " +
                                   "AND a.IDArtist = ag.IDArtist AND ag.IDGenre = g.IDGenre";
        
        List<String> recordingsList = new ArrayList<>();
        List<String> genresList = new ArrayList<>();
        
        try {
            statement1 = connector.getConnection().createStatement();
            statement2 = connector.getConnection().createStatement();
            recordingsRS = statement1.executeQuery(artistQueryRecordings);
            genresRS = statement2.executeQuery(artistQueryGenres);
            
            //System.out.println("Artist : "+ artistName);
            //System.out.println("Recordings :");
            while(recordingsRS.next()) {
                String recording = recordingsRS.getString("RecordingName");
                //System.out.println("\t"+recording);
                recordingsList.add(recording);
            }

            //System.out.println("Genres :");
            while(genresRS.next()) {
                String genre = genresRS.getString("GenreName");
                //System.out.println("\t"+genre);
                genresList.add(genre);
            }
        
            int r = recordingsList.size();
            int g = genresList.size();
            if(g < r) {
                for(int i = 0; i<(r-g); i++) {
                    genresList.add(g+i, "");
                }
            } else if (g > r) {
                for(int i = 0; i<(g-r); i++) {
                    recordingsList.add(r+i, "");
                }
            }
        
            String[] recordings = recordingsList.toArray(new String[recordingsList.size()]);
            String[] genres = genresList.toArray(new String[genresList.size()]);
            int nbRecordings = recordings.length;
        
            for(int i = 0; i < nbRecordings; i++) {
                model.addRow(new Object[] {recordings[i], genres[i]});
            }
        
        } catch (SQLException sqle) {
            System.err.println(sqle);
        } finally {
            try {
                statement1.close();
                statement2.close();
            } catch (SQLException sqle) {
                System.err.println(sqle);
            }
        }
        
        JTable resultTable = new JTable(model);
        JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
    }//GEN-LAST:event_ArtistSearchButtonActionPerformed

    private void RecordingSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordingSearchButtonActionPerformed
        String recordingName = textRecordingName.getText();
        ResultSet artistsRS;
        ResultSet genresRS;
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn(recordingName + " Artists");
        model.addColumn(recordingName + " Genres");
        
        String recordingQueryArtists = "SELECT DISTINCT a.ArtistName FROM artist a, artist_track at, track t, recording r " +
                                      "WHERE r.RecordingName = '"+ recordingName + "' AND r.IDRecording = t.IDRecording " +
                                      "AND t.IDTrack = at.IDTrack AND at.IDArtist = a.IDArtist";
        
        String recordingQueryGenres = "SELECT DISTINCT g.GenreName FROM genre g, artist_genre ag, artist_track at, track t, recording r " +
                                      "WHERE r.RecordingName = '"+ recordingName + "' AND r.IDRecording = t.IDRecording " +
                                      "AND t.IDTrack = at.IDTrack AND at.IDArtist = ag.IDArtist AND ag.IDGenre = g.IDGenre";
        
        List<String> artistsList = new ArrayList<>();
        List<String> genresList = new ArrayList<>();
        
        try {
            statement1 = connector.getConnection().createStatement();
            statement2 = connector.getConnection().createStatement();
            artistsRS = statement1.executeQuery(recordingQueryArtists);
            genresRS = statement2.executeQuery(recordingQueryGenres);
            
            while(artistsRS.next()) {
                String artist = artistsRS.getString("ArtistName");
                artistsList.add(artist);
            }
            
            while(genresRS.next()) {
                String genre = genresRS.getString("GenreName");
                genresList.add(genre);
            }
            
            int a = artistsList.size();
            int g = genresList.size();
            if(g < a) {
                for(int i = 0; i<(a-g); i++) {
                    genresList.add(g+i, "");
                }
            } else if (g > a) {
                for(int i = 0; i<(g-a); i++) {
                    artistsList.add(a+i, "");
                }
            }
        
            String[] artists = artistsList.toArray(new String[a]);
            String[] genres = genresList.toArray(new String[g]);
            int nbArtists = artists.length;
        
            for(int i = 0; i < nbArtists; i++) {
                model.addRow(new Object[] {artists[i], genres[i]});
            }
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
        
        JTable resultTable = new JTable(model);
        JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
    }//GEN-LAST:event_RecordingSearchButtonActionPerformed

    private void GenreSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreSearchButtonActionPerformed
        String genreName = textGenreName.getText();
        ResultSet artistsRS;
        ResultSet recordingsRS;
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn(genreName + " Artists");
        model.addColumn(genreName + " Recordings");
        
        String genreQueryArtists = "SELECT DISTINCT a.ArtistName FROM artist a, artist_genre ag, genre g " +
                                  "WHERE g.GenreName = '"+ genreName + "' AND g.IDGenre = ag.IDGenre " +
                                  "AND ag.IDArtist = a.IDArtist";
        
        String genreQueryRecordings = "SELECT DISTINCT r.RecordingName FROM artist a, genre g, artist_genre ag, artist_track at, track t, recording r " +
                                      "WHERE g.GenreName = '"+ genreName + "' AND g.IDGenre = ag.IDGenre " +
                                      "AND ag.IDArtist = a.IDArtist AND a.IDArtist = at.IDArtist " +
                                      "AND at.IDTrack = t.IDTrack AND t.IDRecording = r.IDRecording";
        
        List<String> artistsList = new ArrayList<>();
        List<String> recordingsList = new ArrayList<>();
        
        try {
            statement1 = connector.getConnection().createStatement();
            statement2 = connector.getConnection().createStatement();
            artistsRS = statement1.executeQuery(genreQueryArtists);
            recordingsRS = statement2.executeQuery(genreQueryRecordings);
            
            while(artistsRS.next()) {
                String artist = artistsRS.getString("ArtistName");
                artistsList.add(artist);
            }
            
            while(recordingsRS.next()) {
                String recording = recordingsRS.getString("RecordingName");
                recordingsList.add(recording);
            }
            
            int a = artistsList.size();
            int r = recordingsList.size();
            if(r < a) {
                for(int i = 0; i<(a-r); i++) {
                    recordingsList.add(r+i, "");
                }
            } else if (r > a) {
                for(int i = 0; i<(r-a); i++) {
                    artistsList.add(a+i, "");
                }
            }
        
            String[] artists = artistsList.toArray(new String[a]);
            String[] recordings = recordingsList.toArray(new String[r]);
            int nbRecordings = recordings.length;
        
            for(int i = 0; i < nbRecordings; i++) {
                model.addRow(new Object[] {artists[i], recordings[i]});
            }
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
        
        JTable resultTable = new JTable(model);
        JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
    }//GEN-LAST:event_GenreSearchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ArtistSearchButton;
    private javax.swing.JButton GenreSearchButton;
    private javax.swing.JButton RecordingSearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textArtistName;
    private javax.swing.JTextField textGenreName;
    private javax.swing.JTextField textRecordingName;
    // End of variables declaration//GEN-END:variables
}