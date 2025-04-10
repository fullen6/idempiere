/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for T_InvoiceGL
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="T_InvoiceGL")
public class X_T_InvoiceGL extends PO implements I_T_InvoiceGL, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_T_InvoiceGL (Properties ctx, int T_InvoiceGL_ID, String trxName)
    {
      super (ctx, T_InvoiceGL_ID, trxName);
      /** if (T_InvoiceGL_ID == 0)
        {
			setAD_PInstance_ID (0);
			setAmtAcctBalance (Env.ZERO);
			setAmtRevalCr (Env.ZERO);
			setAmtRevalCrDiff (Env.ZERO);
			setAmtRevalDr (Env.ZERO);
			setAmtRevalDrDiff (Env.ZERO);
			setAmtSourceBalance (Env.ZERO);
			setC_ConversionTypeReval_ID (0);
			setC_Invoice_ID (0);
			setDateReval (new Timestamp( System.currentTimeMillis() ));
			setFact_Acct_ID (0);
			setGrandTotal (Env.ZERO);
			setIsAllCurrencies (false);
			setOpenAmt (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_T_InvoiceGL (Properties ctx, int T_InvoiceGL_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, T_InvoiceGL_ID, trxName, virtualColumns);
      /** if (T_InvoiceGL_ID == 0)
        {
			setAD_PInstance_ID (0);
			setAmtAcctBalance (Env.ZERO);
			setAmtRevalCr (Env.ZERO);
			setAmtRevalCrDiff (Env.ZERO);
			setAmtRevalDr (Env.ZERO);
			setAmtRevalDrDiff (Env.ZERO);
			setAmtSourceBalance (Env.ZERO);
			setC_ConversionTypeReval_ID (0);
			setC_Invoice_ID (0);
			setDateReval (new Timestamp( System.currentTimeMillis() ));
			setFact_Acct_ID (0);
			setGrandTotal (Env.ZERO);
			setIsAllCurrencies (false);
			setOpenAmt (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_T_InvoiceGL (Properties ctx, String T_InvoiceGL_UU, String trxName)
    {
      super (ctx, T_InvoiceGL_UU, trxName);
      /** if (T_InvoiceGL_UU == null)
        {
			setAD_PInstance_ID (0);
			setAmtAcctBalance (Env.ZERO);
			setAmtRevalCr (Env.ZERO);
			setAmtRevalCrDiff (Env.ZERO);
			setAmtRevalDr (Env.ZERO);
			setAmtRevalDrDiff (Env.ZERO);
			setAmtSourceBalance (Env.ZERO);
			setC_ConversionTypeReval_ID (0);
			setC_Invoice_ID (0);
			setDateReval (new Timestamp( System.currentTimeMillis() ));
			setFact_Acct_ID (0);
			setGrandTotal (Env.ZERO);
			setIsAllCurrencies (false);
			setOpenAmt (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_T_InvoiceGL (Properties ctx, String T_InvoiceGL_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, T_InvoiceGL_UU, trxName, virtualColumns);
      /** if (T_InvoiceGL_UU == null)
        {
			setAD_PInstance_ID (0);
			setAmtAcctBalance (Env.ZERO);
			setAmtRevalCr (Env.ZERO);
			setAmtRevalCrDiff (Env.ZERO);
			setAmtRevalDr (Env.ZERO);
			setAmtRevalDrDiff (Env.ZERO);
			setAmtSourceBalance (Env.ZERO);
			setC_ConversionTypeReval_ID (0);
			setC_Invoice_ID (0);
			setDateReval (new Timestamp( System.currentTimeMillis() ));
			setFact_Acct_ID (0);
			setGrandTotal (Env.ZERO);
			setIsAllCurrencies (false);
			setOpenAmt (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_T_InvoiceGL (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_T_InvoiceGL[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_PInstance getAD_PInstance() throws RuntimeException
	{
		return (org.compiere.model.I_AD_PInstance)MTable.get(getCtx(), org.compiere.model.I_AD_PInstance.Table_ID)
			.getPO(getAD_PInstance_ID(), get_TrxName());
	}

	/** Set Process Instance.
		@param AD_PInstance_ID Instance of the process
	*/
	public void setAD_PInstance_ID (int AD_PInstance_ID)
	{
		if (AD_PInstance_ID < 1)
			set_Value (COLUMNNAME_AD_PInstance_ID, null);
		else
			set_Value (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
	}

	/** Get Process Instance.
		@return Instance of the process
	  */
	public int getAD_PInstance_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** APAR AD_Reference_ID=332 */
	public static final int APAR_AD_Reference_ID=332;
	/** Receivables &amp; Payables = A */
	public static final String APAR_ReceivablesPayables = "A";
	/** Payables only = P */
	public static final String APAR_PayablesOnly = "P";
	/** Receivables only = R */
	public static final String APAR_ReceivablesOnly = "R";
	/** Set AP - AR.
		@param APAR Include Receivables and/or Payables transactions
	*/
	public void setAPAR (String APAR)
	{

		set_Value (COLUMNNAME_APAR, APAR);
	}

	/** Get AP - AR.
		@return Include Receivables and/or Payables transactions
	  */
	public String getAPAR()
	{
		return (String)get_Value(COLUMNNAME_APAR);
	}

	/** Set Accounted Balance.
		@param AmtAcctBalance Accounted Balance Amount
	*/
	public void setAmtAcctBalance (BigDecimal AmtAcctBalance)
	{
		set_Value (COLUMNNAME_AmtAcctBalance, AmtAcctBalance);
	}

	/** Get Accounted Balance.
		@return Accounted Balance Amount
	  */
	public BigDecimal getAmtAcctBalance()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctBalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Revaluated Amount Cr.
		@param AmtRevalCr Revaluated Cr Amount
	*/
	public void setAmtRevalCr (BigDecimal AmtRevalCr)
	{
		set_Value (COLUMNNAME_AmtRevalCr, AmtRevalCr);
	}

	/** Get Revaluated Amount Cr.
		@return Revaluated Cr Amount
	  */
	public BigDecimal getAmtRevalCr()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtRevalCr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Revaluated Difference Cr.
		@param AmtRevalCrDiff Revaluated Cr Amount Difference
	*/
	public void setAmtRevalCrDiff (BigDecimal AmtRevalCrDiff)
	{
		set_Value (COLUMNNAME_AmtRevalCrDiff, AmtRevalCrDiff);
	}

	/** Get Revaluated Difference Cr.
		@return Revaluated Cr Amount Difference
	  */
	public BigDecimal getAmtRevalCrDiff()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtRevalCrDiff);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Revaluated Amount Dr.
		@param AmtRevalDr Revaluated Dr Amount
	*/
	public void setAmtRevalDr (BigDecimal AmtRevalDr)
	{
		set_Value (COLUMNNAME_AmtRevalDr, AmtRevalDr);
	}

	/** Get Revaluated Amount Dr.
		@return Revaluated Dr Amount
	  */
	public BigDecimal getAmtRevalDr()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtRevalDr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Revaluated Difference Dr.
		@param AmtRevalDrDiff Revaluated Dr Amount Difference
	*/
	public void setAmtRevalDrDiff (BigDecimal AmtRevalDrDiff)
	{
		set_Value (COLUMNNAME_AmtRevalDrDiff, AmtRevalDrDiff);
	}

	/** Get Revaluated Difference Dr.
		@return Revaluated Dr Amount Difference
	  */
	public BigDecimal getAmtRevalDrDiff()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtRevalDrDiff);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Source Balance.
		@param AmtSourceBalance Source Balance Amount
	*/
	public void setAmtSourceBalance (BigDecimal AmtSourceBalance)
	{
		set_Value (COLUMNNAME_AmtSourceBalance, AmtSourceBalance);
	}

	/** Get Source Balance.
		@return Source Balance Amount
	  */
	public BigDecimal getAmtSourceBalance()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceBalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_ConversionType getC_ConversionTypeReval() throws RuntimeException
	{
		return (org.compiere.model.I_C_ConversionType)MTable.get(getCtx(), org.compiere.model.I_C_ConversionType.Table_ID)
			.getPO(getC_ConversionTypeReval_ID(), get_TrxName());
	}

	/** Set Revaluation Conversion Type.
		@param C_ConversionTypeReval_ID Revaluation Currency Conversion Type
	*/
	public void setC_ConversionTypeReval_ID (int C_ConversionTypeReval_ID)
	{
		if (C_ConversionTypeReval_ID < 1)
			set_Value (COLUMNNAME_C_ConversionTypeReval_ID, null);
		else
			set_Value (COLUMNNAME_C_ConversionTypeReval_ID, Integer.valueOf(C_ConversionTypeReval_ID));
	}

	/** Get Revaluation Conversion Type.
		@return Revaluation Currency Conversion Type
	  */
	public int getC_ConversionTypeReval_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionTypeReval_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_DocType getC_DocTypeReval() throws RuntimeException
	{
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_ID)
			.getPO(getC_DocTypeReval_ID(), get_TrxName());
	}

	/** Set Revaluation Document Type.
		@param C_DocTypeReval_ID Document Type for Revaluation Journal
	*/
	public void setC_DocTypeReval_ID (int C_DocTypeReval_ID)
	{
		if (C_DocTypeReval_ID < 1)
			set_Value (COLUMNNAME_C_DocTypeReval_ID, null);
		else
			set_Value (COLUMNNAME_C_DocTypeReval_ID, Integer.valueOf(C_DocTypeReval_ID));
	}

	/** Get Revaluation Document Type.
		@return Document Type for Revaluation Journal
	  */
	public int getC_DocTypeReval_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeReval_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException
	{
		return (org.compiere.model.I_C_Invoice)MTable.get(getCtx(), org.compiere.model.I_C_Invoice.Table_ID)
			.getPO(getC_Invoice_ID(), get_TrxName());
	}

	/** Set Invoice.
		@param C_Invoice_ID Invoice Identifier
	*/
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		if (C_Invoice_ID < 1)
			set_Value (COLUMNNAME_C_Invoice_ID, null);
		else
			set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
	}

	/** Get Invoice.
		@return Invoice Identifier
	  */
	public int getC_Invoice_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Revaluation Date.
		@param DateReval Date of Revaluation
	*/
	public void setDateReval (Timestamp DateReval)
	{
		set_Value (COLUMNNAME_DateReval, DateReval);
	}

	/** Get Revaluation Date.
		@return Date of Revaluation
	  */
	public Timestamp getDateReval()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateReval);
	}

	/** Set Accounting Fact.
		@param Fact_Acct_ID Accounting Fact
	*/
	public void setFact_Acct_ID (int Fact_Acct_ID)
	{
		if (Fact_Acct_ID < 1)
			set_ValueNoCheck (COLUMNNAME_Fact_Acct_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_Fact_Acct_ID, Integer.valueOf(Fact_Acct_ID));
	}

	/** Get Accounting Fact.
		@return Accounting Fact	  */
	public int getFact_Acct_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Fact_Acct_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Grand Total.
		@param GrandTotal Total amount of document
	*/
	public void setGrandTotal (BigDecimal GrandTotal)
	{
		set_Value (COLUMNNAME_GrandTotal, GrandTotal);
	}

	/** Get Grand Total.
		@return Total amount of document
	  */
	public BigDecimal getGrandTotal()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Include All Currencies.
		@param IsAllCurrencies Report not just foreign currency Invoices
	*/
	public void setIsAllCurrencies (boolean IsAllCurrencies)
	{
		set_Value (COLUMNNAME_IsAllCurrencies, Boolean.valueOf(IsAllCurrencies));
	}

	/** Get Include All Currencies.
		@return Report not just foreign currency Invoices
	  */
	public boolean isAllCurrencies()
	{
		Object oo = get_Value(COLUMNNAME_IsAllCurrencies);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Open Amount.
		@param OpenAmt Open item amount
	*/
	public void setOpenAmt (BigDecimal OpenAmt)
	{
		set_Value (COLUMNNAME_OpenAmt, OpenAmt);
	}

	/** Get Open Amount.
		@return Open item amount
	  */
	public BigDecimal getOpenAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OpenAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Percent.
		@param Percent Percentage
	*/
	public void setPercent (BigDecimal Percent)
	{
		set_Value (COLUMNNAME_Percent, Percent);
	}

	/** Get Percent.
		@return Percentage
	  */
	public BigDecimal getPercent()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percent);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set T_InvoiceGL_UU.
		@param T_InvoiceGL_UU T_InvoiceGL_UU
	*/
	public void setT_InvoiceGL_UU (String T_InvoiceGL_UU)
	{
		set_Value (COLUMNNAME_T_InvoiceGL_UU, T_InvoiceGL_UU);
	}

	/** Get T_InvoiceGL_UU.
		@return T_InvoiceGL_UU	  */
	public String getT_InvoiceGL_UU()
	{
		return (String)get_Value(COLUMNNAME_T_InvoiceGL_UU);
	}
}