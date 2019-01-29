package examples.aaronhoskins.com.mvpanddependancyinjection.dagger.components;

import dagger.Component;
import examples.aaronhoskins.com.mvpanddependancyinjection.dagger.modules.PersonModule;
import examples.aaronhoskins.com.mvpanddependancyinjection.model.local.person.Person;

@Component(modules = PersonModule.class)
public interface PersonComponent {
    Person getPerson();

}
