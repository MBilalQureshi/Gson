package com.example.mhassan.gson.models;

/**
 * Created by M.Hassan on 8/1/2017.
 */

/*public class ClsCountryCurrency {
}*/

//package com.example.abdul_wahab.networkingsummer17.models;

    import com.google.gson.annotations.Expose;
    import com.google.gson.annotations.SerializedName;

    public class ClsCountryCurrency {


    @Expose
    private Integer id;


    @SerializedName("c_name")
    @Expose
    private String cName;

    @SerializedName("c_code")
    @Expose
    private String cCode;

    @Expose
    private String currencyrate;

    @Expose
    private String flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCCode() {
        return cCode;
    }

    public void setCCode(String cCode) {
        this.cCode = cCode;
    }

    public String getCurrencyrate() {
        return currencyrate;
    }

    public void setCurrencyrate(String currencyrate) {
        this.currencyrate = currencyrate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

}

