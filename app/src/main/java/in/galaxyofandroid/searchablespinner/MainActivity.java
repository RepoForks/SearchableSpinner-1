package in.galaxyofandroid.searchablespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import in.galaxyofandroid.spinerdialog.IdentifiableObject;
import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

public class MainActivity extends AppCompatActivity {
    ArrayList<IdentifiableObject> items = new ArrayList<>();
    SpinnerDialog spinnerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView selectedItems = (TextView) findViewById(R.id.txt);


        items.add(new IdentifiableObject("Mumbai", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Delhi", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Bengaluru", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Hyderabad", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Ahmedabad", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Chennai", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Kolkata", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Surat", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Pune", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Jaipur", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Lucknow", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));
        items.add(new IdentifiableObject("Kanpur", "India", 0, R.drawable.ic_checkbox_marked_circle_outline_white_18dp));

        spinnerDialog = new SpinnerDialog(MainActivity.this, items, "Select or Search City", R.style.DialogAnimations_SmileWindow, R.drawable.ic_map_marker_white_24dp, R.drawable.ic_crosshairs_gps_white_18dp);

        spinnerDialog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(IdentifiableObject item, int position) {
                Toast.makeText(MainActivity.this, item.getTitle() + "  " + item.getRecourseId() + "", Toast.LENGTH_SHORT).show();
                selectedItems.setText(item.getTitle() + " Position: " + item.getSubtitle());
            }
        });

        findViewById(R.id.show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerDialog.showSpinerDialog();
            }
        });
    }


}
