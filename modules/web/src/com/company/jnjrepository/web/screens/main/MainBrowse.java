package com.company.jnjrepository.web.screens.main;

import com.haulmont.cuba.gui.screen.*;
import com.company.jnjrepository.entity.Main;

@UiController("jnjrepository_Main.browse")
@UiDescriptor("main-browse.xml")
@LookupComponent("mainsTable")
@LoadDataBeforeShow
public class MainBrowse extends StandardLookup<Main> {
}