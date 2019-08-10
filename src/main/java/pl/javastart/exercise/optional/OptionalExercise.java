package pl.javastart.exercise.optional;

import java.util.Optional;

public class OptionalExercise {

    public Optional createEmptyOptional() {
        return Optional.empty();
    }

    public Optional createOptionalWithValue() {
        return Optional.of("Hello");
    }

    public Optional<String> createOptionalWithValue(String s) {
        Optional<String> optional = Optional.of(s);
        return optional;
    }

    public String getOptionalValueOrDefault(Optional<String> optional, String defaultValue) {

        return optional.orElse(defaultValue);


    }
}
