package informatico.to.navegationybtncompartir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //creanos una variable de la clase button
    Button btnnavegar, btncompatir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Instanciamos la variable de la clase con el
        id del control de la vista*/
        btncompatir = (Button) findViewById(R.id.btncompartir);
        /*Creamos el metodo del button */
        btncompatir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Creamos un objeto de Intent e instanciamos con la
                acccion a realizar con el metodo ACTION_SEND*/
                Intent intent = new Intent(Intent.ACTION_SEND);
                /*Indicamos el tipo de dato texto*/
                intent.setType("text/plain");
                /*Lanzamos las opciones y el titulo */
                startActivity(Intent.createChooser(intent, "Compartir con ")); }});

        //instanciamos al boton con el id del control de la vista
        btnnavegar=(Button)findViewById(R.id.boton_navegacion);

        /*hacemos el llamado para que el boton este siempre escuchando y
        pendiente de que al momento de hacer clic cumpla la funcion segun el codigo*/
        btnnavegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //El brindamos la direccón URL a Uri y lo guardamos en una variable
                Uri uriUrl = Uri.parse("https://mpersonales.blogspot.pe/");
                // lanzamos la actividad con Intent.ACTION_VIEW  y los pasamos la ruta uriurl
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                /*Iniciamos la accion*/
                startActivity(intent);
            }});

            }}

