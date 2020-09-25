package com.company.jnjrepository.web.screens.staging;

import com.haulmont.cuba.gui.screen.*;
import com.company.jnjrepository.entity.Staging;

@UiController("jnjrepository_Staging.browse")
@UiDescriptor("staging-browse.xml")
@LookupComponent("stagingsTable")
@LoadDataBeforeShow
public class StagingBrowse extends StandardLookup<Staging> {
}