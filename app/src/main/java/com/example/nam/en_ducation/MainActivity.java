package com.example.nam.en_ducation;

import java.util.Locale;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    SectionsPagerAdapter mSectionsPagerAdapter;
    Button button4;
      ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);


        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

        // For each of the sections in the app, add a tab to the action bar.
        for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
            // this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mSectionsPagerAdapter.getPageTitle(i))
                            .setTabListener(this));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      //  int id = item.getItemId();

       // if (id == R.id.action_settings) {
         //   return true;
       // }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
               // case 0:
                 //   return "หน้าหลัก";
                case 0:
                    return "บทเรียนภาษาไทย";
                case 1:
                    return "บทเรียนภาษาอังกฤษ";
            }
            return null;
        }
    }


    public static class PlaceholderFragment extends Fragment{

        Button a;


        private static final String ARG_SECTION_NUMBER = "section_number";

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            int sectionNumber = getArguments ().getInt(ARG_SECTION_NUMBER);
            View rootView;

            switch(sectionNumber) {
               // case 1:
                 //   rootView = inflater.inflate(R.layout.fragment_main, container, false);

                   // break;
                case 1:

                    rootView = inflater.inflate(R.layout.fragment_learn, container, false);
                    ImageButton payan = (ImageButton) rootView.findViewById(R.id.thai1);
                    ImageButton sara = (ImageButton) rootView.findViewById(R.id.thai2);
                    ImageButton wannayuk = (ImageButton) rootView.findViewById(R.id.thai3);

                    ImageButton vocab = (ImageButton) rootView.findViewById(R.id.thai4);
                    payan.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(getActivity(), Thai1Activity.class);
                            startActivity(intent);
                        }
                    });
                    sara.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(getActivity(), Thai2Activity.class);
                            startActivity(intent);
                        }
                    });
                    wannayuk.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(getActivity(), Thai3Activity.class);
                            startActivity(intent);
                        }
                    });

                    vocab.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(getActivity(), Thai4Activity.class);
                            startActivity(intent);
                        }
                    });
                    break;
                case 2:
                    rootView = inflater.inflate(R.layout.fragment_game, container, false);
                    ImageView eng1 = (ImageView) rootView.findViewById(R.id.eng1);
                    ImageView eng2 = (ImageView) rootView.findViewById(R.id.eng2);
                    ImageView eng3 = (ImageView) rootView.findViewById(R.id.eng3);
                    ImageView eng4 = (ImageView) rootView.findViewById(R.id.eng4);
                    ImageView eng5 = (ImageView) rootView.findViewById(R.id.eng5);
                    ImageView eng6 = (ImageView) rootView.findViewById(R.id.eng6);
                    ImageView eng7 = (ImageView) rootView.findViewById(R.id.eng7);
                    ImageView eng8 = (ImageView) rootView.findViewById(R.id.eng8);

                    eng1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(),EngEn1.class);
                            startActivity(intent);
                        }
                    });
                    eng2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(),EngEn2.class);
                            startActivity(intent);
                        }
                    });
                    eng3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(),EngEn3.class);
                            startActivity(intent);
                        }
                    });
                    eng4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(),EngEn4.class);
                            startActivity(intent);
                        }
                    });
                    eng5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(),EngEn5.class);
                            startActivity(intent);
                        }
                    });
                    eng6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(),EngEn6.class);
                            startActivity(intent);
                        }
                    });

                    eng7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(),EngEn7.class);
                            startActivity(intent);
                        }
                    });
                    eng8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(),EngEn8.class);
                            startActivity(intent);
                        }
                    });

                    break;
                default:
                    rootView = inflater.inflate(R.layout.fragment_main, container, false);
                    break;
            }
            return rootView;
        }
    }
    public void onBackPressed() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Exit");
        dialog.setIcon(R.drawable.logo);
        dialog.setCancelable(true);
        dialog.setMessage("คุณต้องการออกจากโปรแกรมใช่หรือไม่");
        dialog.setPositiveButton("ใช่", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        dialog.setNegativeButton("ไม่", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dialog.show();
    }
}
