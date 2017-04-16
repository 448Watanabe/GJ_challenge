package SamplePackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoshi
 */

import java.util.Date;
import java.io.Serializable;

public class ResultData implements Serializable{
    private Date d;
    private String luck;
    private boolean flag = false;
    
    // publicで引数なし
    public ResultData(){}
    
    public void setD(Date d){this.d = d;}
    
    public void setLuck(String luck){this.luck = luck;}
    
    public Date getD(){return d;}
    
    public String getLuck(){return luck;}
    
    public boolean isFlag(){return flag;}
}
