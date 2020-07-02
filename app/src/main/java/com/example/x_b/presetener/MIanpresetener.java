package com.example.x_b.presetener;

import com.example.x_b.AFragment;
import com.example.x_b.Bean;
import com.example.x_b.ResultCallback;
import com.example.x_b.model.MIanmodel;
import com.example.x_b.view.Mianview;

public class MIanpresetener {
    private Mianview mianview;
    private MIanmodel mIanmodel;

    public MIanpresetener(Mianview mianview) {

        this.mianview = mianview;
        mIanmodel=new MIanmodel();
    }

    public void getdtaa() {
        mIanmodel.getdtaa(new ResultCallback<Bean>() {
            @Override
            public void onsuccess(Bean bean) {
                mianview.onsuccess(bean);
            }
        });
    }
}
