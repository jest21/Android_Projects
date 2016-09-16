package com.lmntrx.cmeraapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void capture(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            ImageView imageView = (ImageView) findViewById((R.id.imageView));
            bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }
    }

    public void share(View view) {
          Intent shareintent = new Intent(Intent.ACTION_SEND);
        shareintent.setType("image/jpeg");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        File f = new File(Environment.getExternalStorageDirectory() + File.separator + "temporary_file.jpg");
        try {
            if (f.createNewFile()) {
                FileOutputStream fo = new FileOutputStream(f);
                fo.write(bytes.toByteArray());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
