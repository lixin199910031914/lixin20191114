package com.bawei.lixin20191114.contract;

public class HomeContract {
    interface  Iview{
        void  onCheng(Object obj);
        void  onShiBai(String meg);
    }
    interface  Imodel{
        void  Data(ICallBack iCallBack);
        interface ICallBack{
            void  onCheng(Object obj);
            void  onShiBai(String meg);
        }
    }
    interface Ipresenter{
        void Bang(HomeContract.Iview view);
        void  JieanBang();
        void  ChuShiHua();
    }
}
