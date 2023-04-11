package com.example.resume;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdbgender, rdbmartial;
    CheckBox chkreading, chkwriting, chkdancing, chkhikeing, chkclang, chkcplus, chkjava, chkkotlin, chkphp, chkandriod, chkhtml, chkjavascript;
    Button btnsubmit;
    EditText edtfname, edtlname, edtemail, edtadd, edtphone, edtschool, edtmarks1, edtyear1, edtpercentage1, edthighschool, edtmarks2, edtyear2, edtpercentage2, edtcollage, edtmarks3, edtyear3, edtpercentage3, edtorganization,
            edtdesignation, edtrole, edtinterest1, edtinterest2, edtinterest3;
    String gender, martialstatus;

    StringBuilder obj = new StringBuilder();
    StringBuilder obj1 = new StringBuilder();
    StringBuilder obj2 = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        execute();
    }


    private void initview() {

        edtfname = findViewById(R.id.edtfname);
        edtlname = findViewById(R.id.edtlname);
        edtemail = findViewById(R.id.edtemail);
        edtadd = findViewById(R.id.edtadd);
        edtphone = findViewById(R.id.edtphone);
        edtschool = findViewById(R.id.edtschool);
        edtmarks1 = findViewById(R.id.edtmarks1);
        edtyear1 = findViewById(R.id.edtyear1);
        edtpercentage1 = findViewById(R.id.edtpercentage1);
        edthighschool = findViewById(R.id.edthighschool);
        edtmarks2 = findViewById(R.id.edtmarks2);
        edtyear2 = findViewById(R.id.edtyear2);
        edtpercentage2 = findViewById(R.id.edtpercentage2);
        edtcollage = findViewById(R.id.edtcollage);
        edtmarks3 = findViewById(R.id.edtmarks3);
        edtyear3 = findViewById(R.id.edtyear3);
        edtpercentage3 = findViewById(R.id.edtpercentage3);
        edtorganization = findViewById(R.id.edtorganization);
        edtdesignation = findViewById(R.id.edtdesignation);
        edtrole = findViewById(R.id.edtrole);
        edtinterest1 = findViewById(R.id.edtinterest1);
        edtinterest2 = findViewById(R.id.edtinterest2);
        edtinterest3 = findViewById(R.id.edtinterest3);
        rdbgender = findViewById(R.id.rdbgender);
        rdbmartial = findViewById(R.id.rdbmartial);
        chkreading = findViewById(R.id.chkreading);
        chkwriting = findViewById(R.id.chkwriting);
        chkdancing = findViewById(R.id.chkdancing);
        chkhikeing = findViewById(R.id.chkhikeing);
        chkclang = findViewById(R.id.chkclang);
        chkcplus = findViewById(R.id.chkcplus);
        chkjava = findViewById(R.id.chkjava);
        chkkotlin = findViewById(R.id.chkkotlin);
        chkphp = findViewById(R.id.chkphp);
        chkandriod = findViewById(R.id.chkandriod);
        chkhtml = findViewById(R.id.chkhtml);
        chkjavascript = findViewById(R.id.chkjavascript);
        btnsubmit = findViewById(R.id.btnsubmit);
//
//        String name= edtfname.getText().toString();
//
//        rdbgender.setOnCheckedChangeListener((radioGroup, i) -> {
//            RadioButton rgen=findViewById(i);
//            Log.e("TAG", "initview: gender"+rgen.getText() );
//        });
//
//        rdbmartial.setOnCheckedChangeListener((radioGroup, i) -> {
//            RadioButton rchk=findViewById(i);
//            Log.e("TAG", "initview: martial status"+rchk.getText() );
//        });


    }

    private void execute() {

        btnsubmit.setOnClickListener(view -> {

            String FirstName = edtfname.getText().toString();
            String LastName = edtlname.getText().toString();
            String Address = edtadd.getText().toString();
            String Phone = edtphone.getText().toString();
            String Email = edtemail.getText().toString();
            String School = edtschool.getText().toString();
            String marks = edtmarks1.getText().toString();
            String Schoolpercentage = edtpercentage1.getText().toString();
            String Schoolyear = edtyear1.getText().toString();
            String Highschool = edthighschool.getText().toString();
            String highemarks = edtmarks2.getText().toString();
            String highpercentage = edtpercentage2.getText().toString();
            String highyear = edtyear2.getText().toString();
            String Collage = edtcollage.getText().toString();
            String collagemarks = edtmarks3.getText().toString();
            String Collagepercentage = edtpercentage3.getText().toString();
            String Collageyear = edtyear3.getText().toString();
            String designation = edtdesignation.getText().toString();
            String Organisation = edtorganization.getText().toString();
            String role1 = edtrole.getText().toString();
            String interest1 = edtinterest1.getText().toString();
            String interest2 = edtinterest2.getText().toString();
            String interest3 = edtinterest3.getText().toString();

//            Gender Radion Button

            int id = rdbgender.getCheckedRadioButtonId();
            RadioButton rb = findViewById(id);
            if (id != -1) {
                gender = rb.getText().toString();
            }

//                martialstatus Radio Button

            int id2 = rdbmartial.getCheckedRadioButtonId();
            RadioButton rb2 = findViewById(id2);
            if (id2 != -1) {
                martialstatus = rb2.getText().toString();
            }

//                checkbox


            if (chkreading.isChecked()) {
                obj.append(" " + chkreading.getText().toString());
            }
            if (chkdancing.isChecked()) {

                obj.append(" " + chkdancing.getText().toString());
            }
            if (chkwriting.isChecked()) {

                obj.append(" " + chkwriting.getText().toString());
            }
            if (chkhikeing.isChecked()) {

                obj.append(" " + chkhikeing.getText().toString());
            }

            //            langguages

            if (chkclang.isChecked()) {

                obj2.append("  " + chkclang.getText().toString());
            }
            if (chkcplus.isChecked()) {

                obj2.append("  " + chkcplus.getText().toString());
            }
            if (chkjava.isChecked()) {

                obj2.append("  " + chkjava.getText().toString());
            }
            if (chkkotlin.isChecked()) {

                obj2.append("  " + chkkotlin.getText().toString());
            }
            if (chkphp.isChecked()) {

                obj2.append("  " + chkphp.getText().toString());
            }
            if (chkandriod.isChecked()) {

                obj2.append("  " + chkandriod.getText().toString());
            }
            if (chkhtml.isChecked()) {

                obj2.append("  " + chkhtml.getText().toString());
            }
            if (chkjavascript.isChecked()) {

                obj2.append("  " + chkjavascript.getText().toString());
            }

            //            CONDITION CHECK STARTS HERE*********


            if (edtfname == null) {
                Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show();
            } else if (edtfname.length() < 5 || edtfname.length() > 10) {
                Toast.makeText(this, "First Name should be more than 3 letters & less than 10 letters", Toast.LENGTH_SHORT).show();
            } else if (edtlname == null) {
                Toast.makeText(this, "please enter last name", Toast.LENGTH_SHORT).show();

            } else if (edtlname.length() < 5) {
                Toast.makeText(this, "Last Name should be more than 3 letters", Toast.LENGTH_SHORT).show();
            } else if (edtphone == null) {
//                Log.e("TAG", "Phone filed is empty");
                Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
            } else if (edtphone.length() < 10) {
                Toast.makeText(this, "Phone number should be 10 digits", Toast.LENGTH_SHORT).show();
            } else if (edtemail == null) {
//
                Toast.makeText(this, "Email field is empty", Toast.LENGTH_SHORT).show();
            } else if (edtadd == null) {
//
                Toast.makeText(this, "Address field is empty", Toast.LENGTH_SHORT).show();
            } else if (gender == null) {
//                Log.e("TAG", "execute:Gender field is empty ");
                Toast.makeText(this, "Please select Gender", Toast.LENGTH_SHORT).show();
            } else if (martialstatus == null) {
//                Log.e("TAG", "execute:Status field is empty ");
                Toast.makeText(this, "Please select your marital status", Toast.LENGTH_SHORT).show();
            } else if (obj == null) {
//                    && hobby2 == null && hobby3 == null && hobby4 == null && hobby5 == null && hobby6 == null && hobby7 == null && hobby8 == null) {
//                Log.e("TAG", "execute: hobby field is empty ");
                Toast.makeText(this, "Please select at least one hobby", Toast.LENGTH_SHORT).show();
            } else if (edtpercentage1 == null) {
//                Log.e("TAG", "Percent10 filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (edtpercentage2 == null) {
//                Log.e("TAG", "Percent12 filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (edtpercentage3 == null) {
//                Log.e("TAG", "PercentGrad filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (edtyear1 == null) {
//                Log.e("TAG", "Year10 filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (edtyear2 == null) {
//                Log.e("TAG", "Year12 field is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (edtyear3 == null) {
//                Log.e("TAG", "YearGrad filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (edtorganization == null) {
//                Log.e("TAG", "PastJob experience field is empty");
                Toast.makeText(this, "Please fill past job organization", Toast.LENGTH_SHORT).show();
            } else if (edtdesignation == null) {
//                Log.e("TAG", "Interest field is empty");
                Toast.makeText(this, "Please fill your designation", Toast.LENGTH_SHORT).show();
            } else if (edtrole == null) {
//                Log.e("TAG", "Interest field is empty");
                Toast.makeText(this, "Please fill your role", Toast.LENGTH_SHORT).show();
            } else if (edtinterest1 == null) {
//                Log.e("TAG", "Interest field is empty");
                Toast.makeText(this, "Please fill your interest", Toast.LENGTH_SHORT).show();
            } else if (edtinterest2 == null) {
//                Log.e("TAG", "Interest field is empty");
                Toast.makeText(this, "Please fill your interest", Toast.LENGTH_SHORT).show();
            } else if (edtinterest3 == null) {
//                Log.e("TAG", "Interest field is empty");
                Toast.makeText(this, "Please fill your interest", Toast.LENGTH_SHORT).show();
            } else if (obj2 == null) {
//             Lan2 == null && Lan3 == null && Lan4 == null && Lan5 == null && Lan6 == null && Lan7 == null && Lan9 == null && Lan10 == null) {
                //                Log.e("TAG", "execute: Skill field is empty ");
                Toast.makeText(this, "Please select at least one Language", Toast.LENGTH_SHORT).show();
            } else {
                Intent i = new Intent(MainActivity.this, FinalView.class);
                i.putExtra("FirstName", FirstName);
                i.putExtra("LastName", LastName);
                i.putExtra("Address", Address);
                i.putExtra("Phone", Phone);
                i.putExtra("Email", Email);
                i.putExtra("School", School);
                i.putExtra("Schoolpercentage", Schoolpercentage);
                i.putExtra("marks", marks);
                i.putExtra("Schoolyear", Schoolyear);
                i.putExtra("Highschool", Highschool);
                i.putExtra("Highmarks", highemarks);
                i.putExtra("highpercentage", highpercentage);
                i.putExtra("highyear", highyear);
                i.putExtra("Collagepercentage", Collagepercentage);
                i.putExtra("Collage", Collage);
                i.putExtra("collagemarks", collagemarks);
                i.putExtra("Collageyear", Collageyear);
                i.putExtra("designation", designation);
                i.putExtra("Organisation", Organisation);
                i.putExtra("role1", role1);
                i.putExtra("Interest", interest1);
                i.putExtra("Interest", interest2);
                i.putExtra("Interest", interest3);

                i.putExtra("Hobby", "" + obj);
                i.putExtra("status", "" + obj1);
                i.putExtra("Skills", "" + obj2);

                i.putExtra("Gender", gender);
                i.putExtra("martialstatus", martialstatus);
                startActivity(i);

            }


        });

    }

}
