package com.atlas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.atlas.model.Breaks;
import com.atlas.model.Chain;
import com.atlas.model.Frame;
import com.atlas.model.HandleBar;
import com.atlas.model.Rim;
import com.atlas.model.Seat;
import com.atlas.model.Spokes;
import com.atlas.model.Tube;
import com.atlas.model.Tyre;
import com.atlas.model.Wheels;

@Service
public class AtlasCycle implements Runnable{
	
	@Autowired
	Environment env;
	
	private Frame frame;
	private Seat seat;
	private Wheels wheels;
	private Breaks breaks;
	private HandleBar handleBar;
	private Chain chain;
	private AtlasCycle cycle;
	
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public AtlasCycle getCycle() {
		return cycle;
	}
	public void setCycle(AtlasCycle cycle) {
		this.cycle = cycle;
	}
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Wheels getWheels() {
		return wheels;
	}
	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}
	public Breaks getBreaks() {
		return breaks;
	}
	public void setBreaks(Breaks breaks) {
		this.breaks = breaks;
	}
	public HandleBar getHandleBar() {
		return handleBar;
	}
	public void setHandleBar(HandleBar handleBar) {
		this.handleBar = handleBar;
	}
	public Chain getChain() {
		return chain;
	}
	public void setChain(Chain chain) {
		this.chain = chain;
	}
	
	public Double getCyclePrice(AtlasCycle cycle) {
		System.out.println("AtlasCycle.getCyclePrice()");
		System.out.println("env :: "+ getEnv());
		/*Double breakPrice = cycle.getBreaks().getBreakPrice(cycle.getBreaks().getBreakType());
		Double chainPrice = cycle.getChain().getChainPrice();
		Double framePrice = cycle.getFrame().getFramePrice(cycle.getFrame().getFrameMaterialTypes());
		Double seatPrice = cycle.getSeat().getSeatPrice(cycle.getSeat().getSeatType());
		Double rimPrice = cycle.getWheels().getRim().getRimPrice();
		Double spokesPrice = cycle.getWheels().getSpokes().getSpokesPrice();
		Double tubePrice = cycle.getWheels().getTube().getTubePrice();
		Double tyrePrice = cycle.getWheels().getTyre().getTyrePrice1(cycle.getWheels().getTyre().getTyreType(),cycle.getWheels().getTyre().getPricingDate());
		Double wheelPrice=rimPrice+spokesPrice+tubePrice+tyrePrice;
		Double handlePrice =cycle.getHandleBar().getHandlePrice(cycle.getHandleBar().getHandleType());
		Double cyclePrice=breakPrice+chainPrice+framePrice+wheelPrice+handlePrice+seatPrice;
		System.out.println("breakPrice  :: "+breakPrice);
		System.out.println("chainPrice  :: "+chainPrice);
		System.out.println("wheelPrice  :: "+wheelPrice);
		System.out.println("seatPrice  :: "+seatPrice);
		System.out.println("handlePrice  :: "+handlePrice);
		System.out.println("cyclePrice  :: "+cyclePrice);*/
//		return cyclePrice;
		return null;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	Double totalPrice=0D;
	@Override
	public void run() {
		System.out.println("AtlasCycle.run()");
		getCyclePrice(cycle);
		/*Double breakPrice = cycle.getBreaks().getBreakPrice(cycle.getBreaks().getBreakType());
		Double chainPrice = cycle.getChain().getChainPrice();
		Double framePrice = cycle.getFrame().getFramePrice(cycle.getFrame().getFrameMaterialTypes());
		Double seatPrice = cycle.getSeat().getSeatPrice(cycle.getSeat().getSeatType());
		Double rimPrice = cycle.getWheels().getRim().getRimPrice();
		Double spokesPrice = cycle.getWheels().getSpokes().getSpokesPrice();
		Double tubePrice = cycle.getWheels().getTube().getTubePrice();
		Double tyrePrice = cycle.getWheels().getTyre().getTyrePrice1(cycle.getWheels().getTyre().getTyreType(),cycle.getWheels().getTyre().getPricingDate());
		Double wheelPrice=rimPrice+spokesPrice+tubePrice+tyrePrice;
		Double handlePrice =cycle.getHandleBar().getHandlePrice(cycle.getHandleBar().getHandleType());
		Double cyclePrice=breakPrice+chainPrice+framePrice+wheelPrice+handlePrice+seatPrice;
		System.out.println("breakPrice  :: "+breakPrice);
		System.out.println("chainPrice  :: "+chainPrice);
		System.out.println("wheelPrice  :: "+wheelPrice);
		System.out.println("seatPrice  :: "+seatPrice);
		System.out.println("handlePrice  :: "+handlePrice);
		System.out.println("cyclePrice  :: "+cyclePrice);
		totalPrice+=cyclePrice;*/
		System.out.println();
	//	return cyclePrice;
	}
	
	
	
}
