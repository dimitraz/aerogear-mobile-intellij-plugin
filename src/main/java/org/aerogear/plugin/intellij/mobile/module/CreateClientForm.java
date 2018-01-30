package org.aerogear.plugin.intellij.mobile.module;

import org.aerogear.plugin.intellij.mobile.constants.Constants;
import com.intellij.openapi.ui.ComboBox;

import javax.swing.*;
import java.awt.*;

public class CreateClientForm extends JPanel {
  private JPanel clientPanel;
  private JTextField clientNameTxtField;
  private JComboBox clientTypesComboBox;
  private JLabel clientNameLabel;
  private JLabel clientTypeLabel;

  public CreateClientForm() {
    super();
    this.setLayout(new FlowLayout(FlowLayout.LEFT));
    add(clientPanel);
  }


  private void createUIComponents() {
    clientTypesComboBox = new ComboBox(Constants.CLIENT_TYPES);

  }
}
