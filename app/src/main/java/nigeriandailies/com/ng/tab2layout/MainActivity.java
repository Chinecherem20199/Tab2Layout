package nigeriandailies.com.ng.tab2layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Initialize Variable
   private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private TabAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Testing App");

        //assign a variable
        mTabLayout = findViewById(R.id.tabs);
        mViewPager = findViewById(R.id.view_pager);

        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "Chat");
        adapter.addFragment(new Tab2Fragment(), "Call");
        adapter.addFragment(new Tab3Fragment(), "Favourite");
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);

        // Adding Floating Action Bar
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//        //Adding View Pager
//        viewPager = (ViewPager) findViewById(R.id.view_pager);
//        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(viewPagerAdapter);
//        tabLayout.setupWithViewPager(viewPager);
    }

}