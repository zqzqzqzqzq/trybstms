package com.bank.BSTMS.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table b_card_info
 */
public class BCardInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_card_info.cardid
     *
     * @mbg.generated
     */
    private String cardid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_card_info.identity
     *
     * @mbg.generated
     */
    private String identity;

    /**
     * Database Column Remarks:
     *   Ĭ��ֵΪ0
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_card_info.isdel
     *
     * @mbg.generated
     */
    private Integer isdel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_card_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_card_info.cardid
     *
     * @return the value of b_card_info.cardid
     *
     * @mbg.generated
     */
    public String getCardid() {
        return cardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_card_info.cardid
     *
     * @param cardid the value for b_card_info.cardid
     *
     * @mbg.generated
     */
    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_card_info.identity
     *
     * @return the value of b_card_info.identity
     *
     * @mbg.generated
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_card_info.identity
     *
     * @param identity the value for b_card_info.identity
     *
     * @mbg.generated
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_card_info.isdel
     *
     * @return the value of b_card_info.isdel
     *
     * @mbg.generated
     */
    public Integer getIsdel() {
        return isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_card_info.isdel
     *
     * @param isdel the value for b_card_info.isdel
     *
     * @mbg.generated
     */
    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}