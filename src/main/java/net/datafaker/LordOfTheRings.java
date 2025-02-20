package net.datafaker;

/**
 * @since 0.8.0
 */
public class LordOfTheRings extends AbstractProvider {

    protected LordOfTheRings(final Faker faker) {
        super(faker);
    }

    public String character() {
        return faker.resolve("lord_of_the_rings.characters");
    }

    public String location() {
        return faker.resolve("lord_of_the_rings.locations");
    }
}
