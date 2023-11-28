import jdk.vm.ci.meta.Local;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.time.LocalDate;



public class Patient {
    private final String name;
    private final String picurl;
    private final int age;
    protected String mriurl;
    protected int fieldStrength;
    protected LocalDate datemri;
    protected int systolicPressure;
    protected int diastolicPressure;
    protected LocalDate datebp;
    protected String measureType;


    public Patient(String name, int age, String picurl, String mriurl, int fieldStrength, LocalDate datemri,int systolicPressure, int diastolicPressure, LocalDate datebp, String measureType){
        this.name = name;
        this.age = age;
        this.picurl = picurl;
        this.mriurl = mriurl;
        this.fieldStrength = fieldStrength;
        this.datemri = datemri;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.datebp = datebp;
        this.measureType = measureType;
    }

    public String getName() {
        return name;
    }
    public int getage() {
        return age;
    }
    public int getfieldStrength() {
        return fieldStrength;
    }
    public String getdatemri() {
        return datemri.toString();
    }
    public String getMeasureType() {
        return measureType;
    }

    public String getdatebp() {
        return datebp.toString();
    }

    public String getPicurl() {
        return picurl;
    }

    public String getMriurl() {
        return mriurl;
    }

        public int getSystolicPressure() {
        return systolicPressure;
    }

    public int getDiastolicPressure() {
        return diastolicPressure;
    }
}