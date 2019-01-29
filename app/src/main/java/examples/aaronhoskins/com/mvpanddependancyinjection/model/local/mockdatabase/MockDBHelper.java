package examples.aaronhoskins.com.mvpanddependancyinjection.model.local.mockdatabase;

import examples.aaronhoskins.com.mvpanddependancyinjection.model.local.person.Person;

public class MockDBHelper {

    public Person getSinglePerson(String key) {
        return new Person(
                "Charlie",
                "Manson",
                "old",
                "Male",
                "unknown",
                false);
    }
}
