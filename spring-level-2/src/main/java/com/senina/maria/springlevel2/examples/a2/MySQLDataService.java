package com.senina.maria.springlevel2.examples.a2;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    }
}
