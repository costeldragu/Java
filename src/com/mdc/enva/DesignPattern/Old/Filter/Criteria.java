package com.mdc.enva.DesignPattern.Old.Filter;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}