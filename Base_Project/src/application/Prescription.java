package application;

import java.util.Date;

public class Prescription {

	  private int id;
	    private Date date;
	    private String name;
	    private String patientName;
	    private String doctorName;
	    private int doctorId;
	    private int patientId;

	    // Constructor
	    public Prescription(int id, Date date, String name, int patientId,int doctorId,String patientName, String doctorName) {
	        this.id = id;
	        this.date = date;
	        this.name = name;
	        this.patientName = patientName;
	        this.doctorName = doctorName;
	        this.setDoctorId(doctorId);
	        this.setPatientId(patientId);
	    }

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String category) {
	        this.name = category;
	    }

	    public String getPatientName() {
	        return patientName;
	    }

	    public void setPatientName(String patientName) {
	        this.patientName = patientName;
	    }

	    public String getDoctorName() {
	        return doctorName;
	    }

	    public void setDoctorName(String doctorName) {
	        this.doctorName = doctorName;
	    }

		public int getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}

		public int getPatientId() {
			return patientId;
		}

		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}

}
