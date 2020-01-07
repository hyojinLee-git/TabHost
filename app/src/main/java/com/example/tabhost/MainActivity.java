package com.example.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends TabActivity {

    String number1, number2; Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,buttonAdd, buttonSub, buttonMul, buttonDiv;
    EditText editText1, editText2;  TextView textResult;
    CheckBox checkBox1; TextView textView1, textView2;
    RadioGroup radioGroup1; Button  button1, radio_button_1, radio_button_2, radio_button_3,radio_button_4, radio_button_5;
    ImageView imageView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabtab);

        TabHost tabHost=getTabHost();

        TabHost.TabSpec tabSpec1=tabHost.newTabSpec("TAG1").setIndicator("CARCULATOR");
        tabSpec1.setContent(R.id.tab1);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2=tabHost.newTabSpec("TAG2").setIndicator("IMAGEVIEWER");
        tabSpec2.setContent(R.id.tab2);
        tabHost.addTab(tabSpec2);

        tabHost.setCurrentTab(0);




        editText1 = (EditText)findViewById(R.id.edit_text_1);
        editText2 = (EditText)findViewById(R.id.edit_text_2);
        num0 = (Button)findViewById(R.id.num0);
        num1 = (Button)findViewById(R.id.num1);
        num2 = (Button)findViewById(R.id.num2);
        num3 = (Button)findViewById(R.id.num3);
        num4 = (Button)findViewById(R.id.num4);
        num5 = (Button)findViewById(R.id.num5);
        num6 = (Button)findViewById(R.id.num6);
        num7 = (Button)findViewById(R.id.num7);
        num8 = (Button)findViewById(R.id.num8);
        num9 = (Button)findViewById(R.id.num9);
        buttonAdd = (Button)findViewById(R.id.button_Add);
        buttonSub = (Button)findViewById(R.id.button_Subtract);
        buttonMul = (Button)findViewById(R.id.button_Multiple);
        buttonDiv = (Button)findViewById(R.id.button_Divide);
        textResult = (TextView)findViewById(R.id.textResult);


        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num0.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num0.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num1.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num1.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num2.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num2.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num3.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num3.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num4.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num4.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num5.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num5.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num6.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num6.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num7.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num7.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num8.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num8.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.isFocused() == true) {
                    number1=editText1.getText().toString() + num9.getText().toString();
                    editText1.setText(number1);
                }
                else if(editText2.isFocused()==true){
                    number2=editText2.getText().toString() + num9.getText().toString();
                    editText2.setText(number2);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Error:Click an EditText first",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = editText1.getText().toString();
                String number2 = editText2.getText().toString();
                Double result = Double.parseDouble(number1) + Double.parseDouble(number2);

                textResult.setText("Result:" + result.toString());
            }

        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = editText1.getText().toString();
                String number2 = editText2.getText().toString();
                Double result = Double.parseDouble(number1) - Double.parseDouble(number2);

                textResult.setText("Result:" + result.toString());
            }

        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = editText1.getText().toString();
                String number2 = editText2.getText().toString();
                Double result = Double.parseDouble(number1) / Double.parseDouble(number2);

                textResult.setText("Result:" + result.toString());
            }

        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = editText1.getText().toString();
                String number2 = editText2.getText().toString();
                Double result = Double.parseDouble(number1) * Double.parseDouble(number2);

                textResult.setText("Result:" + result.toString());
            }

        });



        checkBox1 = (CheckBox) findViewById(R.id.check_box_1);
        textView1=(TextView)findViewById(R.id.text_view_1);
        textView2=(TextView)findViewById(R.id.text_view_2);
        radioGroup1=(RadioGroup)findViewById(R.id.radio_group_1);
        button1=(Button)findViewById(R.id.button_1);
        radio_button_1=(RadioButton)findViewById(R.id.radio_button_1);
        radio_button_2=(RadioButton)findViewById(R.id.radio_button_2);
        radio_button_3=(RadioButton)findViewById(R.id.radio_button_3);
        radio_button_4=(RadioButton)findViewById(R.id.radio_button_4);
        radio_button_5=(RadioButton)findViewById(R.id.radio_button_5);
        imageView1=(ImageView)findViewById(R.id.imageView_1);


        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(checkBox1.isChecked()==true) {
                    textView2.setVisibility(android.view.View.VISIBLE);
                    radioGroup1.setVisibility(android.view.View.VISIBLE);
                    radio_button_1.setVisibility(View.VISIBLE);
                    radio_button_2.setVisibility(View.VISIBLE);
                    radio_button_3.setVisibility(View.VISIBLE);
                    radio_button_4.setVisibility(View.VISIBLE);
                    radio_button_5.setVisibility(View.VISIBLE);
                    button1.setVisibility(android.view.View.VISIBLE);
                    imageView1.setVisibility(android.view.View.VISIBLE);

                }
                else {
                    textView2.setVisibility(android.view.View.INVISIBLE);
                    radioGroup1.setVisibility(android.view.View.INVISIBLE);
                    radio_button_1.setVisibility(View.INVISIBLE);
                    radio_button_2.setVisibility(View.INVISIBLE);
                    radio_button_3.setVisibility(View.INVISIBLE);
                    radio_button_4.setVisibility(View.INVISIBLE);
                    radio_button_5.setVisibility(View.INVISIBLE);
                    button1.setVisibility(android.view.View.INVISIBLE);
                    imageView1.setVisibility(View.INVISIBLE);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View arg0) {
                switch (radioGroup1.getCheckedRadioButtonId()){
                    case R.id.radio_button_1:
                        Toast.makeText(getApplicationContext(),"image 1 is selected.",
                                Toast.LENGTH_SHORT).show();
                        imageView1.setImageResource(R.drawable.image1);
                        break;
                    case R.id.radio_button_2:
                        Toast.makeText(getApplicationContext(),"image 2 is selected",
                                Toast.LENGTH_SHORT).show();
                        imageView1.setImageResource(R.drawable.image2);
                        break;
                    case R.id.radio_button_3:
                        Toast.makeText(getApplicationContext(),"image 3 is selected",
                                Toast.LENGTH_SHORT).show();
                        imageView1.setImageResource(R.drawable.image3);
                        break;
                    case R.id.radio_button_4:
                        Toast.makeText(getApplicationContext(),"image 4 is selected",
                                Toast.LENGTH_SHORT).show();
                        imageView1.setImageResource(R.drawable.image4);

                        break;
                    case R.id.radio_button_5:
                        Toast.makeText(getApplicationContext(),"image 5 is selected",
                                Toast.LENGTH_SHORT).show();
                        imageView1.setImageResource(R.drawable.image5);
                        break;

                    default:
                        Toast.makeText(getApplicationContext(),
                                "Error: No images selected.",
                                Toast.LENGTH_SHORT).show();


                }
            }
        });


    }
}
