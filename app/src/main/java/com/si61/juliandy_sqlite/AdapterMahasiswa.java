package com.si61.juliandy_sqlite.;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMahasiswa  extends  RecyclerView.Adapter<AdapterMahasiswa.ViewHolderMahasiswa>{
    private Context ctx;
    private ArrayList  arrId, arrNpm, arrNama, arrProdi;

    public AdapterDestinasi(Context ctx, ArrayList arrId, ArrayList arrNpm, ArrayList arrNama, ArrayList arrProdi) {
        this.ctx = ctx;
        this.arrId = arrId;
        this.arrNpm = arrNpm;
        this.arrNama = arrNama;
        this.arrProdi = arrProdi;
    }

    @NonNull
    @Override
    public ViewHolderMahasiswa onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.list_item_mahasiswa, parent, false);
        return new ViewHolderMahasiswa(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMahasiswa holder, int position) {
        holder.tvId.setText(arrId.get(position).toString());
        holder.tvNpm.setText(arrNpm.get(position).toString());
        holder.tvNama.setText(arrNama.get(position).toString());
        holder.tvProdi.setText(arrProdi.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return arrNama.size();
    }

    public class ViewHolderMahasiswa extends RecyclerView.ViewHolder {
        TextView  tvId, tvNpm, tvNama, tvProdi;

        public ViewHolderMahasiswa(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tv_Id);
            tvNpm = itemView.findViewById(R.id.tv_Npm);
            tvNama = itemView.findViewById(R.id.tv_Nama);
            tvProdi = itemView.findViewById(R.id.tv_Prodi);

        }
    }
}
