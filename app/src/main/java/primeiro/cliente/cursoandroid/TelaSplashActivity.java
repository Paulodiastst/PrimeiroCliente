package primeiro.cliente.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class TelaSplashActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    int tempoDeEspera = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada...");

        trocarTela();
    }

    private void trocarTela() {

        Log.d(TAG, "trocandoTela: Mudando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(TAG, "trocandoTela: Esperando um tempo...");

                Intent trocaDeTela = new Intent(TelaSplashActivity.this, MainActivity.class);
                startActivity(trocaDeTela);
                finish();
            }
        },tempoDeEspera);
    }

}