package examples.aaronhoskins.com.mvpanddependancyinjection.view.activities.mainactivity;

import examples.aaronhoskins.com.mvpanddependancyinjection.dagger.components.DaggerPersonComponent;
import examples.aaronhoskins.com.mvpanddependancyinjection.dagger.components.PersonComponent;
import examples.aaronhoskins.com.mvpanddependancyinjection.model.local.mockdatabase.MockDBHelper;

public class MainActivityPresenter {
    MainActivityContract mainActivityContract;
    PersonComponent personComponent;

    public MainActivityPresenter(MainActivityContract mainActivityContract) {
        this.mainActivityContract = mainActivityContract;
        personComponent = DaggerPersonComponent.builder().build();
    }

    public void getPerson() {
        mainActivityContract.passPerson(personComponent.getPerson());
        //mainActivityContract.passPerson(new MockDBHelper().getSinglePerson("someKey"));
    }

    public String getMentalStatus(boolean isSane) {
        return isSane ? "Fit as a fiddle" : "Nutter than the nutty professor";
    }
}
