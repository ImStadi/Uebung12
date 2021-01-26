/**
 * @author Stadler Andre
 * @version 21.1.2021
 */
package viewC;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.ColorCalc;
import model.ColorCode;
import java.io.IOException;
public class Controller
{                                                                   // Ich habe diesen Controller mit Hilfe von Schüler Sperr programmiert!

    ColorCalc colorCalc = new ColorCalc();

    @FXML
    TextField red_txt;
    @FXML
    TextField green_txt;
    @FXML
    TextField blue_txt;
    @FXML
    Label hex_lbl;
    @FXML
    Pane color_pane;
    Label label = new Label();

    public void Red_Plus()
    {

        colorCalc.changeColorViaRelativValue(ColorCode.RED, 10);
        red_txt.setText(String.valueOf(colorCalc.getRed()));
        hex_lbl.setText("HexCode: " + colorCalc.getHex());
        color_pane.setStyle("-fx-background-color: " + colorCalc.getHex() + ";");
    }
    public void Red_Minus()
    {
        colorCalc.changeColorViaRelativValue(ColorCode.RED, -10);
        red_txt.setText(String.valueOf(colorCalc.getRed()));
        hex_lbl.setText("HexCode: " + colorCalc.getHex());
        color_pane.setStyle("-fx-background-color: " + colorCalc.getHex() + ";");
    }
    public void Red_Absolute()
    {
        colorCalc.changeColorViaAbsoluteValue(ColorCode.RED, red_txt.getText());
        red_txt.setText(String.valueOf(colorCalc.getRed()));
        hex_lbl.setText("HexCode: " + colorCalc.getHex());
        color_pane.setStyle("-fx-background-color: " + colorCalc.getHex() + ";");
    }

    public void Green_Plus()
    {
        colorCalc.changeColorViaRelativValue(ColorCode.GREEN, 10);
        green_txt.setText(String.valueOf(colorCalc.getGreen()));
        hex_lbl.setText("HexCode: " + colorCalc.getHex());
        color_pane.setStyle("-fx-background-color: " + colorCalc.getHex() + ";");
    }
    public void Green_Minus()
    {
        colorCalc.changeColorViaRelativValue(ColorCode.GREEN, -10);
        green_txt.setText(String.valueOf(colorCalc.getGreen()));
        hex_lbl.setText("HexCode: " + colorCalc.getHex());
        color_pane.setStyle("-fx-background-color: " + colorCalc.getHex() + ";");
    }
    public void Green_Absolute()
    {
        colorCalc.changeColorViaAbsoluteValue(ColorCode.GREEN, green_txt.getText());
        green_txt.setText(String.valueOf(colorCalc.getGreen()));
        hex_lbl.setText("HexCode: " + colorCalc.getHex());
        color_pane.setStyle("-fx-background-color: " + colorCalc.getHex() + ";");
    }

    public void Blue_Plus()
    {
        colorCalc.changeColorViaRelativValue(ColorCode.BLUE, 10);
        blue_txt.setText(String.valueOf(colorCalc.getBlue()));
        hex_lbl.setText("HexCode: " + colorCalc.getHex());
        color_pane.setStyle("-fx-background-color: " + colorCalc.getHex() + ";");
    }
    public void Blue_Minus()
    {
        colorCalc.changeColorViaRelativValue(ColorCode.BLUE, -10);
        blue_txt.setText(String.valueOf(colorCalc.getBlue()));
        hex_lbl.setText("HexCode: " + colorCalc.getHex());
        color_pane.setStyle("-fx-background-color: " + colorCalc.getHex() + ";");
    }
    public void Blue_Absolute()
    {
        colorCalc.changeColorViaAbsoluteValue(ColorCode.BLUE, blue_txt.getText());
        blue_txt.setText(String.valueOf(colorCalc.getBlue()));
        hex_lbl.setText("HexCode: " + colorCalc.getHex());
        color_pane.setStyle("-fx-background-color: " + colorCalc.getHex() + ";");
    }


    public static void show(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("ColorCalcV.fxml"));
            Parent root = fxmlLoader.load();

            stage.setTitle("ColorCalc");
            stage.setScene(new Scene(root, 700, 260));
            stage.show();
        }
        catch (IOException e) {
            System.err.println("Something wrong with ColorCalcV.fxml: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }


}
