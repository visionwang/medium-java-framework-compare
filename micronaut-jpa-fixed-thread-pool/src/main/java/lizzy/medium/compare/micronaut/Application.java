package lizzy.medium.compare.micronaut;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;

@TypeHint(typeNames = {
        "org.postgresql.Driver",
        "org.hibernate.dialect.PostgreSQL10Dialect"
})
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}