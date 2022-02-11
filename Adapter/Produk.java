package com.example.goprint.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goprint.ActivityPesan;
import com.example.goprint.Class.Barang_Detil;
import com.example.goprint.Class.ConvertRp;
import com.example.goprint.R;
import com.squareup.picasso.Picasso;

public class Produk extends RecyclerView.Adapter<Produk.viewHolder> {

    Context context;
    String [] judul,img,harga,category,size,type,place,pot,layer;
    int [] tinggi;
    double [] demensi;

    public Produk(Context context, String[] judul, String[] img, String[] harga, String[] category, String[] size, String[] type, String[] place, String[] pot, String[] layer, int[] tinggi, double[] demensi) {
        this.context = context;
        this.judul = judul;
        this.img = img;
        this.harga = harga;
        this.category = category;
        this.size = size;
        this.type = type;
        this.place = place;
        this.pot = pot;
        this.layer = layer;
        this.tinggi = tinggi;
        this.demensi = demensi;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.row_list,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        ConvertRp rp = new ConvertRp();
        Barang_Detil bg = new Barang_Detil();
        holder.title_course.setText(judul[position]);
        holder.harga_course.setText(harga[position]);


        //Glide.with(context).load(img[position]).into(holder.imageView);
        Picasso.get()
                .load(img[position])
                .placeholder(R.drawable.img1)
                .error(R.drawable.img1)
                .fit()
                .into(holder.imageView);



        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context.getApplicationContext(), "" + pot[position], Toast.LENGTH_SHORT).show();
                Intent i = new Intent(context, ActivityPesan.class);
                i.putExtra("judul", judul[position]);
                i.putExtra("harga",harga[position]);
                i.putExtra("img", img[position]);
                i.putExtra("gory",category[position]);
                i.putExtra("size",size[position]);
                i.putExtra("type", type[position]);
                i.putExtra("place", place[position]);
                i.putExtra("pot",pot[position]);
                i.putExtra("layer", layer[position]);
                i.putExtra("tinggi", tinggi[position]);
                i.putExtra("dimensi",demensi[position]);

                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView title_course,harga_course;
        ImageView imageView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            title_course = itemView.findViewById(R.id.name);
            harga_course = itemView.findViewById(R.id.plant_price);
            imageView    = itemView.findViewById(R.id.plant_image);
        }
    }
}
