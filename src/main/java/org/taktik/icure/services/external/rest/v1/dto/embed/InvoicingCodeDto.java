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

package org.taktik.icure.services.external.rest.v1.dto.embed;

import java.io.Serializable;

import org.taktik.icure.entities.embed.*;

@SuppressWarnings("UnusedDeclaration")
public class InvoicingCodeDto implements Serializable {
    protected Long dateCode;

    protected String id;
	protected String logicalId; //Stays the same when a code is resent to the IO

    protected String contactId;
    protected String serviceId;
    protected String tarificationId;

	protected String label;

	protected PaymentType paymentType;

    protected Double paid;

    protected Double totalAmount; //=reimbursement+doctorSupplement+intervention
    protected Double reimbursement;
    protected Double patientIntervention;
	protected Double conventionAmount; //Should be reimbursement+intervention
    protected Double doctorSupplement;
	protected Double vat;

	protected Integer invoicePeriod;

    //Etarif
    protected String error;
    protected String contract;
    protected Integer units;
    protected Integer side;
    protected Integer timeOfDay;
	protected Integer eidReadingHour;
	protected String eidReadingValue;
	protected Integer override3rdPayerCode;
    protected String override3rdPayerReason;
    protected String gnotionNihii;
    protected Integer prescriberNorm;
	protected Integer percentNorm;
	protected String prescriberNihii;
    protected String relatedCode;
	protected Boolean canceled;
	protected Boolean accepted;
	protected Boolean pending;
	protected Boolean resent;

    protected Integer insuranceJustification;
	protected Integer cancelPatientInterventionReason;
	protected Integer longDelayJustification;

	protected String gnotionSsin;
	protected String gnotionLastName;
	protected String gnotionFirstName;
	protected String gnotionCdHcParty;
	protected String prescriberSsin;
	protected String prescriberLastName;
	protected String prescriberFirstName;
	protected String prescriberCdHcParty;
	protected String internshipNihii;
	protected String internshipSsin;
	protected String internshipLastName;
	protected String internshipFirstName;
	protected String internshipCdHcParty;
	protected String locationNihii;
	protected String locationCdHcParty;


	public Long getDateCode() {
        return dateCode;
    }

    public void setDateCode(Long dateCode) {
        this.dateCode = dateCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getTarificationId() {
        return tarificationId;
    }

    public void setTarificationId(String tarificationId) {
        this.tarificationId = tarificationId;
    }

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(Double reimbursement) {
        this.reimbursement = reimbursement;
    }

	public Double getVat() {
		return vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}

	public Double getPatientIntervention() {
        return patientIntervention;
    }

    public void setPatientIntervention(Double patientIntervention) {
        this.patientIntervention = patientIntervention;
    }

	public Double getConventionAmount() {
		return conventionAmount;
	}

	public void setConventionAmount(Double conventionAmount) {
		this.conventionAmount = conventionAmount;
	}

	public Double getDoctorSupplement() {
        return doctorSupplement;
    }

    public void setDoctorSupplement(Double doctorSupplement) {
        this.doctorSupplement = doctorSupplement;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    public Integer getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(Integer timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Integer getOverride3rdPayerCode() {
        return override3rdPayerCode;
    }

    public void setOverride3rdPayerCode(Integer override3rdPayerCode) {
        this.override3rdPayerCode = override3rdPayerCode;
    }

    public String getOverride3rdPayerReason() {
        return override3rdPayerReason;
    }

    public void setOverride3rdPayerReason(String override3rdPayerReason) {
        this.override3rdPayerReason = override3rdPayerReason;
    }

    public String getGnotionNihii() {
        return gnotionNihii;
    }

    public void setGnotionNihii(String gnotionNihii) {
        this.gnotionNihii = gnotionNihii;
    }

    public Integer getPrescriberNorm() {
        return prescriberNorm;
    }

    public void setPrescriberNorm(Integer prescriberNorm) {
        this.prescriberNorm = prescriberNorm;
    }

	public Integer getPercentNorm() {
		return percentNorm;
	}

	public void setPercentNorm(Integer percentNorm) {
		this.percentNorm = percentNorm;
	}

	public String getPrescriberNihii() {
        return prescriberNihii;
    }

    public void setPrescriberNihii(String prescriberNihii) {
        this.prescriberNihii = prescriberNihii;
    }

    public String getRelatedCode() {
        return relatedCode;
    }

    public void setRelatedCode(String relatedCode) {
        this.relatedCode = relatedCode;
    }

    public Integer getInsuranceJustification() {
        return insuranceJustification;
    }

    public void setInsuranceJustification(Integer insuranceJustification) {
        this.insuranceJustification = insuranceJustification;
    }

	public Integer getCancelPatientInterventionReason() {
		return cancelPatientInterventionReason;
	}

	public void setCancelPatientInterventionReason(Integer cancelPatientInterventionReason) {
		this.cancelPatientInterventionReason = cancelPatientInterventionReason;
	}

	public Integer getEidReadingHour() {
		return eidReadingHour;
	}

	public void setEidReadingHour(Integer eidReadingHour) {
		this.eidReadingHour = eidReadingHour;
	}

	public Boolean getCanceled() {
		return canceled;
	}

	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public Boolean getPending() {
		return pending;
	}

	public void setPending(Boolean pending) {
		this.pending = pending;
	}

	public Boolean getResent() {
		return resent;
	}

	public void setResent(Boolean resent) {
		this.resent = resent;
	}

	public Integer getLongDelayJustification() {
		return longDelayJustification;
	}

	public void setLongDelayJustification(Integer longDelayJustification) {
		this.longDelayJustification = longDelayJustification;
	}

	public String getEidReadingValue() {
		return eidReadingValue;
	}

	public void setEidReadingValue(String eidReadingValue) {
		this.eidReadingValue = eidReadingValue;
	}

	public String getLogicalId() {
		return logicalId;
	}

	public void setLogicalId(String logicalId) {
		this.logicalId = logicalId;
	}

	public String getGnotionSsin() {
		return gnotionSsin;
	}

	public void setGnotionSsin(String gnotionSsin) {
		this.gnotionSsin = gnotionSsin;
	}

	public String getGnotionLastName() {
		return gnotionLastName;
	}

	public void setGnotionLastName(String gnotionLastName) {
		this.gnotionLastName = gnotionLastName;
	}

	public String getGnotionFirstName() {
		return gnotionFirstName;
	}

	public void setGnotionFirstName(String gnotionFirstName) {
		this.gnotionFirstName = gnotionFirstName;
	}

	public String getGnotionCdHcParty() {
		return gnotionCdHcParty;
	}

	public void setGnotionCdHcParty(String gnotionCdHcParty) {
		this.gnotionCdHcParty = gnotionCdHcParty;
	}

	public String getPrescriberSsin() {
		return prescriberSsin;
	}

	public void setPrescriberSsin(String prescriberSsin) {
		this.prescriberSsin = prescriberSsin;
	}

	public String getPrescriberLastName() {
		return prescriberLastName;
	}

	public void setPrescriberLastName(String prescriberLastName) {
		this.prescriberLastName = prescriberLastName;
	}

	public String getPrescriberFirstName() {
		return prescriberFirstName;
	}

	public void setPrescriberFirstName(String prescriberFirstName) {
		this.prescriberFirstName = prescriberFirstName;
	}

	public String getPrescriberCdHcParty() {
		return prescriberCdHcParty;
	}

	public void setPrescriberCdHcParty(String prescriberCdHcParty) {
		this.prescriberCdHcParty = prescriberCdHcParty;
	}

	public String getInternshipNihii() {
		return internshipNihii;
	}

	public void setInternshipNihii(String internshipNihii) {
		this.internshipNihii = internshipNihii;
	}

	public String getInternshipSsin() {
		return internshipSsin;
	}

	public void setInternshipSsin(String internshipSsin) {
		this.internshipSsin = internshipSsin;
	}

	public String getInternshipLastName() {
		return internshipLastName;
	}

	public void setInternshipLastName(String internshipLastName) {
		this.internshipLastName = internshipLastName;
	}

	public String getInternshipFirstName() {
		return internshipFirstName;
	}

	public void setInternshipFirstName(String internshipFirstName) {
		this.internshipFirstName = internshipFirstName;
	}

	public String getInternshipCdHcParty() {
		return internshipCdHcParty;
	}

	public void setInternshipCdHcParty(String internshipCdHcParty) {
		this.internshipCdHcParty = internshipCdHcParty;
	}

	public String getLocationNihii() {
		return locationNihii;
	}

	public void setLocationNihii(String locationNihii) {
		this.locationNihii = locationNihii;
	}

	public String getLocationCdHcParty() {
		return locationCdHcParty;
	}

	public void setLocationCdHcParty(String locationCdHcParty) {
		this.locationCdHcParty = locationCdHcParty;
	}

	public Integer getInvoicePeriod() { return invoicePeriod; }

	public void setInvoicePeriod(Integer invoicePeriod) { this.invoicePeriod = invoicePeriod; }

}
