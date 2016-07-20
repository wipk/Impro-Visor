/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lstm.main;
import imp.gui.Notate;
import imp.gui.WindowRegistry;
import imp.util.NonExistentParameterException;
import imp.util.Preferences;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
/**
 *
 * @author cssummer16
 */
public class LSTMNetworkFrame extends javax.swing.JFrame {
    
    private LSTMGen lstmGen;
    private Notate notate;
    private File paramfile;
    
    private final String LSTM_GEN_PARAMS_PREFKEY = "lstm-gen-params";
    /**
     * Creates new form LSTMNetworkFrame
     */
    public LSTMNetworkFrame(Notate n, LSTMGen gen) {
        notate = n;
        lstmGen = gen;
        initComponents();
        
        try {
            String last_pref_path = Preferences.getPreferenceQuietly(LSTM_GEN_PARAMS_PREFKEY);
            paramfile = new File(last_pref_path);
            filePathLabel.setText(paramfile.getAbsolutePath());
            loadButton.setEnabled(true);
        } catch (NonExistentParameterException ex) {
            paramfile = null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        paramFileChooser = new javax.swing.JFileChooser();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        statusSeparator = new javax.swing.JSeparator();
        infoLabel = new javax.swing.JLabel();
        statusFiller = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        paramPanel = new javax.swing.JPanel();
        filePathLabel = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();

        paramFileChooser.setAcceptAllFileFilterUsed(false);
        paramFileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("LSTM Network Parameters file", "nnpz"));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LSTM Network Control Panel");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        statusPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));
        statusPanel.setLayout(new java.awt.GridBagLayout());

        statusLabel.setText("<html>The network parameters are not loaded.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 10);
        statusPanel.add(statusLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        statusPanel.add(statusSeparator, gridBagConstraints);

        infoLabel.setText("<html>To load a parameter file, click <i>Browse</i>, select an LSTM parameter file (extension .nnpz), and then click <i>Load Parameters</i>.");
        infoLabel.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 10);
        statusPanel.add(infoLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        statusPanel.add(statusFiller, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(statusPanel, gridBagConstraints);

        paramPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Network Parameters"));
        paramPanel.setLayout(new java.awt.GridBagLayout());

        filePathLabel.setText("No parameters file selected.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        paramPanel.add(filePathLabel, gridBagConstraints);

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        paramPanel.add(browseButton, gridBagConstraints);

        loadButton.setText("Load Parameters");
        loadButton.setEnabled(false);
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        paramPanel.add(loadButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(paramPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        notate.setLSTMModeEnabled(false);
        if(paramfile == null)
            throw new RuntimeException("Parameters file was null! Can't load!");
        try {
            lstmGen.loadFromPath(paramfile.getAbsolutePath());
            statusLabel.setText("<html>Network parameters loaded successfully!");
            notate.setLSTMModeEnabled(true);
        } catch (InvalidParametersException ex) {
            statusLabel.setText("<html>Could not load the parameters file.");
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        int dialogResult = paramFileChooser.showOpenDialog(this);
        if(dialogResult == JFileChooser.APPROVE_OPTION){
            paramfile = paramFileChooser.getSelectedFile();
            filePathLabel.setText(paramfile.getAbsolutePath());
            loadButton.setEnabled(true);
            Preferences.setPreference(LSTM_GEN_PARAMS_PREFKEY, paramfile.getAbsolutePath());
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    public void closeWindow() {
        this.setVisible(false);
        WindowRegistry.unregisterWindow(this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel filePathLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton loadButton;
    private javax.swing.JFileChooser paramFileChooser;
    private javax.swing.JPanel paramPanel;
    private javax.swing.Box.Filler statusFiller;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JSeparator statusSeparator;
    // End of variables declaration//GEN-END:variables
}
