package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private CheckBox check1,check2,check3;
    private Button select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerOnCheckbox();
    }
    public void addListenerOnCheckbox()
    {
        check1=(CheckBox)findViewById(R.id.checkBox);
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this,"Dog is selected",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void addListenerOnButton()
    {
        check1=(CheckBox)findViewById(R.id.checkBox);
        check2=(CheckBox)findViewById(R.id.checkBox2);
        check3=(CheckBox)findViewById(R.id.checkBox3);
        select=(Button)findViewById(R.id.button);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result=new StringBuffer();
                result.append("\nDog: ").append(check1.isChecked());
                result.append("\nCat: ").append(check2.isChecked());
                result.append("\nCow: ").append(check3.isChecked());
                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}