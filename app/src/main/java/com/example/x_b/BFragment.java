package com.example.x_b;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.x_b.db.DatasBeanDao;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BFragment extends Fragment {

    private ArrayList<DatasBean> list;
    private Rvadapter rvadapter;
    private View inflate;

    public BFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        inflate = inflater.inflate(R.layout.fragment_b, container, false);

        return inflate;

    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        if(hidden==false){
            initview(inflate);
        }
        super.onHiddenChanged(hidden);
    }

    private void initview(View inflate) {
        RecyclerView rv = inflate.findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        DatasBeanDao datasBeanDao = BaseApp.getInstance().getDaoSession().getDatasBeanDao();

        list = new ArrayList<>();
        List<DatasBean> listbean = datasBeanDao.queryBuilder().list();
        list.addAll(listbean);

        rvadapter = new Rvadapter(list,getContext());
        rv.setAdapter(rvadapter);

    }

}
