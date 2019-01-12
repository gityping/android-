package com.example.govlan.demoapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.govlan.demoapp.R;
import com.example.govlan.demoapp.custom.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private Banner banner;
    //设置图片资源:url或本地资源
    String[] images= new String[] {
            "http://218.192.170.132/BS80.jpg",
            "http://img.zcool.cn/community/0166c756e1427432f875520f7cc838.jpg",
            "http://img.zcool.cn/community/018fdb56e1428632f875520f7b67cb.jpg",
            "http://img.zcool.cn/community/01c8dc56e1428e6ac72531cbaa5f2c.jpg",
            "http://img.zcool.cn/community/01fda356640b706ac725b2c8b99b08.jpg",
            "http://img.zcool.cn/community/01fd2756e142716ac72531cbf8bbbf.jpg",
            "http://img.zcool.cn/community/0114a856640b6d32f87545731c076a.jpg"};
    List<String> img = new ArrayList<>();
    List<String> titleList = new ArrayList<>();

    //设置图片标题:自动对应
    String[] titles=new String[]{"十大星级品牌联盟，全场2折起","全场2折起","十大星级品牌联盟","嗨购5折不要停","12趁现在","嗨购5折不要停，12.12趁现在","实打实大顶顶顶顶"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        img.add("https://f11.baidu.com/it/u=1090114303,2414848395&fm=72");
        img.add("http://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&hd=undefined&latest=undefined&copyright=undefined&cs=1490181267,4236288114&os=57667783,158422104&simid=4173148927,460939084&pn=8&rn=1&di=99254555730&ln=1674&fr=&fmq=1547281906409_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=http%3A%2F%2Fpic22.nipic.com%2F20120625%2F8534374_064230576000_2.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        img.add("http://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&hd=undefined&latest=undefined&copyright=undefined&cs=1490181267,4236288114&os=57667783,158422104&simid=4173148927,460939084&pn=8&rn=1&di=99254555730&ln=1674&fr=&fmq=1547281906409_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=http%3A%2F%2Fpic22.nipic.com%2F20120625%2F8534374_064230576000_2.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        img.add("http://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&hd=undefined&latest=undefined&copyright=undefined&cs=1490181267,4236288114&os=57667783,158422104&simid=4173148927,460939084&pn=8&rn=1&di=99254555730&ln=1674&fr=&fmq=1547281906409_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=http%3A%2F%2Fpic22.nipic.com%2F20120625%2F8534374_064230576000_2.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        img.add("http://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&hd=undefined&latest=undefined&copyright=undefined&cs=1490181267,4236288114&os=57667783,158422104&simid=4173148927,460939084&pn=8&rn=1&di=99254555730&ln=1674&fr=&fmq=1547281906409_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=http%3A%2F%2Fpic22.nipic.com%2F20120625%2F8534374_064230576000_2.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        img.add("http://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&hd=undefined&latest=undefined&copyright=undefined&cs=1490181267,4236288114&os=57667783,158422104&simid=4173148927,460939084&pn=8&rn=1&di=99254555730&ln=1674&fr=&fmq=1547281906409_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=http%3A%2F%2Fpic22.nipic.com%2F20120625%2F8534374_064230576000_2.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        img.add("http://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&hd=undefined&latest=undefined&copyright=undefined&cs=1490181267,4236288114&os=57667783,158422104&simid=4173148927,460939084&pn=8&rn=1&di=99254555730&ln=1674&fr=&fmq=1547281906409_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=http%3A%2F%2Fpic22.nipic.com%2F20120625%2F8534374_064230576000_2.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined");
        titleList.add("十大星级品牌联盟");
        titleList.add("嗨购5折不要停");
        titleList.add("十大星级品牌联盟");
        titleList.add("嗨购5折不要停");
        titleList.add("十大星级品牌联盟");
        titleList.add("嗨购5折不要停");
        titleList.add("十大星级品牌联盟");
        banner = view.findViewById(R.id.banner);
        //设置样式,默认为:Banner.NOT_INDICATOR(不显示指示器和标题)
        //可选样式如下:
        //1. Banner.CIRCLE_INDICATOR    显示圆形指示器
        //2. Banner.NUM_INDICATOR   显示数字指示器
        //3. Banner.NUM_INDICATOR_TITLE 显示数字指示器和标题
        //4. Banner.CIRCLE_INDICATOR_TITLE  显示圆形指示器和标题
//        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        //设置轮播样式（没有标题默认为右边,有标题时默认左边）
        //可选样式:
        //Banner.LEFT   指示器居左
        //Banner.CENTER 指示器居中
        //Banner.RIGHT  指示器居右
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //设置轮播要显示的标题和图片对应（如果不传默认不显示标题）
//        banner.setBannerTitles(titleList);
        //设置是否自动轮播（不设置则默认自动）
        banner.isAutoPlay(true);
        //设置轮播图片间隔时间（不设置默认为2000）
        banner.setDelayTime(5000);
        //设置图片资源:可选图片网址/资源文件，默认用Glide加载,也可自定义图片的加载框架
        //所有设置参数方法都放在此方法之前执行
        //banner.setImages(images);
        //自定义图片加载框架
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(img);
        banner.start();
//        banner.setImages(images, new Banner.OnLoadImageListener() {
//            @Override
//            public void OnLoadImage(ImageView view, Object url) {
//                System.out.println("加载中");
//                Glide.with(getActivity().getApplicationContext()).load(url).into(view);
//                System.out.println("加载完");
//            }
//        });
//        //设置点击事件，下标是从1开始
//        banner.setOnBannerClickListener(new Banner.OnBannerClickListener() {//设置点击事件
//            @Override
//            public void OnBannerClick(View view, int position) {
//                Toast.makeText(getApplicationContext(), "你点击了：" + position, Toast.LENGTH_LONG).show();
//            }
//        });
    }
}
