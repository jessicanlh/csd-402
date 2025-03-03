//Jessica Long-Heinicke 3.2.25 CSD 402
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 * Demonstrates the use of the JavaFX HBox layout pane.
 * This example creates a horizontal toolbar with three buttons,
 * custom spacing, padding, and dynamic resizing behavior.
 */
public class HBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create an HBox with 10px spacing between children
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(15)); // 15px padding around the HBox
        hbox.setAlignment(Pos.CENTER); // Center children vertically and horizontally

        // Create buttons
        Button btn1 = new Button("File");
        Button btn2 = new Button("Edit");
        Button btn3 = new Button("View");

        // Apply a custom left margin to the first button
        HBox.setMargin(btn1, new Insets(0, 0, 0, 20)); // Left margin: 20px

        // Allow the first button to expand horizontally
        HBox.setHgrow(btn1, Priority.ALWAYS);
        btn1.setMaxWidth(Double.MAX_VALUE); // Stretch to fill available space

        // Add buttons to the HBox
        hbox.getChildren().addAll(btn1, btn2, btn3);

        // Set up the scene and stage
        Scene scene = new Scene(hbox, 400, 100);
        primaryStage.setTitle("HBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}