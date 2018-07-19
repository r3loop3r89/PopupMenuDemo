package com.shra1.popupmenudemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView first;
    TextView second;
    Context mCtx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCtx = this;

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);

        first.setOnClickListener(b -> {
            PopupMenu popupMenu = new PopupMenu(mCtx, first);
            MenuInflater inflater = popupMenu.getMenuInflater();
            inflater.inflate(R.menu.first_popup_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch (item.getItemId()) {

                        case R.id.mnu_one:
                            showToast("CLicked on one");
                            return true;
                        case R.id.mnu_two:
                            showToast("CLicked on two");
                            return true;
                        case R.id.mnu_three:
                            showToast("CLicked on three");
                            return true;
                        default:
                            return false;
                    }
                }
            });

            popupMenu.show();
        });

        second.setOnClickListener(b -> {
            PopupMenu popupMenu = new PopupMenu(mCtx, second);
            MenuInflater inflater = popupMenu.getMenuInflater();
            inflater.inflate(R.menu.second_popup_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch (item.getItemId()) {

                        case R.id.mnu_four:
                            showToast("CLicked on four");
                            return true;
                        case R.id.mnu_five:
                            showToast("CLicked on five");
                            return true;
                        case R.id.mnu_six:
                            showToast("CLicked on six");
                            return true;
                        default:
                            return false;
                    }
                }
            });
            popupMenu.show();
        });
    }

    private void showToast(String text) {
        Toast.makeText(mCtx, text, Toast.LENGTH_SHORT).show();
    }
}
