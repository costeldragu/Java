package com.mdc.enva.Collection.Set.HashSet;

import org.junit.Test;

import static com.mdc.enva.Collection.Set.HashSet.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception {
        ProductCatalouge catalouge = new ProductCatalouge();
        catalouge.isSuppliedBy(bobs);
        catalouge.isSuppliedBy(kates);
        assertThat(catalouge,containsInAnyOrder(door,floorPanel));
    }
}
