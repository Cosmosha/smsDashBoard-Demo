/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagedashboard;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author cosmo
 */
public class DashBoardController implements Initializable {

    @FXML
    private JFXButton savebtn;
    @FXML
    private JFXButton cancelBtn;
   
    @FXML
    private TextArea MsgTxtB;
    @FXML
    private JFXButton msgButton;
    @FXML
    private JFXCheckBox allContacts;
    @FXML
    private TextField conTxt;
   
    @FXML
    private TextField phoneTxt;
    @FXML
    private TextField nameTxt;
    @FXML
    private JFXButton addBtn;
    @FXML
    private JFXButton clearBtn;

    @FXML
    private ImageView imgSettings,imgAdd,imgMsg,imgContact,imgPower, imgHide;
    
    @FXML
    private AnchorPane settings,user,message,member;
    
    @FXML
    private void handleButtonAction(MouseEvent event){
          if(event.getTarget()== imgSettings){
            settings.setVisible(true);
            user.setVisible(false);
            message.setVisible(false);
            member.setVisible(false);
          }
          else
              if(event.getTarget()==imgAdd){
                  member.setVisible(true);
                  settings.setVisible(false);
                  user.setVisible(false);
                  message.setVisible(false);
              }
           else
              if(event.getTarget()==imgMsg){
                  message.setVisible(true);
                  settings.setVisible(false);
                  user.setVisible(false);
                  member.setVisible(false);
              }
           else
              if(event.getTarget()==imgContact){
                  user.setVisible(true);
                  settings.setVisible(false);
                  member.setVisible(false);
                  message.setVisible(false);
              }
           else
              if(event.getTarget()==imgPower){
                  System.exit(0);
              }
          else
              if(event.getTarget()==imgHide){
                  user.setVisible(false);
                  settings.setVisible(false);
                  member.setVisible(false);
                  message.setVisible(false);
              }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cancelBtn(ActionEvent event) {
    }

    @FXML
    private void SendMsgBtn(ActionEvent event) {
    }

    @FXML
    private void addBtn(ActionEvent event) {
    }

    @FXML
    private void clearBtn(ActionEvent event) {
    }
    
}
