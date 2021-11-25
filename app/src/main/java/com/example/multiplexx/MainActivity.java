package com.example.multiplexx;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multiplexx.adapter.MainRecyclerAdapter;
import com.example.multiplexx.adapter.Multiplexx;
import com.example.multiplexx.adapter.MultiplexxPagerAdapter;
import com.example.multiplexx.model.AllCategory;
import com.example.multiplexx.model.categoryitem;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MultiplexxPagerAdapter multiplexxPagerAdapter;
    View multiplexxViewPager;
    TabLayout tabLayout;

    List<Multiplexx> homemultiplexxList;
    List<Multiplexx> moviesmultiplexxList;
    List<Multiplexx> seriesmultiplexxList;
NestedScrollView nestedScrollView;
AppBarLayout appBarLayout;


    MainRecyclerAdapter mainRecyclerAdapter;
    RecyclerView mainRecycler;
    List<AllCategory>allCategoryList;


    public MainActivity(TabLayout tabLayout) {
        this.tabLayout = tabLayout;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tab_indicator);
        nestedScrollView=findViewById(R.id.nested_scroll);

        appBarLayout=findViewById(R.id.appbar);
        homemultiplexxList = new ArrayList<>();
        homemultiplexxList.add(new Multiplexx(1, "", "", ""));
        homemultiplexxList.add(new Multiplexx(2, "", "", ""));
        homemultiplexxList.add(new Multiplexx(3, "", "", ""));
        homemultiplexxList.add(new Multiplexx(4, "", "", ""));
        homemultiplexxList.add(new Multiplexx(5, "", "", ""));



        moviesmultiplexxList = new ArrayList<>();
        moviesmultiplexxList.add(new Multiplexx(1, "Next Avengers", "https://i.supernova.to/mb_000_626.jpg", ""));
        moviesmultiplexxList.add(new Multiplexx(2, "Killer cover up", "https://i.supernova.to/mb_227_227397.jpg", ""));
        moviesmultiplexxList.add(new Multiplexx(3, "Adele", "https://i.supernova.to/mb_227_227394.jpg", ""));
        moviesmultiplexxList.add(new Multiplexx(4, "Red Notice", "https://i.supernova.to/mb_227_227391.jpg", ""));
        moviesmultiplexxList.add(new Multiplexx(5, "Love Hard", "https://i.supernova.to/mb_227_227387.jpg", ""));

        seriesmultiplexxList = new ArrayList<>();
        seriesmultiplexxList.add(new Multiplexx(1, "Insecure", "https://i.supernova.to/tb_144_144503.jpg", ""));
        seriesmultiplexxList.add(new Multiplexx(2, "Ghost Adventures", "https://i.supernova.to/tb_010_10219.jpg", ""));
        seriesmultiplexxList.add(new Multiplexx(3, "Yellow Stone", "https://i.supernova.to/tb_167_167381.jpg", ""));
        seriesmultiplexxList.add(new Multiplexx(4, "Heartland", "https://i.supernova.to/tb_008_8460.jpg", ""));
        seriesmultiplexxList.add(new Multiplexx(5, "Fear the Walking dead", "https://i.supernova.to/tb_093_93305.jpg", ""));


         setMultiplexxPagerAdapter(moviesmultiplexxList);



        List<categoryitem>homesamListitem1=new ArrayList<>();
        homesamListitem1.add(new categoryitem(1,"love and other drugs","https://images-na.ssl-images-amazon.com/images/S/pv-target-images/0e7cbfa9cd04e11933a5a882b4c0b8abd2b52ac40d2ef3dd6f45aa93ad4eb6d3._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
        homesamListitem1.add(new categoryitem(2,"Eureka","https://images-na.ssl-images-amazon.com/images/S/pv-target-images/dacf6904f34b87faa7fd7124fe3018fce5d5a49e0178003c9c2a67dd6d605d39._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
        homesamListitem1.add(new categoryitem(3,"psych","https://images-na.ssl-images-amazon.com/images/S/pv-target-images/cf9e28d9dc26a90062f5379077640c73885e50701b535f619304fed26b1466a3._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
        homesamListitem1.add(new categoryitem(4,"Britannia II","https://images-na.ssl-images-amazon.com/images/S/pv-target-images/e4d339d0d1ea295096edaf3df284928ee6ed61bad57780106e99224be7f22839._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
        homesamListitem1.add(new categoryitem(5,"heavy metal","https://images-na.ssl-images-amazon.com/images/S/pv-target-images/a9e9a69b89f561571629f2de89dcea3c2a2398ca91b53a71e86f6133fbba2245._UR1920,1080_RI_SX356_FMwebp_.jpg",""));



        allCategoryList=new ArrayList<>();
        allCategoryList.add(new AllCategory(1,"Mystery and thriller movies\n",homesamListitem1));
        allCategoryList.add(new AllCategory(2,"Science fiction movies\n",homesamListitem1));
        allCategoryList.add(new AllCategory(3,"Comedy TV",homesamListitem1));

        setMainRecycler(allCategoryList);
    }




    private void setMultiplexxPagerAdapter(List<Multiplexx> multiplexList) {

        multiplexxViewPager = findViewById(R.id.multiplexx_viewPager);
        multiplexxPagerAdapter = new MultiplexxPagerAdapter(this, multiplexList);

     }




    public void setMainRecycler(List<AllCategory> allCategoryList) {

        mainRecycler=findViewById(R.id.main_recycler);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        mainRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter= new MainRecyclerAdapter(this,allCategoryList);
        mainRecycler.setAdapter(mainRecyclerAdapter);
    }

}




