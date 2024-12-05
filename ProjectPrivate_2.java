import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ProjectPrivate_2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a TabPane to hold different calculators
        TabPane tabPane = new TabPane();

        // Create tabs for different sections of the app
        Tab basicMathTab = new Tab("Basic Math", createBasicMathTabContent());
        Tab trigTab = new Tab("Trigonometry", createTrigonometryTabContent());
        Tab quadraticTab = new Tab("Quadratic Solver", createQuadraticSolverTabContent());
        Tab sqrtCubeTab = new Tab("Square and Cube Roots", createSqrtCubeTabContent());
        Tab shapesTab = new Tab("2D & 3D Shapes", createShapesTabContent());
        Tab advancedMathTab = new Tab("Advanced Math", createAdvancedMathTabContent());

        // Add the tabs to the TabPane
        tabPane.getTabs().addAll(basicMathTab, trigTab, quadraticTab, sqrtCubeTab, shapesTab, advancedMathTab);

        // Set up the main scene with the TabPane
        Scene scene = new Scene(tabPane, 600, 600);
        primaryStage.setTitle("Math Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Basic Math (Addition, Subtraction, Multiplication, Division)
    private VBox createBasicMathTabContent() {
        VBox vbox = new VBox(10);

        TextField num1Field = new TextField();
        num1Field.setPromptText("Enter first number");

        TextField num2Field = new TextField();
        num2Field.setPromptText("Enter second number");

        TextField resultField = new TextField();
        resultField.setPromptText("Result");
        resultField.setEditable(false);

        // Create buttons for operations
        Button addBtn = new Button("Add");
        Button subtractBtn = new Button("Subtract");
        Button multiplyBtn = new Button("Multiply");
        Button divideBtn = new Button("Divide");

        // Button actions for math operations
        addBtn.setOnAction(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 + num2;
            resultField.setText("Result: " + result);
        });

        subtractBtn.setOnAction(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 - num2;
            resultField.setText("Result: " + result);
        });

        multiplyBtn.setOnAction(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 * num2;
            resultField.setText("Result: " + result);
        });

        divideBtn.setOnAction(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            if (num2 != 0) {
                double result = num1 / num2;
                resultField.setText("Result: " + result);
            } else {
                resultField.setText("Error: Division by zero");
            }
        });

        // Add all elements to the VBox
        vbox.getChildren().addAll(num1Field, num2Field, addBtn, subtractBtn, multiplyBtn, divideBtn, resultField);
        return vbox;
    }

    // Trigonometric Functions (Sin, Cos, Tan, etc.)
    private VBox createTrigonometryTabContent() {
        VBox vbox = new VBox(10);
        TextField angleField = new TextField();
        angleField.setPromptText("Enter angle (in degrees)");
        TextField resultField = new TextField();
        resultField.setPromptText("Result");
        resultField.setEditable(false);

        // Trigonometric buttons
        Button sinBtn = new Button("Sin");
        Button cosBtn = new Button("Cos");
        Button tanBtn = new Button("Tan");

        // Sine
        sinBtn.setOnAction(e -> {
            double angle = Double.parseDouble(angleField.getText());
            double result = Math.sin(Math.toRadians(angle));
            resultField.setText("Sin: " + result);
        });

        // Cosine
        cosBtn.setOnAction(e -> {
            double angle = Double.parseDouble(angleField.getText());
            double result = Math.cos(Math.toRadians(angle));
            resultField.setText("Cos: " + result);
        });

        // Tangent
        tanBtn.setOnAction(e -> {
            double angle = Double.parseDouble(angleField.getText());
            double result = Math.tan(Math.toRadians(angle));
            resultField.setText("Tan: " + result);
        });

        vbox.getChildren().addAll(angleField, sinBtn, cosBtn, tanBtn, resultField);
        return vbox;
    }

    // Quadratic Equation Solver
    private VBox createQuadraticSolverTabContent() {
        VBox vbox = new VBox(10);
        TextField aField = new TextField();
        aField.setPromptText("Enter 'a' coefficient");
        TextField bField = new TextField();
        bField.setPromptText("Enter 'b' coefficient");
        TextField cField = new TextField();
        cField.setPromptText("Enter 'c' coefficient");
        TextField resultField = new TextField();
        resultField.setPromptText("Result");
        resultField.setEditable(false);

        Button solveQuadraticBtn = new Button("Solve ax^2 + bx + c = 0");
        solveQuadraticBtn.setOnAction(e -> {
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            double c = Double.parseDouble(cField.getText());

            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                resultField.setText("Roots: " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                resultField.setText("Root: " + root);
            } else {
                resultField.setText("No real roots");
            }
        });

        vbox.getChildren().addAll(aField, bField, cField, solveQuadraticBtn, resultField);
        return vbox;
    }
    // Square and Cube Root
    private VBox createSqrtCubeTabContent() {
        VBox vbox = new VBox(10);
        TextField numberField = new TextField();
        numberField.setPromptText("Enter number");

        TextField resultField = new TextField();
        resultField.setPromptText("Result");
        resultField.setEditable(false);

        Button sqrtBtn = new Button("Square Root");
        Button cbrtBtn = new Button("Cube Root");

        // Square Root
        sqrtBtn.setOnAction(e -> {
            double number = Double.parseDouble(numberField.getText());
            double result = Math.sqrt(number);
            resultField.setText("Square Root: " + result);
        });

        // Cube Root
        cbrtBtn.setOnAction(e -> {
            double number = Double.parseDouble(numberField.getText());
            double result = Math.cbrt(number);
            resultField.setText("Cube Root: " + result);
        });

        vbox.getChildren().addAll(numberField, sqrtBtn, cbrtBtn, resultField);
        return vbox;
    }

    // 2D & 3D Shapes (Area, Volume, Surface Area)
    private VBox createShapesTabContent() {
        VBox vbox = new VBox(10);

        // 2D Shape - Rectangle
        TextField lengthField = new TextField();
        lengthField.setPromptText("Enter length of rectangle");
        TextField widthField = new TextField();
        widthField.setPromptText("Enter width of rectangle");
        TextField areaResultField = new TextField();
        areaResultField.setPromptText("Area");
        areaResultField.setEditable(false);

        Button calculateAreaBtn = new Button("Calculate Area");
        calculateAreaBtn.setOnAction(e -> {
            double length = Double.parseDouble(lengthField.getText());
            double width = Double.parseDouble(widthField.getText());
            double area = length * width;
            areaResultField.setText("Area: " + area);
        });

        // 3D Shape - Cube
        TextField sideField = new TextField();
        sideField.setPromptText("Enter side of cube");
        TextField volumeResultField = new TextField();
        volumeResultField.setPromptText("Volume");
        volumeResultField.setEditable(false);

        Button calculateVolumeBtn = new Button("Calculate Volume of Cube");
        calculateVolumeBtn.setOnAction(e -> {
            double side = Double.parseDouble(sideField.getText());
            double volume = Math.pow(side, 3);
            volumeResultField.setText("Volume: " + volume);
        });

        vbox.getChildren().addAll(lengthField, widthField, calculateAreaBtn, areaResultField, sideField, calculateVolumeBtn, volumeResultField);
        return vbox;
    }

    // Advanced Math (Factorial, Prime, LCM, HCF, Log, Permutations)
    private VBox createAdvancedMathTabContent() {
        VBox vbox = new VBox(10);

        // Factorial
        TextField factorialField = new TextField();
        factorialField.setPromptText("Enter number for factorial");

        TextField factorialResultField = new TextField();
        factorialResultField.setPromptText("Factorial Result");
        factorialResultField.setEditable(false);

        Button factorialBtn = new Button("Calculate Factorial");
        factorialBtn.setOnAction(e -> {
            int number = Integer.parseInt(factorialField.getText());
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            factorialResultField.setText("Factorial: " + result);
        });

        // Prime Check
        TextField primeField = new TextField();
        primeField.setPromptText("Enter number to check prime");

        TextField primeResultField = new TextField();
        primeResultField.setPromptText("Prime Check");
        primeResultField.setEditable(false);

        Button primeBtn = new Button("Check Prime");
        primeBtn.setOnAction(e -> {
            int number = Integer.parseInt(primeField.getText());
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            primeResultField.setText(isPrime ? "Prime" : "Not Prime");
        });

        vbox.getChildren().addAll(factorialField, factorialBtn, factorialResultField, primeField, primeBtn, primeResultField);
        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
