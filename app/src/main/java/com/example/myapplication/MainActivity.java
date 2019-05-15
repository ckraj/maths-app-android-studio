package com.example.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnsum =  findViewById ( R.id.add );
        Button btnsub =  findViewById ( R.id.sub );
        Button btndiv =  findViewById ( R.id.div );
        Button btnmul =  findViewById ( R.id.mul );
        Button btnpow =  findViewById ( R.id.power_x );
        Button btnsqrt =  findViewById ( R.id.sqrt );
        Button btnper =  findViewById ( R.id.per );
        Button btnclear =  findViewById ( R.id.clear );
        Button btnexit =  findViewById ( R.id.exit );
        final EditText et1 =  findViewById ( R.id.Eeittext1 );
        final EditText et2 =  findViewById ( R.id.EditText2 );
        final TextView result = findViewById ( R.id.TextView );

        btnsum.setOnClickListener ( new View.OnClickListener() {

            @Override
            public void onClick ( View v ) {
                double x = new Integer ( et1.getText ().toString ());
                double y = new Integer ( et2.getText ().toString () );
                double sum = x + y;
                result.setText ( "ANS of X + Y=" + sum );

            }
        } );


        btnsub.setOnClickListener ( new View.OnClickListener() {

            @Override
            public void onClick ( View v ) {
                double x = new Integer ( et1.getText ().toString ());
                double y = new Integer ( et2.getText ().toString () );
                double sum = x - y;
                result.setText ( "ANS of X - Y= " + sum );
            }
        } );


        btndiv.setOnClickListener ( new View.OnClickListener() {

            @Override
            public void onClick ( View v ) {
                double x = new Integer ( et1.getText ().toString ());
                double y = new Integer  ( et2.getText ().toString () );
                double sum = x / y;
                result.setText ( "ANS of X / Y= " + sum );
            }
        } );


        btnmul.setOnClickListener ( new View.OnClickListener() {

            @Override
            public void onClick ( View v ) {
                double x = new Integer ( et1.getText ().toString ());
                double y = new Integer  ( et2.getText ().toString () );
                double sum = x * y;
                result.setText ( "ANS of X x Y  = " + sum );
            }
        } );


        btnpow.setOnClickListener ( new View.OnClickListener() {

            @Override
            public void onClick ( View v ) {
                double x = new Integer ( et1.getText ().toString ());
                double sum = x * x * x;
                result.setText ( "ANS of X³= " + sum );
            }
        } );

        btnsqrt.setOnClickListener ( new View.OnClickListener() {

            @Override
            public void onClick ( View v ) {
                double x = new Integer ( et1.getText ().toString () );
                double sum = x * x;
                result.setText ( "ANS of X√= " + sum );

            }
        } );

        btnper.setOnClickListener ( new View.OnClickListener() {

            @Override
            public void onClick ( View v ) {
                double x = new  Integer ( et1.getText ().toString () );
                double y = new Integer ( et2.getText ().toString () );
                double sum = x / y * 100;
                result.setText ( "ANS of % =" + sum );
            }
        } );

        btnclear.setOnClickListener ( new View.OnClickListener() {

            @Override
            public void onClick ( View v ) {
                et1.setText ( "" );
                et2.setText ( "" );
                result.setText ( " " );
            }
        } );


        btnexit.setOnClickListener ( new View.OnClickListener() {

            @Override
            public void onClick ( View v ) {
                finish ();
                System.exit ( 0 );
            }
        } );


    }

}



