module com.sumarnumeros {
    // este modulo nos sirve para declarar las dependencias que tiene nuestro proyecto, es decir, que librerias vamos a usar
    // las librerias que vamos a usar son javafx.controls y javafx.fxml, estas librerias nos permiten crear interfaces graficas de usuario (GUI) y manejar eventos en nuestra aplicacion
    // javafx.controls nos permite crear botones, etiquetas, cuadros de texto, etc. mientras que javafx.fxml nos permite crear interfaces graficas de usuario utilizando archivos FXML, que son archivos XML que describen la estructura de la interfaz grafica de usuario
    requires javafx.controls;
    // javafx.fxml es necesario para poder usar FXML en nuestro proyecto, ya que FXML es una parte fundamental de JavaFX y nos permite separar la logica de la interfaz grafica de usuario, lo que hace que nuestro codigo sea mas limpio y facil de mantener
    requires javafx.fxml;
    // opens com.sumarnumeros to java fx.fxml; es necesario para que el modulo javafx.fxml pueda acceder a las clases y recursos de nuestro proyecto, ya que javafx.fxml necesita acceder a las clases y recursos de nuestro proyecto para poder cargar los archivos FXML y crear la interfaz grafica de usuario
    // exports com.sumarnumeros; es necesario para que otras modules puedan acceder a las clases y recursos de nuestro proyecto, ya que si no exportamos nuestro modulo, otras modules no podran acceder a las clases y recursos de nuestro proyecto, lo que hace que nuestro proyecto sea inutilizable para otras modules
    opens com.sumarnumeros to javafx.fxml;
    // exports com.sumarnumeros; es necesario para que otras modules puedan acceder a las clases y recursos de nuestro proyecto, ya que si no exportamos nuestro modulo, otras modules no podran acceder a las clases y recursos de nuestro proyecto, lo que hace que nuestro proyecto sea inutilizable para otras modules
    exports com.sumarnumeros;
}
