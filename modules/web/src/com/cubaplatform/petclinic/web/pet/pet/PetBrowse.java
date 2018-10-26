package com.cubaplatform.petclinic.web.pet.pet;

import com.cubaplatform.petclinic.entity.pet.Pet;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("petclinic_Pet.browse")
@UiDescriptor("pet-browse.xml")
@LookupComponent("petsTable")
public class PetBrowse extends StandardLookup<Pet> {

    @Inject
    private Screens screens;

    @Subscribe("createDiseaseWarningMailing")
    public void createDiseaseWarningMailing(Action.ActionPerformedEvent actionPerformedEvent) {
        screens.create(CreateDiseaseWarningMailing.class, OpenMode.DIALOG).show();
    }
}