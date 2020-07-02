package com.example.x_b;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.x_b.db.BooleanBeanDao;
import com.example.x_b.db.DatasBeanDao;
import com.example.x_b.presetener.MIanpresetener;
import com.example.x_b.view.Mianview;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment implements Mianview {


    private ArrayList<DatasBean> list;
    private Rvadapter rvadapter;
    private MIanpresetener mIanpresetener;
    private ArrayList<BooleanBean> booleanBeans;
    private BooleanBeanDao booleanBeanDao;


    public AFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_a, container, false);
        mIanpresetener = new MIanpresetener(this);
        if(!EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().register(this);
        }
        initview(inflate);
        return inflate;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getEvb(EvenBusBean busBean){
        if(busBean.getType()==1) {
            // 添加到数据库

            DatasBean datasBean = list.get(busBean.getId());
            DatasBeanDao dao = BaseApp.getInstance().getDaoSession().getDatasBeanDao();
            dao.insertOrReplace(datasBean);
            rvadapter.notifyDataSetChanged();
            Toast.makeText(getContext(), "收藏成功", Toast.LENGTH_SHORT).show();
        }else if(busBean.getType()==2) {
            // 删除数据库
            Toast.makeText(getContext(), "取消插入", Toast.LENGTH_SHORT).show();

        }
    }
    private void initview(View inflate) {
        RecyclerView rv = inflate.findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        list = new ArrayList<>();
        booleanBeans = new ArrayList<>();

        rvadapter = new Rvadapter(list,getContext(),booleanBeans);
        rv.setAdapter(rvadapter);
        initdata();
    }

    private void initdata() {
        mIanpresetener.getdtaa();
    }

    @Override
    public void onsuccess(Bean bean) {
// 获取数据
        booleanBeanDao = BaseApp.getInstance().getDaoSession().getBooleanBeanDao();
        List<DatasBean> datas = bean.getData().getDatas();
        List<BooleanBean> all = booleanBeanDao.loadAll();
        list.addAll(datas);
        booleanBeans.addAll(all);
        Log.d("tag","onsuccess"+datas.toString());
        rvadapter.notifyDataSetChanged();

    }
}
