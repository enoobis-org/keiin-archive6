package com.example.asanaliev_temirlan_hw_03_031;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView tvContact;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        tvContact = itemView.findViewById(R.id.tv_contact);
    }
    public void onBind(String contact){
        tvContact.setText(contact);
    }
}
