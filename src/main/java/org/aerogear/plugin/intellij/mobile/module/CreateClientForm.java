package org.aerogear.plugin.intellij.mobile.module;

import com.intellij.uiDesigner.core.GridLayoutManager;
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

    add(clientPanel, FlowLayout.LEFT);
  }


  private void createUIComponents() {
    clientTypesComboBox = new ComboBox(Constants.CLIENT_TYPES);
//    for (String clientType : Constants.CLIENT_TYPES) {
//      clientTypesComboBox.addItem(clientType);
//    }
  }
}
