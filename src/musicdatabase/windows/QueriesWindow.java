package musicdatabase.windows;

import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import musicdatabase.Connector;

public class QueriesWindow extends javax.swing.JFrame {
	
	Statement statement;
	Connector connector = new Connector();
	String queryToRun;
	String query;
	
    public QueriesWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textQuery = new javax.swing.JTextField();
        RunButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Run Queries");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel2.setText("Query");

        RunButton.setText("RUN");
        RunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(textQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(RunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunButtonActionPerformed
        queryToRun = textQuery.getText();
    	ResultSet resultSet = null;
    	
    	DefaultTableModel model = new DefaultTableModel();
    	
            switch (queryToRun) {
                case "a":
                case "A":
                    {
                        model.addColumn("Artists from Switzerland");
                        query = "SELECT artist.ArtistName FROM area, artist " +
                                "WHERE area.IDArea=artist.IDArea AND area.areaName = 'Switzerland'";
                        try {
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("ArtistName")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }           JTable resultTable = new JTable(model);
            JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "b":
                case "B":
                    {
                        model.addColumn("Area Name");
                        model.addColumn("Type");
                        model.addColumn("Number of artists");
                        String query1 = "set @a=(SELECT IDArea FROM area NATURAL JOIN artist WHERE gender='female' " +
                                "GROUP BY IDArea ORDER BY count(*) desc limit 1);";
                        String query2 = "set @b=(SELECT IDArea FROM area NATURAL JOIN artist WHERE gender='male' " +
                                "GROUP BY IDArea ORDER BY count(*) desc limit 1);";
                        String query3 = "set @c=(SELECT IDArea FROM area NATURAL JOIN artist WHERE type='group' " +
                                "GROUP BY IDArea ORDER BY count(*) desc limit 1);";
                        query = "SELECT areaName, type, count(*) FROM area NATURAL JOIN artist WHERE " +
                                "IDArea=@a OR IDArea=@b OR IDArea=@c GROUP BY IDArea,type ORDER BY IDArea;";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            Statement statement2 = connector.getConnection().createStatement();
                            statement2.executeQuery(query2);
                            Statement statement3 = connector.getConnection().createStatement();
                            statement3.executeQuery(query3);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("areaName"),
                                    resultSet.getString("Type"),
                                    resultSet.getString("count(*)")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }           JTable resultTable = new JTable(model);
            JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "c":
                case "C":
                    {
                        model.addColumn("Groups with the most recorded tracks");
                        query = "SELECT artistName FROM artist JOIN artist_track using(IDArtist) " +
                                "WHERE type='group' GROUP BY ArtistName,IDArtist ORDER BY count(*) desc limit 10;";
                        try {
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("artistName")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }           JTable resultTable = new JTable(model);
            JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "d":
                case "D":
                    {
                        model.addColumn("Groups with the most releases");
                        query = "SELECT ArtistName FROM artist JOIN artist_track using(IDArtist) JOIN track using(IDTrack) " +
                                "JOIN medium using(IDMedium) JOIN releases using(IDRelease) WHERE artist.type = 'group' " +
                                "GROUP BY ArtistName,IDArtist ORDER BY count(*) desc limit 10;";
                        try {
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("ArtistName")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }           JTable resultTable = new JTable(model);
            JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "e":
                case "E":
                    {
                        model.addColumn("Female artist with the most genres");
                        query = "SELECT ArtistName FROM artist JOIN artist_genre using(IDArtist) WHERE gender = 'female' " +
                                "GROUP BY ArtistName,IDArtist ORDER BY count(*) desc limit 1;";
                        try {
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("artistName")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }           JTable resultTable = new JTable(model);
            JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "f":
                case "F":
                    {
                        model.addColumn("Cities with more female artists");
                        query = "SELECT areaName FROM area JOIN artist using(IDArea) WHERE AreaType = 'city' " +
                                "GROUP BY IDArea,AreaName HAVING count(CASE gender WHEN 'female' THEN 1 ELSE null END)>count(CASE gender WHEN 'male' THEN 1 ELSE null END);";
                        try {
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("areaName")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "g":
                case "G":
                    {
                        model.addColumn("Medium with highest number of tracks");
                        String query1 = "SET @d=(SELECT max(num) FROM(SELECT count(*) AS num FROM track JOIN medium using(IDMedium) " +
                                "GROUP BY IDMedium) AS maximum);";
                        query = "SELECT IDMedium FROM track JOIN medium USING(IDMedium) GROUP BY IDMedium HAVING count(*)=@d;";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("IDMedium")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "h":
                case "H":
                    {
                        model.addColumn("Area ID");
                        model.addColumn("Type");
                        model.addColumn("Gender");
                        model.addColumn("Artist Name");
                        model.addColumn("Artist ID");
                        model.addColumn("Number of tracks recorded");
                        String query1 = "create temporary table TempArea as(select IDArea from artist group by IDArea having count(*)>30);";
                        String query2 = "create temporary table temp_tracks as(select IDArtist, count(*) as num from TempArea join artist using(IDArea) join artist_track using(IDArtist) group by IDArtist);";
                        String query3 = "create temporary table temp_result as(select IDArea, type, gender, max(num) as num from temp_tracks natural join artist group by IDArea, type, gender);";
                        query = "select IDArea, type, gender, artistname, IDArtist, num from temp_tracks join artist using(IDArtist) natural join temp_result " +
                                "where type='group' or (type ='Person' and not(gender='Other')) order by IDArea,type,gender;";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            Statement statement2 = connector.getConnection().createStatement();
                            statement2.executeQuery(query2);
                            Statement statement3 = connector.getConnection().createStatement();
                            statement3.executeQuery(query3);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("IDArea"),
                                    resultSet.getString("Type"),
                                    resultSet.getString("gender"),
                                    resultSet.getString("artisName"),
                                    resultSet.getString("IDArtist"),
                                    resultSet.getString("num")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "i":
                case "I":
                    {
                        model.addColumn("Top 25 songs");
                        query = "SELECT recording.RecordingName FROM artist, artist_track, track, recording WHERE artist.ArtistName = 'Metallica' " +
                                "AND artist.IDArtist = artist_track.IDArtist AND artist_track.IDTrack = track.IDTrack AND track.IDRecording = recording.IDRecording " +
                                "GROUP BY track.IDRecording ORDER BY COUNT(DISTINCT track.IDMedium) desc LIMIT 25;";
                        try {
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("RecordingName")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "j":
                case "J":
                    {
                        model.addColumn("Female artist ID");
                        model.addColumn("Female artist name");
                        model.addColumn("Tracks recorded");
                        model.addColumn("Top10 genres");
                        String query1 = "CREATE TEMPORARY TABLE TOP_GENRE (select IDGenre from artist_genre group by IDGenre order by count(*) desc limit 10);";
                        String query2 = "CREATE TEMPORARY TABLE TRACK_COUNT (select a.ArtistName, ag.IDArtist, count(*) as trackCount, ag.IDGenre as IDGenre " +
                                "from artist a, artist_track at, artist_genre ag, TOP_GENRE tg where a.IDArtist = at.IDArtist " +
                                "and ag.IDGenre = tg.IDGenre and at.IDArtist = ag.IDArtist and a.gender='female' " +
                                "group by ag.IDArtist order by ag.IDGenre);";
                        String query3 = "create temporary table max_tracks(select IDGenre, max(trackCount) as track_num from TRACK_COUNT tc group by tc.IDGenre);";
                        query = "select IDArtist, ArtistName, trackCount, IDGenre from max_tracks join TRACK_COUNT using(IDGenre) where trackCount=track_num;";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            Statement statement2 = connector.getConnection().createStatement();
                            statement2.executeQuery(query2);
                            Statement statement3 = connector.getConnection().createStatement();
                            statement3.executeQuery(query3);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("IDArtist"),
                                    resultSet.getString("ArtistName"),
                                    resultSet.getString("trackCount"),
                                    resultSet.getString("IDGenre")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "k":
                case "K":
                    {
                        model.addColumn("Area Name");
                        model.addColumn("Type");
                        model.addColumn("Number of artists");
                        /****************************TODO*******************************/
                        JTable resultTable = new JTable(model);
                        JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "l":
                case "L":
                    {
                        model.addColumn("Top 5 artists");
                        model.addColumn("Areas with more than 10 groups");
                        String query1 = "create temporary table group_areas as(select IDArea from artist where artist.type = 'Group' group by IDArea having 10<count(*));";
                        String query2 = "create temporary table male_tracks as(select artist.ArtistName, count(*) as numTracks, artist.IDArtist, artist.IDArea " +
                                "from group_areas join artist using(IDArea) join artist_track using(IDArtist) where gender='Male' group by IDArtist order by IDArea);";
                        query = "select ArtistName,IDArea from(select ArtistName,IDArea, @area_rank := IF(@current_area = IDArea, @area_rank + 1, 1) as area_rank, " +
                                "@current_area := IDArea from male_tracks order by IDArea, numTracks desc) ranked where area_rank <=5;";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            Statement statement2 = connector.getConnection().createStatement();
                            statement2.executeQuery(query2);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("artistName"),
                                    resultSet.getString("IDArea")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "m":
                case "M":
                    {
                        model.addColumn("ID Artist");
                        model.addColumn("Artist Name");
                        String query1 = "create temporary table compilation(select IDMedium from artist_track join track using(IDTrack) " +
                                "group by IDMedium having count(distinct IDArtist)>1);";
                        String query2 = "create temporary table temp_tracks(select distinct IDTrack from compilation join track using(IDMedium));";
                        query = "select IDArtist, ArtistName from temp_tracks join artist_track using(IDTrack) join artist using(IDArtist) " +
                                "group by IDArtist order by count(*) desc limit 10;";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            Statement statement2 = connector.getConnection().createStatement();
                            statement2.executeQuery(query2);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("IDArtist"),
                                    resultSet.getString("ArtistName")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "n":
                case "N":
                    {
                        model.addColumn("Top10 Releases ID");
                        model.addColumn("Artists");
                        String query1 = "create temporary table release_info (select IDTrack, IDRelease, IDArtist " +
                                        "from track join artist_track using(IDTrack) join medium using(IDMedium) join releases using(IDRelease));";
                        String query2 = "create temporary table release_tracks(select IDRelease, count(distinct IDTrack) as track_num from release_info group by IDRelease);";
                        String query3 = "create temporary table tracks_per_artist(select IDRelease, count(*) as artist_track_num from release_info group by IDRelease, IDArtist);";
                        String query4 = "create temporary table albums(select distinct IDRelease from release_tracks " +
                                        "join tracks_per_artist using(IDRelease) where track_num = artist_track_num);";
                        query = "select IDRelease, count(distinct IDArtist) as collaborator_num from albums " +
                                "join release_info using(IDRelease) group by IDRelease order by collaborator_num desc limit 10;";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            Statement statement2 = connector.getConnection().createStatement();
                            statement2.executeQuery(query2);
                            Statement statement3 = connector.getConnection().createStatement();
                            statement3.executeQuery(query3);
                            Statement statement4 = connector.getConnection().createStatement();
                            statement3.executeQuery(query4);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("IDRelease"),
                                    resultSet.getString("collaborator_num")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "o":
                case "O":
                    {
                        model.addColumn("Release associated with the most mediums");
                        String query1 = "set @d = (select max(num) from (select count(*) as num from medium group by IDRelease) as maximum);";
                        query = "select releases.ReleaseName from  medium, releases where medium.IDRelease = releases.IDRelease " +
                                "group by medium.IDRelease having count(*) = @d;";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("ReleaseName")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "p":
                case "P":
                    {
                        model.addColumn("Most popular genre among groups");
                        String query1 = "create temporary table groups (select artist.IDArtist from artist, artist_genre where artist.type='Group' " +
                                        "and artist.IDArtist=artist_genre.IDArtist group by artist_genre.IDArtist having count(*) >= 3);";
                        query = "select genre.GenreName from artist_genre, groups, genre where artist_genre.IDArtist = groups.IDArtist " +
                                "and genre.IDGenre=artist_genre.IDGenre group by artist_genre.IDGenre order by count(*) desc limit 1;";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("genreName")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "q":
                case "Q":
                    {
                        model.addColumn("Recording");
                        model.addColumn("Count");
                        query = "select RecordingName, count(IDRecording) as num from recording " +
                                "group by RecordingName order by num desc limit 5;";
                        try {
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("RecordingName"),
                                    resultSet.getString("num")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "r":
                case "R":
                    {
                        model.addColumn("Artist ID");
                        model.addColumn("Track-Release Ratio");
                        String query1 = "create temporary table numTracks (select IDArtist, count(*) as totalTracks from artist_track group by IDArtist);";
                        String query2 = "create temporary table numReleases (select IDArtist, count(distinct IDRelease) as totalReleases from release_info group by IDArtist);";
                        query = "select numTracks.IDArtist, numTracks.totalTracks/numReleases.totalReleases as ratio " +
                                "from numTracks join numReleases using(IDArtist)";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            Statement statement2 = connector.getConnection().createStatement();
                            statement2.executeQuery(query2);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("IDArtist"),
                                                           resultSet.getString("ratio")});
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                case "s":
                case "S":
                    {
                        model.addColumn("Hit artists");
                        model.addColumn("Hit ability");
                        String query1 = "create temporary table hit_tracks as(select IDArtist,IDTrack,count(distinct IDMedium) as num " +
                                        "from artist_track join track using(IDTrack) group by IDTrack, IDArtist having count(distinct IDMedium)>100);";
                        query = "select IDArtist, sum(num)/count(IDTrack) from (select IDArtist from hit_artist group by IDArtist " +
                                "having count(distinct IDTrack)>10) hit_artist join hit_tracks using(IDArtist) where num>100 group by artist sum(num);";
                        try {
                            Statement statement1 = connector.getConnection().createStatement();
                            statement1.executeQuery(query1);
                            statement = connector.getConnection().createStatement();
                            resultSet = statement.executeQuery(query);
                            
                            while(resultSet.next()) {
                                model.addRow(new Object[] {resultSet.getString("IDArtist"),
                                    resultSet.getString("sum(num)/count(IDTrack)")}); /*Change the second row!!*/
                            }
                        } catch (SQLException sqle) {
                            System.err.println(sqle);
                        } finally {
                            try {
                                statement.close();
                            } catch (SQLException sqle) {
                                System.err.println(sqle);
                            }
                        }       JTable resultTable = new JTable(model);
                JOptionPane.showMessageDialog(null, new JScrollPane(resultTable));
                        break;
                    }
                default:
                    JOptionPane.showMessageDialog(null, "Available queries are A to S (a to s)!", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
    }//GEN-LAST:event_RunButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(QueriesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QueriesWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RunButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textQuery;
    // End of variables declaration//GEN-END:variables
}