package com.company.jnjrepository.web.screens.staging;

import com.haulmont.cuba.gui.screen.*;
import com.company.jnjrepository.entity.Staging;

@UiController("jnjrepository_Staging.edit")
@UiDescriptor("staging-edit.xml")
@EditedEntityContainer("stagingDc")
@LoadDataBeforeShow
public class StagingEdit extends StandardEditor<Staging> {
}