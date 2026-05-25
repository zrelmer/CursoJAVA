package com.suma;
/* stage representa la ventana de la aplicación, es el contenedor principal de la interfaz gráfica. 
Es el punto de entrada para mostrar cualquier contenido en la pantalla. En JavaFX, se utiliza para configurar y mostrar 
la ventana principal de la aplicación.*/
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class Main extends Application {
    // El método start es el punto de entrada de la aplicación JavaFX. Es un método abstracto que debe ser 
    // implementado por cualquier clase que extienda Application.
    // suppersWarnings("all") es una anotación que se utiliza para suprimir todas las advertencias del compilador en el método start. Esto puede ser útil durante el desarrollo para evitar que las advertencias distraigan, pero no se recomienda su uso en código de producción, ya que puede ocultar problemas potenciales.
    @SuppressWarnings("all")
    // override indica que este método está sobrescribiendo un método de la clase padre (Application).
    @Override
    // El método start se llama automáticamente cuando se inicia la aplicación JavaFX. Recibe un objeto Stage como parámetro, que representa la ventana principal de la aplicación.
    public void start(Stage stage){
        // En este punto, se pueden agregar elementos a la interfaz gráfica, configurar la ventana, etc. En este ejemplo, se crea una etiqueta (Label) con el texto "Resultado: ".
        Label txtResultado = new Label("Resultado: ");
        TextField inputNum1 = new TextField();
        inputNum1.setPromptText("Ingrese el primer numero");
        TextField inputNum2 = new TextField();
        inputNum2.setPromptText("Ingrese el segundo numero");
        Button btnSumar = new Button("Sumar");

        // evento sumar boton
        btnSumar.setOnAction(e -> {
            try{
                int num1 = Integer.parseInt(inputNum1.getText());
                int num2 = Integer.parseInt(inputNum2.getText());
                int suma = num1 + num2;
                txtResultado.setText("Resultado:" + suma);
            }catch(NumberFormatException ex){
                txtResultado.setText("Error: Por favor ingrese numeros validos");
            }
        });

        // Aquí se pueden agregar los elementos a un contenedor (como un VBox o HBox) y luego configurar el escenario (stage) para mostrar la ventana con la interfaz gráfica.
        /*
        Para qué sirve: Crea un contenedor inteligente llamado layout de tipo VBox (Vertical Box). Su propiedad principal es colocar los elementos en forma de columna (uno debajo del otro).

        El número 15: Define el espaciado interno (spacing) en píxeles. Significa que el contenedor dejará automáticamente una separación de 15 píxeles de aire entre cada elemento para que no se vean amontonados.

        Los parámetros siguientes: Es la lista de componentes que quieres meter adentro en orden de aparición (primero el cuadro del número 1, abajo el del número 2, luego el botón y al final el texto del resultado).
                
        */
        VBox layout = new VBox(15, inputNum1, inputNum2, btnSumar, txtResultado);
        /* 
        Para qué sirve: Define la posición de los elementos dentro del contenedor.

        Significado: Al usar Pos.CENTER, le ordenas a JavaFX que todo el bloque de componentes se mantenga perfectamente centrado, tanto vertical como horizontalmente, sin importar si el usuario estira o encoge la ventana.
        */
        layout.setAlignment(Pos.CENTER);

        /* 
        Te permite aplicar diseño visual a tus componentes utilizando una sintaxis muy similar a CSS (la tecnología que se usa para diseñar páginas web), anteponiendo el prefijo -fx-.

        -fx-padding: 20;: Agrega un margen interno de 20 píxeles entre los bordes de la ventana y tus componentes. Evita que los cuadros de texto toquen las esquinas de la ventana.

        -fx-background-color: #f0f0f0;: Cambia el color de fondo del contenedor. El código #f0f0f0 es un tono gris claro y limpio, reemplazando el fondo blanco o gris oscuro por defecto.
        
        */
        layout.setStyle("-fx-padding: 20; -fx-background-color: #f0f0f0;");

        // Se crea una escena (Scene) con el contenedor (layout) y se establece en el escenario (stage). Luego, se muestra la ventana.
        /* 
        Para qué sirve: Crea la superficie de contenido (Scene) y la coloca dentro de la ventana física (stage).

        Los números 300, 280: Definen el tamaño inicial de tu ventana en píxeles. El primer valor es el ancho (300px) y el segundo es el alto (280px).

        layout: Le indica a la escena que su contenido principal será el contenedor vertical que acabamos de estilizar.
        
        */
        stage.setScene(new javafx.scene.Scene(layout, 300, 280));
        /*
        Para qué sirve: Establece el texto oficial que aparecerá en la barra superior de la ventana (al lado del icono del programa, arriba a la izquierda).
        */
        stage.setTitle("Suma de dos numeros");
        /* 
        Desplegar la Aplicación en Pantalla: Finalmente, el método show() hace que la ventana se muestre en la pantalla. Sin esta línea, la aplicación se ejecutaría pero no verías ninguna ventana.
        */
        stage.show();



    }
    // El método main es el punto de entrada de la aplicación Java. En este caso, se llama al método launch(args) que inicia la aplicación JavaFX.
    public static void main(String[] args) {
        launch(args); // Inicia la aplicación JavaFX
    }
}