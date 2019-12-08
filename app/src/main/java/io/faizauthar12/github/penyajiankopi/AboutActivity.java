package io.faizauthar12.github.penyajiankopi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView tv_SourceCode = findViewById(R.id.SourceCode);
        tv_SourceCode.setMovementMethod(LinkMovementMethod.getInstance());
        tv_SourceCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DirectSourceCode = new Intent(Intent.ACTION_VIEW);
                DirectSourceCode.setData(Uri.parse("https://github.com/faizauthar12/dicoding_submission_PenyajianKopi"));
                startActivity(DirectSourceCode);
            }
        });

        TextView tv_GithubProfile = findViewById(R.id.GithubProfile);
        tv_GithubProfile.setMovementMethod(LinkMovementMethod.getInstance());
        tv_GithubProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DirectGithubProfile = new Intent(Intent.ACTION_VIEW);
                DirectGithubProfile.setData(Uri.parse("https://github.com/faizauthar12"));
                startActivity(DirectGithubProfile);
            }
        });

        TextView tv_TelegramProfile = findViewById(R.id.TelegramProfile);
        tv_TelegramProfile.setMovementMethod(LinkMovementMethod.getInstance());
        tv_TelegramProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DirectTelegramProfile = new Intent(Intent.ACTION_VIEW);
                DirectTelegramProfile.setData(Uri.parse("https://t.me/faizauthar12"));
                startActivity(DirectTelegramProfile);
            }
        });

        TextView tv_LinkidenProfile = findViewById(R.id.Linkedin);
        tv_LinkidenProfile.setMovementMethod(LinkMovementMethod.getInstance());
        tv_LinkidenProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DirectLinkedinProfile = new Intent(Intent.ACTION_VIEW);
                DirectLinkedinProfile.setData(Uri.parse("https://www.linkedin.com/in/faiz-authar-ba7292161/"));
                startActivity(DirectLinkedinProfile);
            }
        });

        TextView tv_Reference1 = findViewById(R.id.Reference1);
        tv_Reference1.setMovementMethod(LinkMovementMethod.getInstance());
        tv_Reference1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DirectReference1 = new Intent(Intent.ACTION_VIEW);
                DirectReference1.setData(Uri.parse("https://github.com/kholilboy/Dicoding-Android-Pemula"));
                startActivity(DirectReference1);
            }
        });

        TextView tv_Reference2 = findViewById(R.id.Reference2);
        tv_Reference2.setMovementMethod(LinkMovementMethod.getInstance());
        tv_Reference2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DirectReference2 = new Intent(Intent.ACTION_VIEW);
                DirectReference2.setData(Uri.parse("https://www.youtube.com/watch?v=69C1ljfDvl0"));
                startActivity(DirectReference2);
            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
