//Jessica Long-Heinicke 3.2.25 CSD 402
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Demonstrates the use of the JavaFX VBox layout pane.
 * This example creates a vertical registration form with labels,
 * text fields, and a submit button. The text fields expand vertically.
 */
public class VBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a VBox with 10px spacing between children
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20)); // 20px padding around the VBox
        vbox.setAlignment(Pos.TOP_LEFT); // Align children to the top-left

        // Create form components
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        Button submitButton = new Button("Submit");

        // Allow email field to expand vertically
        VBox.setVgrow(emailField, Priority.ALWAYS);
        emailField.setMaxHeight(Double.MAX_VALUE); // Fill available vertical space

        // Center the submit button horizontally
        vbox.setAlignment(Pos.CENTER); // Overrides previous TOP_LEFT alignment for the entire pane
        submitButton.setMaxWidth(Double.MAX_VALUE); // Stretch button to full width

        // Add components to the VBox
        vbox.getChildren().addAll(
                nameLabel, nameField,
                emailLabel, emailField,
                submitButton
        );

        // Set up the scene and stage
        Scene scene = new Scene(vbox, 300, 300);
        primaryStage.setTitle("VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}