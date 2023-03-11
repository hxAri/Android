package com.android;

import android.app.Activity;
import android.os.Bundle;

//import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.view.View;

import com.android.R;

public class MainActivity extends Activity
{
	
	EditText length;
	EditText height;
	EditText width;
	
	TextView result;
	
	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );
		
		result = findViewById( R.id.result );
		length = findViewById( R.id.length );
		height = findViewById( R.id.height );
		width = findViewById( R.id.width );
		
		toast( "By hxAri" );
	}
	
	public int parse( String s )
	{
		try {
			return Integer.parseInt( s );
		} catch( NumberFormatException e ) {
			return 0;
		}
	}
	
	public void count( View view )
	{
		int l = parse( length.getText().toString() );
		int h = parse( height.getText().toString() );
		int w = parse( width.getText().toString() );
		
		result.setText( Integer.toString( l * h * w ) );
	}
	
	public void reset( View view )
	{
		width.setText( "0" );
		height.setText( "0" );
		length.setText( "0" );
		result.setText( "0" );
	}
	
	public void toast( String text )
	{
		Toast.makeText( this, text, Toast.LENGTH_SHORT ).show();
	}
	
}
