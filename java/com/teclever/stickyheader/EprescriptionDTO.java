package com.teclever.stickyheader;

import java.util.ArrayList;
import java.util.Date;



import java.util.List;

//import com.medicalhealthrecordservice.datatypes.Patient;
//import com.medicalhealthrecordservice.mobiledto.ListOfTestDTO;
//import com.medicalhealthrecordservice.mobiledto.ProductSlot;
//import com.medicalhealthrecordservice.mobiledto.SvrResp;
//import com.medicalhealthrecordservice.datatypes.Vitals;

 public class EprescriptionDTO {
    //private SvrResp sRsp; /* Server response object */

    private String usid; /* user login id */
    private String psw; /* password */
    private String fid; /* facebook id */
    private String pid; /* Patient id */
    private String responseCode;

    private String ulpid; /* user Login patent id */
    private String os; /* type of os */
    private String apptId;
    private String instituteId;
    private String partnerPartyId;
    private String patientPartyId;
    private String dateTime;
    private String patientName;
    private String datePlace;
    private String age;
    private String gender;
    private String dx;
    private String rx;
    private String advice;
    private String doctorNote;
    private String scaleId;
    private String doctorName;
    private String reason;
    private String dob;
    private String place;
    private List<String> symptoms;
    private List<String> physicalExamination;
    private List<String> tests;
    private List<String> diagnosis;
    private String SelectedReferrals;
    private String localId;
    private boolean newAppt;
    int firstTime;
    private String appUniqueId;
    private String loginType;
    

    private String medicationName;
    private String dose;
    private int doseType;
    private String howOftenTaken;
    private String days;
    private String id;
    private String startTime;
    private String startTimePeriod;
    private String docSignature;
    private List<EprescriptionDTO> EPrescriptionList;
   // private List<ProductSlot> productSlotList;
    private String vendingMachineId;
    private String testGiven ;
    //private List<ListOfTestDTO> testNameList;
	private String QRCodeName;
	private int dispencedcount = 0;
	private String medicineType;
	private String productId;
	private String packSize;
	private int prescription_quantity;
	private boolean testUpdate;
	
	private List<RegisterPatientDTO> patList;
	
	public boolean isTestUpdate() {
		return testUpdate;
	}

	public void setTestUpdate(boolean testUpdate) {
		this.testUpdate = testUpdate;
	}

	public String getMedicineType() {
		return medicineType;
	}

	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}

	public String getQRCodeName() {
		return QRCodeName;
	}

	public void setQRCodeName(String qRCodeName) {
		QRCodeName = qRCodeName;
	}

	public int getDispencedcount() {
		return dispencedcount;
	}

	public void setDispencedcount(int dispencedcount) {
		this.dispencedcount = dispencedcount;
	}

	public String getTestGiven() {
		return testGiven;
	}

	public void setTestGiven(String testGiven) {
		this.testGiven = testGiven;
	}

//    public List<ListOfTestDTO> getTestNameList() {
//		return testNameList;
//	}

//	public void setTestNameList(List<ListOfTestDTO> testNameList) {
//		this.testNameList = testNameList;
//	}

	RegisterPatientDTO patVitals;

    public String getDocSignature() {
        return docSignature;
    }

    public void setDocSignature(String docSignature) {
        this.docSignature = docSignature;
    }
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public int getDoseType() {
        return doseType;
    }

    public void setDoseType(int doseType) {
        this.doseType = doseType;
    }

    public String getHowOftenTaken() {
        return howOftenTaken;
    }

    public void setHowOftenTaken(String howOftenTaken) {
        this.howOftenTaken = howOftenTaken;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public List<EprescriptionDTO> getEPrescriptionList() {
        return EPrescriptionList;
    }

    public void setEPrescriptionList(List<EprescriptionDTO> ePrescriptionList) {
        EPrescriptionList = ePrescriptionList;
    }

//    public SvrResp getsRsp() {
//        return sRsp;
//    }
//
//    public void setsRsp(SvrResp sRsp) {
//        this.sRsp = sRsp;
//    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getUlpid() {
        return ulpid;
    }

    public void setUlpid(String ulpid) {
        this.ulpid = ulpid;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getApptId() {
        return apptId;
    }

    public void setApptId(String apptId) {
        this.apptId = apptId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTimePeriod() {
        return startTimePeriod;
    }

    public void setStartTimePeriod(String startTimePeriod) {
        this.startTimePeriod = startTimePeriod;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDatePlace() {
        return datePlace;
    }

    public void setDatePlace(String datePlace) {
        this.datePlace = datePlace;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public String getRx() {
        return rx;
    }

    public void setRx(String rx) {
        this.rx = rx;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getDoctorNote() {
        return doctorNote;
    }

    public void setDoctorNote(String doctorNote) {
        this.doctorNote = doctorNote;
    }

    public String getScaleId() {
        return scaleId;
    }

    public void setScaleId(String scaleId) {
        this.scaleId = scaleId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getPlace() {
        return reason;
    }

    public void setPlace(String place) {
        this.place = place;
    }

//	public List<ProductSlot> getProductSlotList() {
//		return productSlotList;
//	}
//
//	public void setProductSlotList(List<ProductSlot> productSlotList) {
//		this.productSlotList = productSlotList;
//	}

	public String getVendingMachineId() {
		return vendingMachineId;
	}

	public void setVendingMachineId(String vendingMachineId) {
		this.vendingMachineId = vendingMachineId;
	}

	public List<String> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}

	public List<String> getPhysicalExamination() {
		return physicalExamination;
	}

	public void setPhysicalExamination(List<String> physicalExamination) {
		this.physicalExamination = physicalExamination;
	}

	public List<String> getTests() {
		return tests;
	}

	public void setTests(List<String> tests) {
		this.tests = tests;
	}

	public List<String> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(List<String> diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getSelectedReferrals() {
		return SelectedReferrals;
	}

	public void setSelectedReferrals(String selectedReferrals) {
		SelectedReferrals = selectedReferrals;
	}

	public RegisterPatientDTO getPatVitals() {
		return patVitals;
	}

	public void setPatVitals(RegisterPatientDTO patVitals) {
		this.patVitals = patVitals;
	}

	public String getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	public String getPartnerPartyId() {
		return partnerPartyId;
	}

	public void setPartnerPartyId(String partnerPartyId) {
		this.partnerPartyId = partnerPartyId;
	}

	public String getPatientPartyId() {
		return patientPartyId;
	}

	public void setPatientPartyId(String patientPartyId) {
		this.patientPartyId = patientPartyId;
	}

	public String getLocalId() {
		return localId;
	}

	public void setLocalId(String localId) {
		this.localId = localId;
	}

	public boolean isNewAppt() {
		return newAppt;
	}
	
	public void setNewAppt(boolean newAppt) {
		this.newAppt = newAppt;
	}

	public int getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(int firstTime) {
		this.firstTime = firstTime;
	}

	public String getAppUniqueId() {
		return appUniqueId;
	}

	public void setAppUniqueId(String appUniqueId) {
		this.appUniqueId = appUniqueId;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPackSize() {
		return packSize;
	}

	public void setPackSize(String packSize) {
		this.packSize = packSize;
	}

	public int getPrescription_quantity() {
		return prescription_quantity;
	}

	public void setPrescription_quantity(int prescription_quantity) {
		this.prescription_quantity = prescription_quantity;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public List<RegisterPatientDTO> getPatList() {
		return patList;
	}

	public void setPatList(List<RegisterPatientDTO> patList) {
		this.patList = patList;
	}

	
	
	
	
}
