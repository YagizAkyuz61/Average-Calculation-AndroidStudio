package yagizakyuz.kaldigecti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    EditText n1;
    EditText n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.noteTV);
        final EditText n1 = (EditText) findViewById(R.id.note1);
        final EditText n2 = (EditText) findViewById(R.id.note2);
        ((Button) findViewById(R.id.btn1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float not1;
                float not2;
                float ort;

                not1 = Float.parseFloat(n1.getText().toString());
                not2 = Float.parseFloat(n2.getText().toString());
                ort = ((not1+not2) / 2);

                if(ort>=50){
                    tv.setText("Tebrikler geçtiniz" + " " + ort);
                }
                else{
                    tv.setText("Maalesef sınıfta kaldınız" + " " + ort);
                }
            }
        });
    }
}