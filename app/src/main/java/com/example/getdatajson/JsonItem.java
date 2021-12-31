package com.example.getdatajson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class JsonItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_item);

        String username = getIntent().getStringExtra("username");
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String photo = getIntent().getStringExtra("photo");
        String street = getIntent().getStringExtra("street");
        String suite = getIntent().getStringExtra("suite");
        String city = getIntent().getStringExtra("city");
        String zipcode = getIntent().getStringExtra("zipcode");
        String lat = getIntent().getStringExtra("lat");
        String lng = getIntent().getStringExtra("lng");
        String phone = getIntent().getStringExtra("phone");
        String website = getIntent().getStringExtra("website");
        String companyName = getIntent().getStringExtra("companyName");
        String catchPhrase = getIntent().getStringExtra("catchPhrase");
        String bs = getIntent().getStringExtra("bs");

        TextView view_username = findViewById(R.id.usernameItem);
        view_username.setText("User name: " + username);
        TextView view_name = findViewById(R.id.name);
        view_name.setText("Name: " + name);
        TextView view_email = findViewById(R.id.emailItem);
        view_email.setText("Email: " + email);

        TextView view_address = findViewById(R.id.address);
        String address = "Street : " + street +
                "\nSuite: " + suite +
                "\nCity: " + city +
                "\nZipcode" + zipcode +
                "\nGeo:  lat = " + lat + " ,  lng = " + lng;
        view_address.setText(address);
        TextView view_company = findViewById(R.id.company);
        String company = "Company name: " + companyName +
                "\nCatch phrase: " + catchPhrase +
                "\nBS: " + bs;
        view_company.setText(company);
        TextView view_phone = findViewById(R.id.phone);
        view_phone.setText("Phone: " + phone);
        TextView view_website = findViewById(R.id.website);
        view_website.setText("Website: " + website);

        ImageView img_photo = findViewById(R.id.photo);
        Picasso.with(this).load(photo).into(img_photo);

    }
}