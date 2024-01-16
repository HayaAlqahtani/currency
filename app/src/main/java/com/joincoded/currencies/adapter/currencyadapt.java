package com.joincoded.currencies.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.currencies.R;
import com.joincoded.currencies.data.Dataclass;

import java.util.ArrayList;

public class currencyadapt extends RecyclerView.Adapter<currencyadapt.CurrencyViewHolder> {
    ArrayList<Dataclass> currencysLists;

    public currencyadapt(ArrayList<Dataclass> currencysLists) {

        this.currencysLists = currencysLists;
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item1, parent, false);

        return new CurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        holder.nameTextView.setText(String.valueOf(currencysLists.get(position).getExchangeRate()));
        holder.codeTextView.setText(currencysLists.get(position).getCurrencyName());
        holder.exchangeTextview.setText(currencysLists.get(position).getCurrencyCode());
    }

    @Override
    public int getItemCount() {
        return currencysLists.size();
    }

    public static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView codeTextView;
        TextView exchangeTextview;
        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.CurrencyName);
            codeTextView =itemView.findViewById(R.id.codeName);
            exchangeTextview =itemView.findViewById(R.id.exchangeTextView);
        }
    }
}
