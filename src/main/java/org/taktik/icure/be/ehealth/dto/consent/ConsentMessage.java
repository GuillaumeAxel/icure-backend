/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * iCureBackend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * iCureBackend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.taktik.icure.be.ehealth.dto.consent;

import be.fgov.ehealth.hubservices.core.v2.ConsentType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.taktik.icure.be.ehealth.dto.Error;

/**
 * Created with IntelliJ IDEA.
 * User: aduchate
 * Date: 23/06/14
 * Time: 15:37
 * To change this template use File | Settings | File Templates.
 */
public class ConsentMessage implements Serializable {
    protected boolean complete;
    private List<Error> errors = new ArrayList<>();

    private ConsentType consent;

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public ConsentType getConsent() {
        return consent;
    }

    public void setConsent(ConsentType consent) {
        this.consent = consent;
    }
}
