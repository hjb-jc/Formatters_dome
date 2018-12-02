package com.nf2.Formatters_dome.formatter;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.util.HashSet;
import java.util.Set;

public class PersonAnnotationFormatter implements AnnotationFormatterFactory<PersonFromId> {
    @Override
    public Set<Class<?>> getFieldTypes() {
        HashSet<Class<?>> types = new HashSet<>();
        types.add(Person.class);
        return types;
    }

    @Override
    public Printer<?> getPrinter(PersonFromId annotation, Class<?> fieldType) {
        return null;
    }

    @Override
    public Parser<?> getParser(PersonFromId annotation, Class<?> fieldType) {
        return getFormatter(annotation);
    }

    private Formatter getFormatter(PersonFromId annotation) {
        return new PersonFormatter();
    }
}
