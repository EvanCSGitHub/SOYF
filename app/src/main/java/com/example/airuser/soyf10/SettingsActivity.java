package com.example.airuser.soyf10;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button button = (Button) findViewById(R.id.buttonTutorial);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTutorialActivity();
            }
        });
    }
    private void goToTutorialActivity() {
        Intent intent = new Intent(this, Tutorial.class);
        startActivity(intent);
    }

}


/*






    private void viewTutorial() throws IOException {
        URL url = new URL("http://cecs492.weebly.com/uploads/9/9/2/0/99207940/tutorial.pdf");
        URLConnection connection = url.openConnection();
        InputStream in = connection.getInputStream();
        File file = new File("/Users/airuser/Desktop/App/AndroidStudio/app/tutorial.pdf");
        if(!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(new File("tutorial.pdf"));
        byte[] buf = new byte[512];
        while (true) {
            int len = in.read(buf);
            if (len == -1) {
                break;
            }
            fos.write(buf, 0, len);
        }
        in.close();
        fos.flush();
        fos.close();
    }

button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                try {
                    viewTutorial();
                    File file = new File("/Users/airuser/Desktop/App/AndroidStudio/app/tutorial.pdf");
                    Intent target = new Intent(Intent.ACTION_VIEW);
                    target.setDataAndType(Uri.fromFile(file),"application/pdf");
                    target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    Intent intent = Intent.createChooser(target, "Open File");
                    startActivity(intent);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });



============




URL url = new URL("http://www.google.ro/logos/2011/twain11-hp-bg.jpg");
URLConnection connection = url.openConnection();
InputStream in = connection.getInputStream();
FileOutputStream fos = new FileOutputStream(new File("downloaded.jpg"));
byte[] buf = new byte[512];
while (true) {
    int len = in.read(buf);
    if (len == -1) {
        break;
    }
    fos.write(buf, 0, len);
}
in.close();
fos.flush();
fos.close();




import org.apache.commons.io.FileUtils




   String filename = null;
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +"/"+ filename);
                Intent target = new Intent(Intent.ACTION_VIEW);
                target.setDataAndType(Uri.fromFile(file),"application/pdf");
                target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                Intent intent = Intent.createChooser(target, "Open File");
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {

                }
            }


 */