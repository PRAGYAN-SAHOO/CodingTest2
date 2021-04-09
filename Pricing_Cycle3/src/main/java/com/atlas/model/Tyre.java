package com.atlas.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tyre {
	private String tyreType;
	public String pricingDate;
	public String getPricingDate() {
		return pricingDate;
	}

	public void setPricingDate(String pricingDate) {
		this.pricingDate = pricingDate;
	}

	public String getTyreType() {
		return tyreType;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}
	private static Map<String,Double>  map= new HashMap<>();

	/*
	 * static{ map.put("tubeLess",300D); map.put("withTubes", 200D); }
	 */
	public Double getTyrePriceByTyreTypeAndDate(String tyreType,Integer monthNumber){
		
		
		if(monthNumber!=12) {
			map.put("tubeLess", 300D);
			map.put("withTube",200D);
			
		}
		else {
			map.put("tubeLess", 350D);
			map.put("withTube",250D);
			
		}
			
	return map.get(tyreType);
		
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public int getMonth(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str_date_1 = date;

		LocalDate local_date = LocalDate.parse(str_date_1, formatter);

		System.out.println(local_date);
		return local_date.getMonthValue();
	}

	public Double getPriceByTyreType(String date) {

		int monthNumber = getMonth(date);
		System.out.println("monthNumber  :: " + monthNumber);
		if (monthNumber != 12) {
			map.put("tubeLess", 300D);
			map.put("withTubes", 200D);
		} else {
			map.put("tubeLess", 350D);
			map.put("withTubes", 250D);
		}
		return null;
	}
	  
	  public Double getTyrePrice(String tyreType) {
		  return map.get(getTyreType());
	  }
	 
	public Double getTyrePrice1(String tyreType,String date) {
		Map<String,Double>  map= new HashMap<>();
		int monthNumber=getMonth(getPricingDate());
		System.out.println("monthNumber  :: "+monthNumber);
		if (monthNumber!=12 ) {
			map.put("tubeLess", 300D);
			map.put("withTubes", 200D);
		}else {
			map.put("tubeLess", 350D);
			map.put("withTubes", 250D);
		}
		return map.get(getTyreType());
	}

}
