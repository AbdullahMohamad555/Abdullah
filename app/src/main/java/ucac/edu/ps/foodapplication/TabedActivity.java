package ucac.edu.ps.foodapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;

public class TabedActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabed);

        /*donationFragment donationFragment = new donationFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.commit();*/

        tab = findViewById(R.id.tabedLayout);
        pager = findViewById(R.id.viewPager);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());

        Category category1 = new Category(0, "Home");
        adapter.AddTabs(new MyTab(category1, HomeFragment.newInstance(1, "Home")));
        //
        Category category2 = new Category(1, "donation");
        adapter.AddTabs(new MyTab(category2, donationFragment.newInstance(2, "donation")));
        //
        Category category3 = new Category(2, "donation2");
        adapter.AddTabs(new MyTab(category3, donation2Fragment.newInstance(3, "donation2")));
        //
        Category category4 = new Category(3, "More");
        adapter.AddTabs(new MyTab(category4, MoreFragment.newInstance(4, "More")));
        //
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);

        tab.getTabAt(0).setIcon(R.drawable.home);
        tab.getTabAt(1).setIcon(R.drawable.hand);
        tab.getTabAt(2).setIcon(R.drawable.mobile);
        tab.getTabAt(3).setIcon(R.drawable.monye);

        BadgeDrawable drawable = tab.getTabAt(0).getOrCreateBadge();
        drawable.setVisible(true);
        drawable.setNumber(6);

    }
}