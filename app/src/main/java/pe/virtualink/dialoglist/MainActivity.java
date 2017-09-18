package pe.virtualink.dialoglist;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    public void openDialog() {
        final FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            SelectDialogFragment selectDialogFragment = new SelectDialogFragment();
            selectDialogFragment.setCancelable(true);
            fragmentManager.beginTransaction()
                    .add(selectDialogFragment, SelectDialogFragment.TAG)
                    .commitAllowingStateLoss();
        }
    }
}
