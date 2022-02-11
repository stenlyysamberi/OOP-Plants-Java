package com.example.goprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.goprint.Class.ConvertRp;
import com.example.goprint.Interface.Keranjang;
import com.example.goprint.Interface.Order;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.squareup.picasso.Picasso;

public class ActivityPesan extends AppCompatActivity {

    ConvertRp convertRp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
        Bundle extras = getIntent().getExtras();
        String judul  = extras.getString("judul");
        String harga  = extras.getString("harga");
        String img    = extras.getString("img");

        String category = extras.getString("gory");
        String size = extras.getString("size");

        String type = extras.getString("type");
        String place = extras.getString("place");
        String pot = extras.getString("pot");
        String layer = extras.getString("layer");
        int high = extras.getInt("tinggi");
        double dim = extras.getDouble("dimensi");


        TextView plant_name = findViewById(R.id.plant_name);
        plant_name.setText(judul);

        TextView Cgory = findViewById(R.id.plant_category);
        Cgory.setText(category);

        TextView plant_size = findViewById(R.id.plant_size);
        plant_size.setText(size);

        TextView plant_price2 = findViewById(R.id.plant_price2);
        plant_price2.setText(harga);

        TextView plant_type = findViewById(R.id.plant_type);
        plant_type.setText(type);

        TextView plant_placement = findViewById(R.id.plant_placement);
        plant_placement.setText(place);

        TextView plant_pot = findViewById(R.id.plant_pot);
        plant_pot.setText(pot);

        TextView plant_layer = findViewById(R.id.plant_layer);
        plant_layer.setText(layer);

        TextView plant_height = findViewById(R.id.plant_height);
        plant_height.setText(high + "cm");

        TextView plant_dim  = findViewById(R.id.plant_dim);
        plant_dim.setText(Double.toString(dim));

        ImageView plant_image2 = findViewById(R.id.plant_image2);
        Picasso.get()
                .load(img)
                .placeholder(R.drawable.img1)
                .error(R.drawable.img1)
                .fit()
                .into(plant_image2);

        ImageView imageView11 = findViewById(R.id.imageView11);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog v = new BottomSheetDialog(
                       ActivityPesan.this,R.style.bottomSheetDialogTheme
                );

                View bottomSheetView = LayoutInflater.from(getApplicationContext())
                        .inflate(R.layout.carts, (LinearLayout) v.findViewById(R.id.cart));

                bottomSheetView.findViewById(R.id.btn_nominal).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                     EditText srt  = bottomSheetView.findViewById(R.id.total_belanja);
                     TextView tv   = bottomSheetView.findViewById(R.id.beli);
                     String number = String.valueOf(srt.getText());

                     int num = Integer.parseInt(number);
                     int hrg = Integer.parseInt(harga);
                     Keranjang cart = new Keranjang();
                     cart.total(hrg,num);
                     cart.beli();
                     if (cart.isLimit() == true ){
                         Toast.makeText(getApplicationContext(), "Jumlah Order MAX Harus 5", Toast.LENGTH_SHORT).show();
                     }else{
                         tv.setText(String.valueOf(cart.getTotal()));
                         tv.setTextSize(20);
                         Intent i = new Intent(ActivityPesan.this, CartActivity.class);
                         i.putExtra("beli", cart.getJumlah());
                         i.putExtra("harga",cart.getHarga());
                         startActivity(i);
                     }

                    }
                });


                v.setContentView(bottomSheetView);
                v.show();

            }



        });




    }



}