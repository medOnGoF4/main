package com.teclever.stickyheader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;

import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;



public class CustomAdapter extends BaseAdapter implements StickyListHeadersAdapter {
    private LayoutInflater inflater;
    private JSONArray contacts;
    public CustomAdapter(Context context,JSONArray contacts)
    {
        inflater=LayoutInflater.from(context);
        this.contacts=contacts;
    }
    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {
        HeaderViewHolder holder;
        if (convertView == null) {
            holder = new HeaderViewHolder();
            convertView = inflater.inflate(R.layout.header, parent, false);
            holder.text = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        } else {
            holder = (HeaderViewHolder) convertView.getTag();
        }
        //set header text as first char in name
        String headerText = null;
        try {
            headerText = "" + contacts.get(position).toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        holder.text.setText(headerText);
        return convertView;
    }

    @Override
    public long getHeaderId(int position) {
        long l = 0;
        try {
            l= Long.parseLong(contacts.get(position).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return l;
    }

    @Override
    public int getCount() {
        return contacts.length();
    }

    @Override
    public Object getItem(int position) {
        Object o = null;
        try {
             o=contacts.get(position);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.test_list_item_layout, parent, false);
            holder.text = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        try {
            holder.text.setText(contacts.get(position).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return convertView;
    }
    class HeaderViewHolder {
        TextView text;
    }

    class ViewHolder {
        TextView text;
    }

}
