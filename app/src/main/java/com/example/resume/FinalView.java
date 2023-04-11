package com.example.resume;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class FinalView extends AppCompatActivity {
    TextView txtFname, txtLname, txtGender, txtHobby, txtStatus;
    //            txtHobby2, txtHobby3, txtHobby4, txtHobby5, txtHobby6, txtHobby7, txtHobby8,
    TextView txtschool, txt10marks, txtschoolyear, txtschoolper, txthighschool, txthighmarks, txthighyear, txthighper, txtgradname, txtgradmarks, txtgradyear, txtGradper, txtorg, txtdesig, txtrole, txtinterst1, txtinterst2, txtinterst3;
    TextView txtskills;
    //            txtCplus, txtCss, txtJava, txtAndroid, txtPhp, txtHtml, txtWeb, txtKotlin;
    TextView txtPhone, txtEmail, txtAddress;
    ImageView imgView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_view);

        idbind();
        passingAll();


    }









    private void idbind() {

        txtFname = findViewById(R.id.txtFname);
        txtLname = findViewById(R.id.txtLname);
        txtEmail = findViewById(R.id.txtEmail);
        txtAddress = findViewById(R.id.txtAddress);
        txtPhone = findViewById(R.id.txtphone);
        txtGender = findViewById(R.id.txtGender);
        txtHobby = findViewById(R.id.txtHobby);
        txtStatus = findViewById(R.id.txtStatus);
        txtschool = findViewById(R.id.txtschool);
        txt10marks = findViewById(R.id.txt10marks);
        txtschoolyear = findViewById(R.id.txtschoolyear);
        txtschoolper = findViewById(R.id.txtschoolper);
        txthighschool = findViewById(R.id.txthighschool);
        txthighmarks = findViewById(R.id.txthighmarks);
        txthighyear = findViewById(R.id.txthighyear);
        txthighper = findViewById(R.id.txthighper);
        txtgradname = findViewById(R.id.txtgradname);
        txtgradmarks = findViewById(R.id.txtgradmarks);
        txtgradyear = findViewById(R.id.txtgradyear);
        txtgradmarks = findViewById(R.id.txtgradmarks);
        txtGradper = findViewById(R.id.txtGradper);
        txtorg = findViewById(R.id.txtorg);
        txtdesig = findViewById(R.id.txtdesig);
        txtrole = findViewById(R.id.txtrole);
        txtinterst1 = findViewById(R.id.txtinterst1);
        txtinterst2 = findViewById(R.id.txtinterst2);
        txtinterst3 = findViewById(R.id.txtinterst3);
        txtskills = findViewById(R.id.txtskills);
        imgView = findViewById(R.id.imgView);

//
    }

    @SuppressLint("SetTextI18n")
    private void passingAll() {


        String name = getIntent().getStringExtra("FirstName");
        String Lastname = getIntent().getStringExtra("LastName");
        String Email = getIntent().getStringExtra("Email");
        String Address = getIntent().getStringExtra("Address");
        String Phone = getIntent().getStringExtra("Phone");

        String Gender = getIntent().getStringExtra("Gender");
        String status = getIntent().getStringExtra("martialstatus");

        String Hobby = getIntent().getStringExtra("Hobby");

//
        String school = getIntent().getStringExtra("School");
        String schoolmarks = getIntent().getStringExtra("marks)");
        String schoolyear = getIntent().getStringExtra("Schoolyear");
        String schoolper = getIntent().getStringExtra("Schoolpercentage");

        String highschool = getIntent().getStringExtra("Highschool");
        String highmarks = getIntent().getStringExtra("Highmarks");
        String highyear = getIntent().getStringExtra("highyear");
        String highper = getIntent().getStringExtra("highpercentage");

        String gradname = getIntent().getStringExtra("Collage");
        String gradmarks = getIntent().getStringExtra("collagemarks");
        String gradyear = getIntent().getStringExtra("Collageyear");
        String Gradper = getIntent().getStringExtra("Collagepercentage");

        String org = getIntent().getStringExtra("Organisation");
        String desig = getIntent().getStringExtra("designation");
        String role = getIntent().getStringExtra("role1");
        String interst1 = getIntent().getStringExtra("Interest");
        String interst2 = getIntent().getStringExtra("Interest");
        String interst3 = getIntent().getStringExtra("Interest");
        String skills = getIntent().getStringExtra("Skills");
//


        txtFname.setText("◘ First name:- " + name);
        txtLname.setText("◘ Last name:- " + Lastname);
        txtEmail.setText("◘ Email:- " + Email);
        txtAddress.setText("◘ Address:- " + Address);
        txtPhone.setText("◘ Phone number:- " + Phone);
        txtGender.setText("◘ Gender:- " + Gender);
        txtStatus.setText("◘ status:- " + status);
        txtHobby.setText("◘ HOBBIES:- " + Hobby);
//
        txtschool.setText("• School Name:- " + school);
        txt10marks.setText("• 10th Marks:- " + schoolmarks);
        txtschoolyear.setText("• 10th Passing year:- " + schoolyear);
        txtschoolper.setText("• 10th Percentage:- " + schoolper);

        txthighschool.setText("• High School Name:- " + highschool);
        txthighmarks.setText("• High School Marks:- " + highmarks);
        txthighyear.setText("• High Schhol Passing Year:- " + highyear);
        txthighper.setText("• High School Percentage:- " + highper);

        txtgradname.setText("• Collage Name:- " + gradname);
        txtgradmarks.setText("• Collage Marks:- " + gradmarks);
        txtgradyear.setText("• Collage Passing Year:- " + gradyear);
        txtGradper.setText("• Collage Percentage:- " + Gradper);

        txtorg.setText("• Organisataion:- " + org);
        txtdesig.setText("◘ Desigbation:- " + desig);
        txtrole.setText("◘ Role:- " + role);

        txtinterst1.setText("◘ Interests:- " + interst1);
        txtinterst2.setText("◘ Interests:- " + interst2);
        txtinterst3.setText("◘ Interests:- " + interst3);

        txtskills.setText("◘ Skills:- " + skills);


//
    }
}

