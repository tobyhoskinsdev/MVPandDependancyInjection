package examples.aaronhoskins.com.mvpanddependancyinjection.dagger.modules;

import dagger.Module;
import dagger.Provides;
import examples.aaronhoskins.com.mvpanddependancyinjection.model.local.person.Person;

@Module
public class PersonModule {
    @Provides
    public Person getPerson() {
        return new Person("Aaron",
                "Hoskins",
                "37",
                "male" ,
                "11-30-81",
                false);
    }
}
