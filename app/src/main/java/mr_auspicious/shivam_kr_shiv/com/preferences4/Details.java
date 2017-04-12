package mr_auspicious.shivam_kr_shiv.com.preferences4;


public class Details {

     String mName;
     String mPhoneno;
     String mDate;

    public Details(String name, String phoneno, String date) {
        this.mName = name;
        this.mPhoneno = phoneno;
        this.mDate = date;
    }

    public String geName() {
        return mName;
    }

    public String getPhoneno() {
        return mPhoneno;
    }

    public String getDate() {
        return mDate;
    }
}
