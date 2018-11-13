
package com.example.apple.hw8;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText etName,etPhone;
    MyDBHandler dbHandler;
    @Override

    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        etName = (EditText)findViewById(R.id.edName); etPhone = (EditText)findViewById(R.id.edPhon); dbHandler = new MyDBHandler(this);
    }
    public void printDatabaseData(View V){
        String dbString = dbHandler.databaseToString(); Toast.makeText(getApplicationContext(),dbString,Toast.LENGTH_LONG).show(); }
    public void addButtonClicked(View view){ String naStr = etName.getText().toString(); String phStr = etPhone.getText().toString(); dbHandler.insert(naStr,phStr); etName.setText("");
        etPhone.setText("");
    }
    public void Clear(View view) { dbHandler.clear();
    }
}