package com.company.jnjrepository.web.screens.main;

import com.haulmont.cuba.gui.screen.*;
import com.company.jnjrepository.entity.Main;

@UiController("jnjrepository_Main.edit")
@UiDescriptor("main-edit.xml")
@EditedEntityContainer("mainDc")
@LoadDataBeforeShow
public class MainEdit extends StandardEditor<Main> {
}