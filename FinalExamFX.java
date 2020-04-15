/**
 *
 * @author Amanda Tustin
 */

package finalexam;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FinalExamFX extends Application 
{
    private final ArrayList<String> binaryArray = new ArrayList();
    //button, label, textfield created
    Button btnConvert = new Button();
    Label lblEnter = new Label("Please enter a valid integer.");
    TextField tfEntry = new TextField();
    StringBuffer sb = new StringBuffer();
    String binaryNumber;
    
    FinalExamClass fec = new FinalExamClass();
    
    @Override
    public void start(Stage primaryStage) 
    {
        //set button text
        btnConvert.setText("Convert");
        
        //set event handler (using lambda)
        btnConvert.setOnAction((ActionEvent event) -> 
        {
            try
            {
                fec.setEntryNumber(parseInt(tfEntry.getText()));
                //JOptionPane.showMessageDialog(null, fec.getEntryNumber());
                
                String res = Integer.toString(FinalExamClass.binary(fec.getEntryNumber()));

                binaryArray.add(res);
                for(int i = 0; i < binaryArray.size(); i++)
                {
                    sb.append(binaryArray.get(i));
                }
                binaryNumber = sb.toString();
                if(fec.getEntryNumber() == 0)
                {
                    binaryNumber = "0";
                }
                if(fec.getEntryNumber() == 1)
                {
                    binaryNumber = "1";
                }
                JOptionPane.showMessageDialog(null, binaryNumber);
                
            }
            catch(IllegalArgumentException iae)
            {
                JOptionPane.showMessageDialog(null, "Invalid entry.");
                tfEntry.clear();
            }
            
        });
        
        VBox daBox = new VBox();
        daBox.setAlignment(Pos.CENTER);
        daBox.setStyle("-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black");
        daBox.getChildren().addAll(lblEnter, tfEntry, btnConvert);
        
        Scene scene = new Scene(daBox, 300, 250);
        
        primaryStage.setTitle("Final Exam - Amanda Tustin");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
