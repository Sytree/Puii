package com.huii.puii.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.huii.puii.R;
import com.puii.bean.YearPlanBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinlh on 2016/2/25.
 */
public class PlanAdapter extends RecyclerView.Adapter<PlanAdapter.PlanViewHolder> {

    Context mContext;
    LayoutInflater inflater;
    List<YearPlanBean> list = new ArrayList<YearPlanBean>();

    public static PlanAdapter getIstance(Context mContext){
        PlanAdapter adapter = new PlanAdapter();
        adapter.mContext = mContext;
        adapter.inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return adapter;
    }

    public void addData(List<YearPlanBean> list){
        this.list = list;
    }

    @Override
    public PlanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        PlanViewHolder viewHolder = new PlanViewHolder(inflater.inflate(R.layout.item_plan,null));

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PlanViewHolder holder, int position) {
        holder.getContent_textView().setText(list.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class PlanViewHolder extends RecyclerView.ViewHolder{

        private TextView content_textView;

        public PlanViewHolder(View itemView) {
            super(itemView);

            content_textView = (TextView) itemView.findViewById(R.id.item_plan_content);
        }

        public TextView getContent_textView() {
            return content_textView;
        }
    }
}
