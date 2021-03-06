/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MusicTunerWidget;

import java.awt.Frame;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
public class MP3TunerMusicPlayer extends javax.swing.JDialog {

    /**
     * Creates new form MP3TunerMusicPlayer
     */
    MP3MainMethod MC = new MP3MainMethod();
    
    public static int count;
    
    int xMouse;
    int yMouse;
    
    int width = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 185;
    int height = Toolkit.getDefaultToolkit().getScreenSize().height - 180;
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public MP3TunerMusicPlayer(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        
        this.setLocation(width, height);
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Wallpaper = new javax.swing.JLabel();
        Pre_Set = new javax.swing.JLabel();
        StationName = new javax.swing.JLabel();
        StationFrequency = new javax.swing.JLabel();
        FrequencyIndicator = new javax.swing.JLabel();
        FequencyRange = new javax.swing.JLabel();
        TunerDial = new javax.swing.JLabel();
        VolumeButton = new javax.swing.JLabel();
        BalanceButton = new javax.swing.JLabel();
        RepeatSong = new javax.swing.JLabel();
        RewindBack = new javax.swing.JLabel();
        Play = new javax.swing.JLabel();
        SongTime = new javax.swing.JLabel();
        Pause = new javax.swing.JLabel();
        stop = new javax.swing.JLabel();
        Fastforward = new javax.swing.JLabel();
        OpenPlayList = new javax.swing.JLabel();
        BassControl = new javax.swing.JLabel();
        Treble = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        TunerOn = new javax.swing.JLabel();
        TunerOff = new javax.swing.JLabel();
        ArtistSong = new javax.swing.JTextField();
        BackGroundLayout = new javax.swing.JLabel();

        setBackground(new java.awt.Color(119, 113, 30));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 284, 70, 30));
        getContentPane().add(Pre_Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 284, 60, 30));
        getContentPane().add(StationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 284, 80, 30));

        StationFrequency.setText(" ");
        getContentPane().add(StationFrequency, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 40, 30));
        getContentPane().add(FrequencyIndicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 284, 0, 30));

        FequencyRange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MusicTunerWidget/MP3_tuner_music_player Tuner indicator_3.png"))); // NOI18N
        getContentPane().add(FequencyRange, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 160, 30));

        TunerDial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MusicTunerWidget/Red Dot_Music_Player_Mac5_3.png"))); // NOI18N
        getContentPane().add(TunerDial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 100, 100));

        VolumeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MusicTunerWidget/MP3_tuner_music_playerNewVersionButtonResize.png"))); // NOI18N
        VolumeButton.setText(" ");
        getContentPane().add(VolumeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 10, 20, 150));

        BalanceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MusicTunerWidget/MP3_tuner_music_playerNewVersionButtonResize.png"))); // NOI18N
        BalanceButton.setText(" ");
        getContentPane().add(BalanceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 10, 20, 150));

        RepeatSong.setText(" ");
        RepeatSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RepeatSongMouseReleased(evt);
            }
        });
        getContentPane().add(RepeatSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 10, -1));

        RewindBack.setText(" ");
        getContentPane().add(RewindBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 124, 20, 20));

        Play.setText(" ");
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PlayMouseReleased(evt);
            }
        });
        getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 124, 10, 20));

        SongTime.setText(" ");
        getContentPane().add(SongTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 110, 40, 10));

        Pause.setText(" ");
        Pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PauseMouseReleased(evt);
            }
        });
        getContentPane().add(Pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 124, 20, 20));

        stop.setText(" ");
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stopMouseReleased(evt);
            }
        });
        getContentPane().add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 124, 20, 20));

        Fastforward.setText(" ");
        getContentPane().add(Fastforward, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 124, 20, 20));

        OpenPlayList.setText(" ");
        getContentPane().add(OpenPlayList, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 120, 20, -1));

        BassControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MusicTunerWidget/MP3_tuner_music_playerNewVersionButtonResize.png"))); // NOI18N
        BassControl.setText(" ");
        getContentPane().add(BassControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 14, 20, 150));

        Treble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MusicTunerWidget/MP3_tuner_music_playerNewVersionButtonResize.png"))); // NOI18N
        Treble.setText(" ");
        getContentPane().add(Treble, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 20, 20, 140));

        close.setText(" ");
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 70, 10, -1));

        TunerOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MusicTunerWidget/Red Dot_Music_Player_Mac_1.png"))); // NOI18N
        TunerOn.setText("jLabel1");
        getContentPane().add(TunerOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 20, 20));

        TunerOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MusicTunerWidget/Red Dot_Music_Player_Mac3.png"))); // NOI18N
        TunerOff.setText("jLabel1");
        getContentPane().add(TunerOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 20, 20));

        ArtistSong.setBackground(new java.awt.Color(171, 177, 129));
        ArtistSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistSongActionPerformed(evt);
            }
        });
        getContentPane().add(ArtistSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 180, 20));

        BackGroundLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MusicTunerWidget/adni18_Music_Player 2 Mac.png"))); // NOI18N
        BackGroundLayout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackGroundLayoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackGroundLayoutMouseReleased(evt);
            }
        });
        BackGroundLayout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackGroundLayoutMouseDragged(evt);
            }
        });
        getContentPane().add(BackGroundLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 511, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackGroundLayoutMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGroundLayoutMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BackGroundLayoutMouseDragged

    private void BackGroundLayoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGroundLayoutMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackGroundLayoutMousePressed

    private void ArtistSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistSongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArtistSongActionPerformed

    private void stopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseReleased
        // TODO add your handling code here:
        MC.Stop();
    }//GEN-LAST:event_stopMouseReleased

    private void PlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseReleased
        // TODO add your handling code here:
         MC.Resume();
    }//GEN-LAST:event_PlayMouseReleased

    private void PauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseMouseReleased
        // TODO add your handling code here:
        MC.Pause();
    }//GEN-LAST:event_PauseMouseReleased

        
        
    private void BackGroundLayoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGroundLayoutMouseReleased
        // TODO add your handling code here:
        FileFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3", "mpeg3"); 
       
       JFileChooser chooser = new JFileChooser("C:\\Eircom hub");
       chooser.addChoosableFileFilter(filter);
       
       int returnVal = chooser.showOpenDialog(null);
       
       if(returnVal == JFileChooser.APPROVE_OPTION)
       {
          MC.Stop();
          File myFile = chooser.getSelectedFile();
          String song = myFile + "";
          
         // String name = chooser.getSelectedFile().getName();
         // Display.setText(name);
          String name = chooser.getSelectedFile().getName();
          ArtistSong.setText(name);
          
          MC.Play(song);
       }
    }//GEN-LAST:event_BackGroundLayoutMouseReleased

    private void RepeatSongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepeatSongMouseReleased
        // TODO add your handling code here:
        switch(count){
            case 0:
                count = 1;
                RepeatSong.setText("Repeat Song on");
                break;
            case 1:
                count = 0;
                RepeatSong.setText("Repeat Song off");
                break;
        }
    }//GEN-LAST:event_RepeatSongMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) // MAIN METHOD
    {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MP3TunerMusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MP3TunerMusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MP3TunerMusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3TunerMusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                MP3TunerMusicPlayer dialog = new MP3TunerMusicPlayer(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ArtistSong;
    private javax.swing.JLabel BackGroundLayout;
    private javax.swing.JLabel BalanceButton;
    private javax.swing.JLabel BassControl;
    private javax.swing.JLabel Fastforward;
    private javax.swing.JLabel FequencyRange;
    private javax.swing.JLabel FrequencyIndicator;
    private javax.swing.JLabel OpenPlayList;
    private javax.swing.JLabel Pause;
    private javax.swing.JLabel Play;
    private javax.swing.JLabel Pre_Set;
    private javax.swing.JLabel RepeatSong;
    private javax.swing.JLabel RewindBack;
    private javax.swing.JLabel SongTime;
    private javax.swing.JLabel StationFrequency;
    private javax.swing.JLabel StationName;
    private javax.swing.JLabel Treble;
    private javax.swing.JLabel TunerDial;
    private javax.swing.JLabel TunerOff;
    private javax.swing.JLabel TunerOn;
    private javax.swing.JLabel VolumeButton;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JLabel close;
    private javax.swing.JLabel stop;
    // End of variables declaration//GEN-END:variables
}
