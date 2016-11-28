package com.teclever.stickyheader;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

//import net.sf.json.JSONArray;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//import com.medicalhealthrecordservice.datatypes.Patient;
//import com.medicalhealthrecordservice.mobiledto.SvrResp;
//import com.medicalhealthrecordservice.datatypes.Vitals;
//import com.medicalhealthrecordservice.mobiledto.*;

public class RegisterPatientDTO {
	 
	private String mailId;
    private String medongoId; // Medongo Id
    private String mobileNo; // Mobile Number
    private String bplCardNo; // BPL Card No
    private String bhamashyaId; // Bhamashya Id
    private String aadharId; // Aadhar Id
    private String instituteId;
    private String roleTypeIdTo;
    private String partnerPartyId;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String selfProfile;
    private String otherName;
    private String relationship;
    private String gender;
    private String DOB;
    private String age;
    private String patientPartyId;
    private String isExistUser;
    private String appt_id;
    private String hemoglobin;
    //private SvrResp sRsp;
    private double heightFt;
    private double heightCms;
    private double pulse;
	private String systolicBloodPressure;
	private Date measurementDate;
	private String measurementTime;	
	private String measurementPeriod;
	private double temperatureCelsius;
	private double temperatureFahrenheit;
	private double respiration;
	private String diabolicBloodPressure;
	private double weightKg;
	private String urineGlucose;
	private String parentPartyId;
	private String spo2;
	private String imageURL;
	private String doctorId;
    private String status;
	private String sessionId;
	private int apiKey;
	private String tokenId;
	private String searchKey;
	private String pregnancyStatus;
	private String maritalStatus;
	private String religion;
	private double bloodGlucose;
	private int evaluateDOB;
	private String appt_datetime;
	private String address;
	private String nickName;
	private Date created_appt_time;
	
	private String localId;
    private boolean exsistUser;
	private String result;
	
	private List<JSONArray> heightList;
	private List<JSONArray> weightList;
	private List<JSONArray> tempList;
	private List<JSONArray> UGList;
	private List<JSONArray> SPO2List;
	private List<JSONArray> respiratoryList;
	private List<JSONArray> hemoglobinList;
	private List<JSONArray> systolicList;
	private List<JSONArray> diabolicList;
	private List<JSONArray> pulseList;
	private List<JSONArray> BGList;
	
	EprescriptionDTO prescription;
	
    //private List<Patient> familyList;
    private List<RegisterPatientDTO> kinList;
   // private List<DoctorDetailsForTdyPatForMob> docDeatilsList;
    private Set<String> medongoIds;
    
    public double getBloodGlucose() {
		return bloodGlucose;
	}

	public void setBloodGlucose(double bloodGlucose) {
		this.bloodGlucose = bloodGlucose;
	}
   
    
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public String getPregnancyStatus() {
        return pregnancyStatus;
    }

    public void setPregnancyStatus(String pregnancyStatus) {
        this.pregnancyStatus = pregnancyStatus;
    }
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getsearchKey() {
        return searchKey;
    }

    public void setsearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
    
    public int getApiKey() {
        return apiKey;
    }

    public void setApiKey(int apiKey) {
        this.apiKey = apiKey;
    }
    
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
    
//    public List<DoctorDetailsForTdyPatForMob> getDocDeatilsList(){
//    	return docDeatilsList;
//    }
//    public void setDocDeatilsList(List<DoctorDetailsForTdyPatForMob> docDeatilsList){
//    	this.docDeatilsList=docDeatilsList;
//
//    }
    
//    public SvrResp getsRsp() {
//		return sRsp;
//	}
//	public void setsRsp(SvrResp sRsp) {
//		this.sRsp = sRsp;
//	}
    public String getAadharId() {
        return aadharId;
    }

    public void setAadharId(String aadharId) {
        this.aadharId = aadharId;
    }

    public String getBhamashyaId() {
        return bhamashyaId;
    }

    public void setBhamashyaId(String bhamashyaId) {
        this.bhamashyaId = bhamashyaId;
    }

    public String getBplCardNo() {
        return bplCardNo;
    }

    public void setBplCardNo(String bplCardNo) {
        this.bplCardNo = bplCardNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMedongoId() {
        return medongoId;
    }

    public void setMedongoId(String medongoId) {
        this.medongoId = medongoId;
    }
	
    public void setInstituteId(String instituteId){
    	this.instituteId=instituteId;
    	
    }
    
    public String getInstituteId(){
    	return instituteId;
    }

//    public List<Patient> getFamilyList() {
//		return familyList;
//	}
//	public void setFamilyList(List<Patient> familyList) {
//		this.familyList = familyList;
//	}

	public List<RegisterPatientDTO> getKinList() {
		return kinList;
	}

	public void setKinList(List<RegisterPatientDTO> kinList) {
		this.kinList = kinList;
	}

	public void setRoleTypeIdTo(String roleTypeIdTo){
    	this.roleTypeIdTo=roleTypeIdTo;
    }
    public String getRoleTypeIdTo(){
    	return roleTypeIdTo;
    }
    public String getPartnerPartyId(){
    	return partnerPartyId;
    }
    public void setPartnerPartyId(String partnerPartyId){
    	this.partnerPartyId=partnerPartyId;
    }
    public String getFirstName(){
    	return firstName;
    }
    public void setFirstName(String firstName){
    	this.firstName=firstName;
    }
    
    public void setSelfProfile(String selfProfile){
    	this.selfProfile=selfProfile;
    }
    public String getSelfProfile(){
    	return selfProfile;
    }
    public void setOtherName(String otherName){
    	this.otherName=otherName;
    }
    public String getOtherName(){
    	return otherName;
    }
    public void setRelationship(String relationship){
    	this.relationship=relationship;
    }
    public String getRelationship(){
    	return relationship;
    }
    public void setDOB(String DOB){
    	this.DOB=DOB;
    }
    public String getDOB(){
    	return DOB;
    }
    public void setGender(String gender){
    	this.gender=gender;
    }
    public String getGender(){
    	return gender;
    }
    public void setAge(String age){
    	this.age=age;
    }
    public String getAge(){
    	return age;
    }

    public void setPatientPartyId(String patientPartyId){
    	this.patientPartyId=patientPartyId;
    }
    public String getPatientPartyId(){
    	return patientPartyId;
    }
    public void setIsExistUser(String isExistUser){
    	this.isExistUser=isExistUser;
    }
    public String getIsExistUser(){
    	return isExistUser;
    }
    public void setAppt_id(String appt_id){
    	this.appt_id=appt_id;
    }
    public String getAppt_id(){
    	return appt_id;
    }
    
    
    
    public void setHemoglobin(String hemoglobin){
    	this.hemoglobin=hemoglobin;
    }
    public String getHemoglobin(){
    	return hemoglobin;
    }
    
    public String getDiabolicBloodPressure() {
		return diabolicBloodPressure;
	}

	public void setDiabolicBloodPressure(String diabolicBloodPressure) {
		this.diabolicBloodPressure = diabolicBloodPressure;
	}
	
	public String getSystolicBloodPressure() {
		return systolicBloodPressure;
	}

	public void setSystolicBloodPressure(String systolicBloodPressure) {
		this.systolicBloodPressure = systolicBloodPressure;
	}
	
	public double getPulse() {
		return pulse;
	}

	public void setPulse(double pulse) {
		this.pulse = pulse;
	}
	
	public double getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(double weightKg) {
		this.weightKg = weightKg;
	}
	public double getHeightFt() {
		return heightFt;
	}

	public void setHeightFt(double heightFt) {
		this.heightFt = heightFt;
	}
	public double getRespiration() {
		return respiration;
	}

	/**
	 * @param respiration the respiration to set
	 */
	public void setRespiration(double respiration) {
		this.respiration = respiration;
	}
	public double getTemperatureCelsius() {
		return temperatureCelsius;
	}

	public void setTemperatureCelsius(double temperatureCelsius) {
		this.temperatureCelsius = temperatureCelsius;
	}
	public double getTemperatureFahrenheit() {
		return temperatureFahrenheit;
	}

	public void setTemperatureFahrenheit(double temperatureFahrenheit) {
		this.temperatureFahrenheit = temperatureFahrenheit;
	}
	
	public void setMeasurementDate(Date measurementDate){
    	this.measurementDate=measurementDate;
    }
    public Date getMeasurementDate(){
    	return measurementDate;
    }
    
    public void setMeasurementTime(String measurementTime){
    	this.measurementTime=measurementTime;
    }
    public String getMeasurementTime(){
    	return measurementTime;
    }
    
    public void setMeasurementPeriod(String measurementPeriod){
    	this.measurementPeriod=measurementPeriod;
    }
    public String getMeasurementPeriod(){
    	return measurementPeriod;
    }
    
    public void setUrineGlucose(String urineGlucose){
    	this.urineGlucose=urineGlucose;
    }
    public String getUrineGlucose(){
    	return urineGlucose;
    }
    
    public void setMailId(String mailId){
    	this.mailId=mailId;
    }
    public String getMailId(){
    	return mailId;
    }
    
    public void setParentPartyId(String parentPartyId){
    	this.parentPartyId=parentPartyId;
    }
    public String getParentPartyId(){
    	return parentPartyId;
    }
    
    public void setSpo2(String spo2){
    	this.spo2=spo2;
    }
    public String getSpo2(){
    	return spo2;
    }
    public void setImageURL(String imageURL){
    	this.imageURL=imageURL;
    }
    public String getImageURL(){
    	return imageURL;
    }
    public void setEvaluateDOB(int evaluateDOB){
    	this.evaluateDOB=evaluateDOB;
    }
    public int getEvaluateDOB(){
    	return evaluateDOB;
    }
    
    public List<JSONArray > getHeightList(){
    	return heightList;
    }
    public void setHeightList(List<JSONArray > heightList){
    	this.heightList=heightList;
    	
    }
    
    public List<JSONArray > getWeightList(){
    	return weightList;
    }
    public void setWeightList(List<JSONArray > weightList){
    	this.weightList=weightList;
    	
    }
    
    public List<JSONArray > getTempList(){
    	return tempList;
    }
    public void setTempList(List<JSONArray > tempList){
    	this.tempList=tempList;
    	
    }
    
    public List<JSONArray > getUGList(){
    	return UGList;
    }
    public void setUGList(List<JSONArray > UGList){
    	this.UGList=UGList;
    	
    }
    
    public List<JSONArray > getSPO2List(){
    	return SPO2List;
    }
    public void setSPO2List(List<JSONArray > SPO2List){
    	this.SPO2List=SPO2List;
    	
    }
    
    public List<JSONArray > getRespiratoryList(){
    	return respiratoryList;
    }
    public void setRespiratoryList(List<JSONArray > respiratoryList){
    	this.respiratoryList=respiratoryList;
    	
    }
    public List<JSONArray > getHemoglobinList(){
    	return hemoglobinList;
    }
    public void setHemoglobinList(List<JSONArray > hemoglobinList){
    	this.hemoglobinList=hemoglobinList;
    	
    }
    public List<JSONArray > getSystolicList(){
    	return systolicList;
    }
    public void setSystolicList(List<JSONArray > systolicList){
    	this.systolicList=systolicList;
    	
    }
    public List<JSONArray > getDiabolicList(){
    	return diabolicList;
    }
    public void setDiabolicList(List<JSONArray > diabolicList){
    	this.diabolicList=diabolicList;
    }
    
    public List<JSONArray > getPulseList(){
    	return pulseList;
    }
    public void setPulseList(List<JSONArray > pulseList){
    	this.pulseList=pulseList;
    }
    public List<JSONArray > getBGList(){
    	return BGList;
    }
    public void setBGList(List<JSONArray > BGList){
    	this.BGList=BGList;
    }

	public EprescriptionDTO getPrescription() {
		return prescription;
	}

	public void setPrescription(EprescriptionDTO prescription) {
		this.prescription = prescription;
	}

	public double getHeightCms() {
		return heightCms;
	}

	public void setHeightCms(double heightCms) {
		this.heightCms = heightCms;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getAppt_datetime() {
		return appt_datetime;
	}

	public void setAppt_datetime(String appt_datetime) {
		this.appt_datetime = appt_datetime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocalId() {
		return localId;
	}

	public void setLocalId(String localId) {
		this.localId = localId;
	}
		public boolean isExsistUser() {
		return exsistUser;
	}

	public void setExsistUser(boolean exsistUser) {
		this.exsistUser = exsistUser;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Set<String> getMedongoIds() {
		return medongoIds;
	}

	public void setMedongoIds(Set<String> medongoIds) {
		this.medongoIds = medongoIds;
	}


	public Date getCreated_appt_time() {
		return created_appt_time;
	}

	public void setCreated_appt_time(Date created_appt_time) {
		this.created_appt_time = created_appt_time;
	}
    
}
