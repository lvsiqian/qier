package com.example.x_b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.x_b.db.BooleanBeanDao;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

public class Rvadapter extends RecyclerView.Adapter<Rvadapter.ViewHolder> {
    private ArrayList<DatasBean> list;
    private Context context;
    private ArrayList<BooleanBean> booleanBeans;

    public Rvadapter(ArrayList<DatasBean> list, Context context, ArrayList<BooleanBean> booleanBeans) {
        this.list = list;
        this.context = context;
        this.booleanBeans = booleanBeans;
    }
    public Rvadapter(ArrayList<DatasBean> list, Context context) {
        this.list = list;
        this.context = context;

}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item, null);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv.setText(list.get(position).getTitle());
        Glide.with(context).load(list.get(position).getEnvelopePic()).into(holder.iv);
       //用数据控制页面展示


         holder.ck.setChecked(list.get(position).getIsCheckd());
       //BooleanBeanDao booleanBeanDao = BaseApp.getInstance().getDaoSession().getBooleanBeanDao();
       holder.ck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isPressed()){
                  list.get(position).setIsCheckd(isChecked);
                  //  DatasBean datasBean = list.get(position);
                    //插入数据库
                  //  booleanBeanDao.update(new BooleanBean((long) position,true));
                    EventBus.getDefault().post(new EvenBusBean(position,1));
              }else {
                    //取消插入数据库
                   // booleanBeanDao.update(new BooleanBean((long) position,false));
                    EventBus.getDefault().post(new EvenBusBean(position,2));
                }


           }

      });
 }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView iv;
        public TextView tv;
        public CheckBox ck;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv = (ImageView) itemView.findViewById(R.id.iv);
            this.tv = (TextView) itemView.findViewById(R.id.tv);
            this.ck = (CheckBox) itemView.findViewById(R.id.ck);
        }
    }


}
