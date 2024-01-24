package com.example.nastuxa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class zapis extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4, editText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zapis);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
    }

    public void onZapisatsyaClick(View view) {
        String data = editText1.getText().toString() + "\n" +
                editText2.getText().toString() + "\n" +
                editText3.getText().toString() + "\n" +
                editText4.getText().toString() + "\n" +
                editText5.getText().toString();

        sendEmail(data);
    }

    private void sendEmail(String data) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("message/rfc822");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"eroshevskiy.oleg@mail.ru"}); // Адрес получателя
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Данные о записи");
        emailIntent.putExtra(Intent.EXTRA_TEXT, data);

        try {
            startActivity(Intent.createChooser(emailIntent, "Отправить email..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "На устройстве нет почтового клиента.", Toast.LENGTH_SHORT).show();
        }
    }
}
