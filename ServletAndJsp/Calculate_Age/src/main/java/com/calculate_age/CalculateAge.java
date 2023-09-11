package com.calculate_age;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Calculate")

public class CalculateAge extends HttpServlet {
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		System.out.print("mando");
		String dateOfBirth = req.getParameter("dateOfBirth");
		String calculationDay = req.getParameter("thisDay");
		String [] splited_dateOfBirth = dateOfBirth.split("-");
		String [] splited_calculationDay = calculationDay.split("-");
		LocalDate birthDate = LocalDate.of(Integer.parseInt(splited_dateOfBirth[0]),Integer.parseInt(splited_dateOfBirth[1]) ,Integer.parseInt(splited_dateOfBirth[2]));
		LocalDate calculationDate = LocalDate.of(Integer.parseInt(splited_calculationDay[0]),Integer.parseInt(splited_calculationDay[1]) ,Integer.parseInt(splited_calculationDay[2]));
		Period period = Period.between(birthDate, calculationDate);
		
		PrintWriter out = res.getWriter();
		out.println("Years : "+ period.getYears() + "\n" + "Months : " + period.getMonths() + "\n" + "Days : " + period.getDays());
		
	}
	

}
