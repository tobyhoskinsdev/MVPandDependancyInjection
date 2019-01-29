package examples.aaronhoskins.com.mvpanddependancyinjection.view.activities.mainactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import examples.aaronhoskins.com.mvpanddependancyinjection.R;
import examples.aaronhoskins.com.mvpanddependancyinjection.model.local.person.Person;

public class MainActivity extends Activity implements MainActivityContract {
    MainActivityPresenter mainActivityPresenter;
    @BindView(R.id.tvFirstName)
    TextView tvFirstName;
    @BindView(R.id.tvLastName)
    TextView tvLastName;
    @BindView(R.id.tvGender)
    TextView tvGender;
    @BindView(R.id.tvAge)
    TextView tvAge;
    @BindView(R.id.tvBirthdate)
    TextView tvBirthDate;
    @BindView(R.id.tvSanity)
    TextView tvSanity;

    @BindString(R.string.app_name)
    String appName;

    @BindColor(R.color.colorAccent)
    int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityPresenter = new MainActivityPresenter(this);
        ButterKnife.bind(this);
        //bindViews();
    }

    private void bindViews() {
        tvAge = findViewById(R.id.tvAge);
        tvBirthDate = findViewById(R.id.tvBirthdate);
        tvFirstName = findViewById(R.id.tvFirstName);
        tvLastName = findViewById(R.id.tvLastName);
        tvGender = findViewById(R.id.tvGender);
        tvSanity = findViewById(R.id.tvSanity);
    }

    public void onClick(View view) {
        mainActivityPresenter.getPerson();
    }

    @Override
    public void passPerson(Person person) {
        if(person != null) {
            tvAge.setText(person.getAge());
            tvSanity.setText(mainActivityPresenter.getMentalStatus(person.isSane()));
            tvGender.setText(person.getGender());
            tvLastName.setText(person.getLastName());
            tvFirstName.setText(person.getFistName());
            tvBirthDate.setText(person.getBirthDate());
        }
    }
}
