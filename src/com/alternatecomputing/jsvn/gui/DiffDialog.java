package com.alternatecomputing.jsvn.gui;

import com.alternatecomputing.jsvn.command.Command;
import com.alternatecomputing.jsvn.command.Diff;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.util.Map;

/**
 *
 */
public class DiffDialog extends CommandDialog {
	private static final String DIALOG_TITLE = "Diff";
	private static final String DIALOG_CAPTION = "Diff Options";

	/**
     * constructor
     * @param parent parent frame
     * @param modal boolean indicating whether or not this dialog is modal
     */
        public DiffDialog(Frame parent, boolean modal) {
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
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(475, 225));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Revision:");
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
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 50, 0);
        jPanel1.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setText("Date:");
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionHandler(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.insets = new java.awt.Insets(31, 40, 0, 0);
        jPanel1.add(jRadioButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 37);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(31, 10, 4, 37);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.insets = new java.awt.Insets(27, 10, 1, 37);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField3, gridBagConstraints);

        jLabel1.setText("specify revision number ARG (or X:Y range)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.insets = new java.awt.Insets(1, 10, 38, 37);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("specify a date ARG (instead of a revision)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.insets = new java.awt.Insets(51, 10, 35, 37);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("passed as bundled options to GNU diff");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 37);
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Extensions:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(27, 60, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jCheckBox1.setText("Non-recursive");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 22, 0);
        jPanel1.add(jCheckBox1, gridBagConstraints);

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
		if (jRadioButton1.isSelected()) {
			if (jTextField1.getText().length() == 0) {
				args.put(Diff.REVISION, "BASE");
			} else {
				args.put(Diff.REVISION, jTextField1.getText());
			}
		}
		if (jRadioButton2.isSelected()) {
			args.put(Diff.REVISION, "{" + jTextField2.getText() + "}");
		}
		String extension = jTextField3.getText().trim();
		if (extension.length() > 0) {
			args.put(Diff.EXTENSIONS, extension);
		}
		if (jCheckBox1.isSelected()) {
			args.put(Diff.NONRECURSIVE, Boolean.TRUE);
		}
		args.put(Diff.TARGETS, getTargets());
		return new Diff();
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
		if (jRadioButton1.isSelected()) {
			String revision = jTextField1.getText().trim();
			if (revision.length() == 0) {
				jTextField1.setText(revision);
			}
		}
		if (jRadioButton2.isSelected()) {
			String date = jTextField2.getText().trim();
			// XXX validate date is in YYYY-MM-DD format using regex
			if (date.length() == 0) {
				JOptionPane.showMessageDialog(this.getContentPane(), "Must specify a date");
				return false;
			}
		}
		jTextField3.setText(jTextField3.getText().trim());
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables

}
