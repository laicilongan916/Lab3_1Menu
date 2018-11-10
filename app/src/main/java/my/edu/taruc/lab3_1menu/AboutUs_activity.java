package my.edu.taruc.lab3_1menu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AboutUs_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_activity);
    }

    public void visitTARUC(View view)
    {
        // TODO: CREATE IMPLICIT INTENT
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.tarc.edu.my"));

        if (intent.resolveActivity(getPackageManager())!=null)
        {
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"No app to handle this", Toast.LENGTH_SHORT).show();
        }
    }

    public void showMain(View view)
    {
        Intent intent = new Intent (Intent.ACTION_MAIN);
        startActivity(intent);
    }

    public void showSentTo(View view)
    {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + "info@tarc.edu.my"));

        if (intent.resolveActivity(getPackageManager())!=null)
        {
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"No app to handle this", Toast.LENGTH_SHORT).show();
        }
    }

    public void showDial(View view)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "034123456"));

        if (intent.resolveActivity(getPackageManager())!=null)
        {
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"No app to handle this", Toast.LENGTH_SHORT).show();
        }
    }
}
