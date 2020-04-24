package org.example;

public class Bank {
    private String bankcode;
    private String bankname;
    private String bankcatalog;
    private String banktype;
    private String pbccode;
    private String ccpc;
    private String dreccode;
    private String agentsettbank;
    private String suprlist;
    private String sbstitnbk;
    private String debtorcity;
    private String syscode;
    private String tel;
    private String effectdate;
    private String expdate;

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankcatalog() {
        return bankcatalog;
    }

    public void setBankcatalog(String bankcatalog) {
        this.bankcatalog = bankcatalog;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    public String getPbccode() {
        return pbccode;
    }

    public void setPbccode(String pbccode) {
        this.pbccode = pbccode;
    }

    public String getCcpc() {
        return ccpc;
    }

    public void setCcpc(String ccpc) {
        this.ccpc = ccpc;
    }

    public String getDreccode() {
        return dreccode;
    }

    public void setDreccode(String dreccode) {
        this.dreccode = dreccode;
    }

    public String getAgentsettbank() {
        return agentsettbank;
    }

    public void setAgentsettbank(String agentsettbank) {
        this.agentsettbank = agentsettbank;
    }

    public String getSuprlist() {
        return suprlist;
    }

    public void setSuprlist(String suprlist) {
        this.suprlist = suprlist;
    }

    public String getSbstitnbk() {
        return sbstitnbk;
    }

    public void setSbstitnbk(String sbstitnbk) {
        this.sbstitnbk = sbstitnbk;
    }

    public String getDebtorcity() {
        return debtorcity;
    }

    public void setDebtorcity(String debtorcity) {
        this.debtorcity = debtorcity;
    }

    public String getSyscode() {
        return syscode;
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEffectdate() {
        return effectdate;
    }

    public void setEffectdate(String effectdate) {
        this.effectdate = effectdate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankcode='" + bankcode + '\'' +
                ", bankname='" + bankname + '\'' +
                ", bankcatalog='" + bankcatalog + '\'' +
                ", banktype='" + banktype + '\'' +
                ", pbccode='" + pbccode + '\'' +
                ", ccpc='" + ccpc + '\'' +
                ", dreccode='" + dreccode + '\'' +
                ", agentsettbank='" + agentsettbank + '\'' +
                ", suprlist='" + suprlist + '\'' +
                ", sbstitnbk='" + sbstitnbk + '\'' +
                ", debtorcity='" + debtorcity + '\'' +
                ", syscode='" + syscode + '\'' +
                ", tel='" + tel + '\'' +
                ", effectdate='" + effectdate + '\'' +
                ", expdate='" + expdate + '\'' +
                '}';
    }
}
