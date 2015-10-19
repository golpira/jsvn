package com.alternatecomputing.jsvn.gui;

import com.alternatecomputing.jsvn.command.Command;
import com.alternatecomputing.jsvn.command.Log;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.util.Map;

/**
 *
 */
public class LogDialog extends CommandDialog {
	private static final String DIALOG_TITLE = "Log";
	private static final String DIALOG_CAPTION = "Log Options";

	/**
     * constructor
     * @param parent parent frame
     * @param modal boolean indicating whether or not this dialog is modal
     */
        public LogDialog(Frame parent, boolean modal) {
            super(parent, modal);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 220));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Revision");
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionHandler(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.insets = new java.awt.Insets(39, 20, 50, 0);
        jPanel1.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setText("Date");
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionHandler(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.insets = new java.awt.Insets(31, 20, 0, 0);
        jPanel1.add(jRadioButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(39, 10, 0, 32);
        jPanel1.add(jTextField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(31, 10, 4, 32);
        jPanel1.add(jTextField2, gridBagConstraints);

        jLabel1.setText("specify revision number ARG (or X:Y range)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 10, 38, 32);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("specify a date ARG (instead of a revision)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(51, 10, 30, 32);
        jPanel1.add(jLabel2, gridBagConstraints);

        jCheckBox1.setText("Verbose");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.insets = new java.awt.Insets(19, 20, 0, 0);
        jPanel1.add(jCheckBox1, gridBagConstraints);

        jCheckBox2.setText("Quiet");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.insets = new java.awt.Insets(16, 20, 36, 0);
        jPanel1.add(jCheckBox2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    private void actionHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionHandler
        actionPerformed(evt);
    }//GEN-LAST:event_actionHandler

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm

    }//GEN-LAST:event_exitForm

    /**
	 * creates the appropriate command to run and populated the given Map with appropriate arguments to configure the command
     * @param args map of arguments to be passed into the returned command
     * @return implementation of Command to execute with the given configured args
     */
    protected Command buildCommand(Map args) {
		String revision = jTextField1.getText().trim();
		if (jRadioButton1.isSelected() && revision.length() > 0) {
			args.put(Log.REVISION, revision);
		}
		String date = jTextField2.getText().trim();
		if (jRadioButton2.isSelected() && date.length() > 0) {
			args.put(Log.REVISION, "{" + date + "}");
		}
		if (jCheckBox1.isSelected()) {
			args.put(Log.VERBOSE, Boolean.TRUE);
		}
		if (jCheckBox2.isSelected()) {
			args.put(Log.QUIET, Boolean.TRUE);
		}
		args.put(Log.TARGETS, getTargets());
		return new Log();
    }

    /**
	 * gets the captions to be displayed in the options panel
     * @return options panel caption
     */
    protected String getDialogCaption() {
        return DIALOG_CAPTION;
    }

    /**
	 * gets the title of the dialog
     * @return dialog title
     */
    protected String getDialogTitle() {
        return DIALOG_TITLE;
    }

    /**
	 * gets the panel in which all options for the command are configured
     * @return options panel
     */
    protected JPanel getOptionsPanel() {
        initComponents();
        return jPanel1;
    }

    /**
	 * determines whether the selected options are valid before the command is allowed to execute
     * @return options validity indicator
     */
    protected boolean isValidOptions() {
		// XXX validate date is in YYYY-MM-DD format using regex
		return true;
    }

	/**
	 * Invoked when an action occurs.
	 */
	public void actionPerformed(ActionEvent e) {
		if ("Revision".equals(e.getActionCommand())) {
			jTextField2.setEnabled(false);
			jTextField1.setEnabled(true);
		} else if ("Date".equals(e.getActionCommand())) {
			jTextField2.setEnabled(true);
			jTextField1.setEnabled(false);
		}

	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables

}
